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
import com.product.service.model.Customer;
import com.product.service.service.base.CustomerLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.product.service.model.Customer",
	service = AopService.class
)
public class CustomerLocalServiceImpl extends CustomerLocalServiceBaseImpl {
	
	public List<Customer> getCustomer(int start, int end){
		return customerPersistence.findAll(start, end);
	}
	
	public Customer addCustomer(String customerName, String customerEmail, String customerAddress,
			String customerValidId, String customerConNo, long productsId, ServiceContext serviceContext) throws SystemException, PortalException{
		
		//Website Instanc Id
		long groupId = serviceContext.getScopeGroupId();
		
		//Company
		long companyId = serviceContext.getCompanyId();
		
		//Date Created
		Date now = new Date();
		
		//Auto Increment product Id 
		long customerId = CounterLocalServiceUtil.increment();
		
		//Product
		Customer customer = customerPersistence.create(customerId);
		
		//Setting the Values
		customer.setUuid(serviceContext.getUuid());
		customer.setCustomerName(customerName);
		customer.setCustomerEmail(customerEmail);
		customer.setCustomerAddress(customerAddress);
		customer.setCustomerValidId(customerValidId);
		customer.setCustomerConNo(customerConNo);
		customer.setCreateDate(serviceContext.getCreateDate(now));
		customer.setGroupId(groupId);
		customer.setCompanyId(companyId);
		customer.setProductsId(productsId);
		customer.setExpandoBridgeAttributes(serviceContext);
		
		//save to the database
		customerPersistence.update(customer);
		
		System.out.println("New Customer has been added! Id No: " + customerId);
		
		return customer;
	}
}