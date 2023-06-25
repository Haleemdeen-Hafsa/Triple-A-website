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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;SP_Products&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Products
 * @generated
 */
public class ProductsTable extends BaseTable<ProductsTable> {

	public static final ProductsTable INSTANCE = new ProductsTable();

	public final Column<ProductsTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProductsTable, Long> productsId = createColumn(
		"productsId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ProductsTable, String> serviceName = createColumn(
		"serviceName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProductsTable, String> serviceDes = createColumn(
		"serviceDes", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProductsTable, String> servicePrice = createColumn(
		"servicePrice", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProductsTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ProductsTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ProductsTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ProductsTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProductsTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ProductsTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private ProductsTable() {
		super("SP_Products", ProductsTable::new);
	}

}