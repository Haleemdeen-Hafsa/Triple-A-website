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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProductsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProductsLocalService
 * @generated
 */
public class ProductsLocalServiceWrapper
	implements ProductsLocalService, ServiceWrapper<ProductsLocalService> {

	public ProductsLocalServiceWrapper() {
		this(null);
	}

	public ProductsLocalServiceWrapper(
		ProductsLocalService productsLocalService) {

		_productsLocalService = productsLocalService;
	}

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
	@Override
	public com.product.service.model.Products addProducts(
		com.product.service.model.Products products) {

		return _productsLocalService.addProducts(products);
	}

	@Override
	public com.product.service.model.Products addProducts(
			String serviceName, String serviceDes, String servicePrice,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _productsLocalService.addProducts(
			serviceName, serviceDes, servicePrice, serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productsLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new products with the primary key. Does not add the products to the database.
	 *
	 * @param productsId the primary key for the new products
	 * @return the new products
	 */
	@Override
	public com.product.service.model.Products createProducts(long productsId) {
		return _productsLocalService.createProducts(productsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productsLocalService.deletePersistedModel(persistedModel);
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
	@Override
	public com.product.service.model.Products deleteProducts(long productsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productsLocalService.deleteProducts(productsId);
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
	@Override
	public com.product.service.model.Products deleteProducts(
		com.product.service.model.Products products) {

		return _productsLocalService.deleteProducts(products);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _productsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _productsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _productsLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _productsLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _productsLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _productsLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _productsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _productsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.product.service.model.Products fetchProducts(long productsId) {
		return _productsLocalService.fetchProducts(productsId);
	}

	/**
	 * Returns the products matching the UUID and group.
	 *
	 * @param uuid the products's UUID
	 * @param groupId the primary key of the group
	 * @return the matching products, or <code>null</code> if a matching products could not be found
	 */
	@Override
	public com.product.service.model.Products fetchProductsByUuidAndGroupId(
		String uuid, long groupId) {

		return _productsLocalService.fetchProductsByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _productsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _productsLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _productsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _productsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productsLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public java.util.List<com.product.service.model.Products> getProduct(
		long productsId) {

		return _productsLocalService.getProduct(productsId);
	}

	@Override
	public java.util.List<com.product.service.model.Products> getProducts(
		int start, int end) {

		return _productsLocalService.getProducts(start, end);
	}

	/**
	 * Returns the products with the primary key.
	 *
	 * @param productsId the primary key of the products
	 * @return the products
	 * @throws PortalException if a products with the primary key could not be found
	 */
	@Override
	public com.product.service.model.Products getProducts(long productsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productsLocalService.getProducts(productsId);
	}

	/**
	 * Returns the products matching the UUID and group.
	 *
	 * @param uuid the products's UUID
	 * @param groupId the primary key of the group
	 * @return the matching products
	 * @throws PortalException if a matching products could not be found
	 */
	@Override
	public com.product.service.model.Products getProductsByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productsLocalService.getProductsByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<com.product.service.model.Products> getProductses(
		int start, int end) {

		return _productsLocalService.getProductses(start, end);
	}

	/**
	 * Returns all the productses matching the UUID and company.
	 *
	 * @param uuid the UUID of the productses
	 * @param companyId the primary key of the company
	 * @return the matching productses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.product.service.model.Products>
		getProductsesByUuidAndCompanyId(String uuid, long companyId) {

		return _productsLocalService.getProductsesByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.product.service.model.Products>
		getProductsesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.product.service.model.Products> orderByComparator) {

		return _productsLocalService.getProductsesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of productses.
	 *
	 * @return the number of productses
	 */
	@Override
	public int getProductsesCount() {
		return _productsLocalService.getProductsesCount();
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
	@Override
	public com.product.service.model.Products updateProducts(
		com.product.service.model.Products products) {

		return _productsLocalService.updateProducts(products);
	}

	@Override
	public ProductsLocalService getWrappedService() {
		return _productsLocalService;
	}

	@Override
	public void setWrappedService(ProductsLocalService productsLocalService) {
		_productsLocalService = productsLocalService;
	}

	private ProductsLocalService _productsLocalService;

}