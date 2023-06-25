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

import com.product.service.model.Customer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Customer in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CustomerCacheModel
	implements CacheModel<Customer>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CustomerCacheModel)) {
			return false;
		}

		CustomerCacheModel customerCacheModel = (CustomerCacheModel)object;

		if (customerId == customerCacheModel.customerId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, customerId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", customerId=");
		sb.append(customerId);
		sb.append(", customerName=");
		sb.append(customerName);
		sb.append(", customerEmail=");
		sb.append(customerEmail);
		sb.append(", customerAddress=");
		sb.append(customerAddress);
		sb.append(", customerValidId=");
		sb.append(customerValidId);
		sb.append(", customerConNo=");
		sb.append(customerConNo);
		sb.append(", productsId=");
		sb.append(productsId);
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
	public Customer toEntityModel() {
		CustomerImpl customerImpl = new CustomerImpl();

		if (uuid == null) {
			customerImpl.setUuid("");
		}
		else {
			customerImpl.setUuid(uuid);
		}

		customerImpl.setCustomerId(customerId);

		if (customerName == null) {
			customerImpl.setCustomerName("");
		}
		else {
			customerImpl.setCustomerName(customerName);
		}

		if (customerEmail == null) {
			customerImpl.setCustomerEmail("");
		}
		else {
			customerImpl.setCustomerEmail(customerEmail);
		}

		if (customerAddress == null) {
			customerImpl.setCustomerAddress("");
		}
		else {
			customerImpl.setCustomerAddress(customerAddress);
		}

		if (customerValidId == null) {
			customerImpl.setCustomerValidId("");
		}
		else {
			customerImpl.setCustomerValidId(customerValidId);
		}

		if (customerConNo == null) {
			customerImpl.setCustomerConNo("");
		}
		else {
			customerImpl.setCustomerConNo(customerConNo);
		}

		customerImpl.setProductsId(productsId);
		customerImpl.setGroupId(groupId);
		customerImpl.setCompanyId(companyId);
		customerImpl.setUserId(userId);

		if (userName == null) {
			customerImpl.setUserName("");
		}
		else {
			customerImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			customerImpl.setCreateDate(null);
		}
		else {
			customerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			customerImpl.setModifiedDate(null);
		}
		else {
			customerImpl.setModifiedDate(new Date(modifiedDate));
		}

		customerImpl.resetOriginalValues();

		return customerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		customerId = objectInput.readLong();
		customerName = objectInput.readUTF();
		customerEmail = objectInput.readUTF();
		customerAddress = objectInput.readUTF();
		customerValidId = objectInput.readUTF();
		customerConNo = objectInput.readUTF();

		productsId = objectInput.readLong();

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

		objectOutput.writeLong(customerId);

		if (customerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customerName);
		}

		if (customerEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customerEmail);
		}

		if (customerAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customerAddress);
		}

		if (customerValidId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customerValidId);
		}

		if (customerConNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customerConNo);
		}

		objectOutput.writeLong(productsId);

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
	public long customerId;
	public String customerName;
	public String customerEmail;
	public String customerAddress;
	public String customerValidId;
	public String customerConNo;
	public long productsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;

}