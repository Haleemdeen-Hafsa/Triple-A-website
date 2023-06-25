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

package com.product.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.product.service.model.Products;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Products in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ProductsCacheModel
	implements CacheModel<Products>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ProductsCacheModel)) {
			return false;
		}

		ProductsCacheModel productsCacheModel = (ProductsCacheModel)object;

		if (productsId == productsCacheModel.productsId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, productsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", productsId=");
		sb.append(productsId);
		sb.append(", serviceName=");
		sb.append(serviceName);
		sb.append(", serviceDes=");
		sb.append(serviceDes);
		sb.append(", servicePrice=");
		sb.append(servicePrice);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Products toEntityModel() {
		ProductsImpl productsImpl = new ProductsImpl();

		if (uuid == null) {
			productsImpl.setUuid("");
		}
		else {
			productsImpl.setUuid(uuid);
		}

		productsImpl.setProductsId(productsId);

		if (serviceName == null) {
			productsImpl.setServiceName("");
		}
		else {
			productsImpl.setServiceName(serviceName);
		}

		if (serviceDes == null) {
			productsImpl.setServiceDes("");
		}
		else {
			productsImpl.setServiceDes(serviceDes);
		}

		if (servicePrice == null) {
			productsImpl.setServicePrice("");
		}
		else {
			productsImpl.setServicePrice(servicePrice);
		}

		productsImpl.setGroupId(groupId);
		productsImpl.setCompanyId(companyId);
		productsImpl.setUserId(userId);

		if (userName == null) {
			productsImpl.setUserName("");
		}
		else {
			productsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			productsImpl.setCreateDate(null);
		}
		else {
			productsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			productsImpl.setModifiedDate(null);
		}
		else {
			productsImpl.setModifiedDate(new Date(modifiedDate));
		}

		productsImpl.resetOriginalValues();

		return productsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		productsId = objectInput.readLong();
		serviceName = objectInput.readUTF();
		serviceDes = objectInput.readUTF();
		servicePrice = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(productsId);

		if (serviceName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(serviceName);
		}

		if (serviceDes == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(serviceDes);
		}

		if (servicePrice == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(servicePrice);
		}

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long productsId;
	public String serviceName;
	public String serviceDes;
	public String servicePrice;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;

}