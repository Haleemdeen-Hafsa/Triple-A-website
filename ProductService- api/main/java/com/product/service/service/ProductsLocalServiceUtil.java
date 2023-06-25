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

package com.product.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.product.service.model.Products;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Products. This utility wraps
 * <code>com.product.service.service.impl.ProductsLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ProductsLocalService
 * @generated
 */
public class ProductsLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.product.service.service.impl.ProductsLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the products to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param products the products
	 * @return the products that was added
	 */
	public static Products addProducts(Products products) {
		return getService().addProducts(products);
	}

	public static Products addProducts(
			String serviceName, String serviceDes, String servicePrice,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException, SystemException {

		return getService().addProducts(
			serviceName, serviceDes, servicePrice, serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new products with the primary key. Does not add the products to the database.
	 *
	 * @param productsId the primary key for the new products
	 * @return the new products
	 */
	public static Products createProducts(long productsId) {
		return getService().createProducts(productsId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the products with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productsId the primary key of the products
	 * @return the products that was removed
	 * @throws PortalException if a products with the primary key could not be found
	 */
	public static Products deleteProducts(long productsId)
		throws PortalException {

		return getService().deleteProducts(productsId);
	}

	/**
	 * Deletes the products from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param products the products
	 * @return the products that was removed
	 */
	public static Products deleteProducts(Products products) {
		return getService().deleteProducts(products);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.product.service.model.impl.ProductsModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.product.service.model.impl.ProductsModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Products fetchProducts(long productsId) {
		return getService().fetchProducts(productsId);
	}

	/**
	 * Returns the products matching the UUID and group.
	 *
	 * @param uuid the products's UUID
	 * @param groupId the primary key of the group
	 * @return the matching products, or <code>null</code> if a matching products could not be found
	 */
	public static Products fetchProductsByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchProductsByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static List<Products> getProduct(long productsId) {
		return getService().getProduct(productsId);
	}

	public static List<Products> getProducts(int start, int end) {
		return getService().getProducts(start, end);
	}

	/**
	 * Returns the products with the primary key.
	 *
	 * @param productsId the primary key of the products
	 * @return the products
	 * @throws PortalException if a products with the primary key could not be found
	 */
	public static Products getProducts(long productsId) throws PortalException {
		return getService().getProducts(productsId);
	}

	/**
	 * Returns the products matching the UUID and group.
	 *
	 * @param uuid the products's UUID
	 * @param groupId the primary key of the group
	 * @return the matching products
	 * @throws PortalException if a matching products could not be found
	 */
	public static Products getProductsByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getProductsByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the productses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.product.service.model.impl.ProductsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of productses
	 * @param end the upper bound of the range of productses (not inclusive)
	 * @return the range of productses
	 */
	public static List<Products> getProductses(int start, int end) {
		return getService().getProductses(start, end);
	}

	/**
	 * Returns all the productses matching the UUID and company.
	 *
	 * @param uuid the UUID of the productses
	 * @param companyId the primary key of the company
	 * @return the matching productses, or an empty list if no matches were found
	 */
	public static List<Products> getProductsesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getProductsesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of productses matching the UUID and company.
	 *
	 * @param uuid the UUID of the productses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of productses
	 * @param end the upper bound of the range of productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching productses, or an empty list if no matches were found
	 */
	public static List<Products> getProductsesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Products> orderByComparator) {

		return getService().getProductsesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of productses.
	 *
	 * @return the number of productses
	 */
	public static int getProductsesCount() {
		return getService().getProductsesCount();
	}

	/**
	 * Updates the products in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param products the products
	 * @return the products that was updated
	 */
	public static Products updateProducts(Products products) {
		return getService().updateProducts(products);
	}

	public static ProductsLocalService getService() {
		return _service;
	}

	private static volatile ProductsLocalService _service;

}