package com.product.portlet.portlet;

import com.product.portlet.constants.ProductPortletKeys;
import com.product.service.model.Products;
import com.product.service.service.CustomerLocalServiceUtil;
import com.product.service.service.ProductsLocalServiceUtil;
import com.product.service.model.Customer;

import java.io.IOException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author Acer
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Product",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ProductPortletKeys.PRODUCT,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ProductPortlet extends MVCPortlet {
	public void addService(ActionRequest actionRequest, ActionResponse actionResponse) throws
		PortalException, IOException{
		
		long productsId = ParamUtil.getLong(actionRequest, "productsId");
		String serviceName = ParamUtil.getString(actionRequest, "serviceName");
		String serviceDes = ParamUtil.getString(actionRequest, "serviceDes");
		String servicePrice = ParamUtil.getString(actionRequest, "servicePrice");
		
		Products products;
		
		if(productsId>0) {
			products = ProductsLocalServiceUtil.getProducts(productsId);
			
			products.setServiceName(serviceName);
			products.setServiceDes(serviceDes);
			products.setServicePrice(servicePrice);
			
			ProductsLocalServiceUtil.updateProducts(products);
			
			System.out.println("Updated Service Id " + productsId);
		}
		
		else {
			try {
				ServiceContext serviceContext = ServiceContextFactory.getInstance(Products.class.getName(), actionRequest);
				ProductsLocalServiceUtil.addProducts(serviceName, serviceDes, servicePrice, serviceContext);
				
			
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		sendRedirect(actionRequest, actionResponse);
	}
	
	public void deleteService(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException,
		IOException{
		long productsId = ParamUtil.getLong(actionRequest, "ProductsId");
		
		ProductsLocalServiceUtil.deleteProducts(productsId);
		
		sendRedirect(actionRequest, actionResponse); 
	}
	
	public void addCustomer(ActionRequest actionRequest, ActionResponse actionResponse) throws
	PortalException, IOException{
	
	long customerId = ParamUtil.getLong(actionRequest, "customerId");
	String customerName = ParamUtil.getString(actionRequest, "customerName");
	String customerEmail = ParamUtil.getString(actionRequest, "customerEmail");
	String customerAddress = ParamUtil.getString(actionRequest, "customerAddress");
	String customerValidId = ParamUtil.getString(actionRequest, "customerValidId");
	String customerConNo = ParamUtil.getString(actionRequest, "customerConNo");
	long productsId = ParamUtil.getLong(actionRequest, "productId");
	
	Customer customer;
	
	if(customerId>0) {
		customer = CustomerLocalServiceUtil.getCustomer(customerId);
		
		customer.setCustomerName(customerName);
		customer.setCustomerEmail(customerEmail);
		customer.setCustomerAddress(customerAddress);
		customer.setCustomerAddress(customerAddress);
		customer.setCustomerValidId(customerValidId);
		customer.setCustomerConNo(customerConNo);
		customer.setProductsId(productsId);
		
		CustomerLocalServiceUtil.updateCustomer(customer);
		
		System.out.println("Updated Customer Id " + customerId);
	}
	
	else {
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(Customer.class.getName(), actionRequest);
			CustomerLocalServiceUtil.addCustomer(customerName, customerEmail, customerAddress, customerValidId, customerConNo, productsId,  serviceContext);
			
		
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	sendRedirect(actionRequest, actionResponse);
}
	public void deleteCustomer(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException,
	IOException{
		long customerId = ParamUtil.getLong(actionRequest, "customerId");
		
		CustomerLocalServiceUtil.deleteCustomer(customerId);
		
		sendRedirect(actionRequest, actionResponse); 
	}
	
}