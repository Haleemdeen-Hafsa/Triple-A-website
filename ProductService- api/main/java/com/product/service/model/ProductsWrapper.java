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

package com.product.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Products}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Products
 * @generated
 */
public class ProductsWrapper
	extends BaseModelWrapper<Products>
	implements ModelWrapper<Products>, Products {

	public ProductsWrapper(Products products) {
		super(products);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("productsId", getProductsId());
		attributes.put("serviceName", getServiceName());
		attributes.put("serviceDes", getServiceDes());
		attributes.put("servicePrice", getServicePrice());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long productsId = (Long)attributes.get("productsId");

		if (productsId != null) {
			setProductsId(productsId);
		}

		String serviceName = (String)attributes.get("serviceName");

		if (serviceName != null) {
			setServiceName(serviceName);
		}

		String serviceDes = (String)attributes.get("serviceDes");

		if (serviceDes != null) {
			setServiceDes(serviceDes);
		}

		String servicePrice = (String)attributes.get("servicePrice");

		if (servicePrice != null) {
			setServicePrice(servicePrice);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public Products cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this products.
	 *
	 * @return the company ID of this products
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this products.
	 *
	 * @return the create date of this products
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this products.
	 *
	 * @return the group ID of this products
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this products.
	 *
	 * @return the modified date of this products
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this products.
	 *
	 * @return the primary key of this products
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the products ID of this products.
	 *
	 * @return the products ID of this products
	 */
	@Override
	public long getProductsId() {
		return model.getProductsId();
	}

	/**
	 * Returns the service des of this products.
	 *
	 * @return the service des of this products
	 */
	@Override
	public String getServiceDes() {
		return model.getServiceDes();
	}

	/**
	 * Returns the service name of this products.
	 *
	 * @return the service name of this products
	 */
	@Override
	public String getServiceName() {
		return model.getServiceName();
	}

	/**
	 * Returns the service price of this products.
	 *
	 * @return the service price of this products
	 */
	@Override
	public String getServicePrice() {
		return model.getServicePrice();
	}

	/**
	 * Returns the user ID of this products.
	 *
	 * @return the user ID of this products
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this products.
	 *
	 * @return the user name of this products
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this products.
	 *
	 * @return the user uuid of this products
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this products.
	 *
	 * @return the uuid of this products
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this products.
	 *
	 * @param companyId the company ID of this products
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this products.
	 *
	 * @param createDate the create date of this products
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this products.
	 *
	 * @param groupId the group ID of this products
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this products.
	 *
	 * @param modifiedDate the modified date of this products
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this products.
	 *
	 * @param primaryKey the primary key of this products
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the products ID of this products.
	 *
	 * @param productsId the products ID of this products
	 */
	@Override
	public void setProductsId(long productsId) {
		model.setProductsId(productsId);
	}

	/**
	 * Sets the service des of this products.
	 *
	 * @param serviceDes the service des of this products
	 */
	@Override
	public void setServiceDes(String serviceDes) {
		model.setServiceDes(serviceDes);
	}

	/**
	 * Sets the service name of this products.
	 *
	 * @param serviceName the service name of this products
	 */
	@Override
	public void setServiceName(String serviceName) {
		model.setServiceName(serviceName);
	}

	/**
	 * Sets the service price of this products.
	 *
	 * @param servicePrice the service price of this products
	 */
	@Override
	public void setServicePrice(String servicePrice) {
		model.setServicePrice(servicePrice);
	}

	/**
	 * Sets the user ID of this products.
	 *
	 * @param userId the user ID of this products
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this products.
	 *
	 * @param userName the user name of this products
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this products.
	 *
	 * @param userUuid the user uuid of this products
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this products.
	 *
	 * @param uuid the uuid of this products
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected ProductsWrapper wrap(Products products) {
		return new ProductsWrapper(products);
	}

}