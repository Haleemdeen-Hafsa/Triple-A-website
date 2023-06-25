/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.product.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;
import com.product.service.exception.ServiceNameException;
import com.product.service.exception.ServicePriceException;
import com.product.service.model.Products;
import com.product.service.service.base.ProductsLocalServiceBaseImpl;
import com.product.service.service.persistence.ProductsPersistence;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.product.service.model.Products",
	service = AopService.class
)
public class ProductsLocalServiceImpl extends ProductsLocalServiceBaseImpl {
	
	protected void validate(String ServiceName, String ServicePrice) throws ServiceNameException, ServicePriceException {
		if(Validator.isNull(ServiceName)) {
			throw new ServiceNameException();
		} else if(Validator.isNull(ServicePrice)) {
			throw new ServicePriceException();
		}
	}
	
	public List<Products> getProduct(long productsId){
		return productsPersistence.findByProductFinder(productsId);
	}
	
	public List<Products> getProducts(int start, int end){
		return productsPersistence.findAll(start, end);
	}
	
	public Products addProducts(String serviceName, String serviceDes, String servicePrice,
			ServiceContext serviceContext) throws SystemException, PortalException{
		
		//Website Instanc Id
		long groupId = serviceContext.getScopeGroupId();
		
		//Company
		long companyId = serviceContext.getCompanyId();
		
		//Date Created
		Date now = new Date();
		
		//Auto Increment product Id 
		long productsId = CounterLocalServiceUtil.increment();
		
		//Product
		Products products = productsPersistence.create(productsId);
		
		//Setting the Values
		products.setUuid(serviceContext.getUuid());
		products.setServiceName(serviceName);
		products.setServiceDes(serviceDes);
		products.setServicePrice(servicePrice);
		products.setCreateDate(serviceContext.getCreateDate(now));
		products.setGroupId(groupId);
		products.setCompanyId(companyId);
		products.setExpandoBridgeAttributes(serviceContext);
		
		//save to the database
		productsPersistence.update(products);
		
		System.out.println("New Service has been added! Id No: " + productsId);
		
		return products;
	}
	
	
}