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

package com.product.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.product.service.model.Products;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the products service. This utility wraps <code>com.product.service.service.persistence.impl.ProductsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductsPersistence
 * @generated
 */
public class ProductsUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Products products) {
		getPersistence().clearCache(products);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Products> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Products> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Products> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Products> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Products> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Products update(Products products) {
		return getPersistence().update(products);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Products update(
		Products products, ServiceContext serviceContext) {

		return getPersistence().update(products, serviceContext);
	}

	/**
	 * Returns all the productses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching productses
	 */
	public static List<Products> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the productses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of productses
	 * @param end the upper bound of the range of productses (not inclusive)
	 * @return the range of matching productses
	 */
	public static List<Products> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the productses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of productses
	 * @param end the upper bound of the range of productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching productses
	 */
	public static List<Products> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Products> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the productses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of productses
	 * @param end the upper bound of the range of productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching productses
	 */
	public static List<Products> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Products> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first products in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching products
	 * @throws NoSuchProductsException if a matching products could not be found
	 */
	public static Products findByUuid_First(
			String uuid, OrderByComparator<Products> orderByComparator)
		throws com.product.service.exception.NoSuchProductsException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first products in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching products, or <code>null</code> if a matching products could not be found
	 */
	public static Products fetchByUuid_First(
		String uuid, OrderByComparator<Products> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last products in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching products
	 * @throws NoSuchProductsException if a matching products could not be found
	 */
	public static Products findByUuid_Last(
			String uuid, OrderByComparator<Products> orderByComparator)
		throws com.product.service.exception.NoSuchProductsException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last products in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching products, or <code>null</code> if a matching products could not be found
	 */
	public static Products fetchByUuid_Last(
		String uuid, OrderByComparator<Products> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the productses before and after the current products in the ordered set where uuid = &#63;.
	 *
	 * @param productsId the primary key of the current products
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next products
	 * @throws NoSuchProductsException if a products with the primary key could not be found
	 */
	public static Products[] findByUuid_PrevAndNext(
			long productsId, String uuid,
			OrderByComparator<Products> orderByComparator)
		throws com.product.service.exception.NoSuchProductsException {

		return getPersistence().findByUuid_PrevAndNext(
			productsId, uuid, orderByComparator);
	}

	/**
	 * Removes all the productses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of productses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching productses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the products where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchProductsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching products
	 * @throws NoSuchProductsException if a matching products could not be found
	 */
	public static Products findByUUID_G(String uuid, long groupId)
		throws com.product.service.exception.NoSuchProductsException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the products where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching products, or <code>null</code> if a matching products could not be found
	 */
	public static Products fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the products where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching products, or <code>null</code> if a matching products could not be found
	 */
	public static Products fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the products where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the products that was removed
	 */
	public static Products removeByUUID_G(String uuid, long groupId)
		throws com.product.service.exception.NoSuchProductsException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of productses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching productses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the productses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching productses
	 */
	public static List<Products> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the productses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of productses
	 * @param end the upper bound of the range of productses (not inclusive)
	 * @return the range of matching productses
	 */
	public static List<Products> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the productses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of productses
	 * @param end the upper bound of the range of productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching productses
	 */
	public static List<Products> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Products> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the productses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of productses
	 * @param end the upper bound of the range of productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching productses
	 */
	public static List<Products> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Products> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first products in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching products
	 * @throws NoSuchProductsException if a matching products could not be found
	 */
	public static Products findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Products> orderByComparator)
		throws com.product.service.exception.NoSuchProductsException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first products in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching products, or <code>null</code> if a matching products could not be found
	 */
	public static Products fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Products> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last products in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching products
	 * @throws NoSuchProductsException if a matching products could not be found
	 */
	public static Products findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Products> orderByComparator)
		throws com.product.service.exception.NoSuchProductsException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last products in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching products, or <code>null</code> if a matching products could not be found
	 */
	public static Products fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Products> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the productses before and after the current products in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param productsId the primary key of the current products
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next products
	 * @throws NoSuchProductsException if a products with the primary key could not be found
	 */
	public static Products[] findByUuid_C_PrevAndNext(
			long productsId, String uuid, long companyId,
			OrderByComparator<Products> orderByComparator)
		throws com.product.service.exception.NoSuchProductsException {

		return getPersistence().findByUuid_C_PrevAndNext(
			productsId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the productses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of productses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching productses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the productses where productsId = &#63;.
	 *
	 * @param productsId the products ID
	 * @return the matching productses
	 */
	public static List<Products> findByProductFinder(long productsId) {
		return getPersistence().findByProductFinder(productsId);
	}

	/**
	 * Returns a range of all the productses where productsId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductsModelImpl</code>.
	 * </p>
	 *
	 * @param productsId the products ID
	 * @param start the lower bound of the range of productses
	 * @param end the upper bound of the range of productses (not inclusive)
	 * @return the range of matching productses
	 */
	public static List<Products> findByProductFinder(
		long productsId, int start, int end) {

		return getPersistence().findByProductFinder(productsId, start, end);
	}

	/**
	 * Returns an ordered range of all the productses where productsId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductsModelImpl</code>.
	 * </p>
	 *
	 * @param productsId the products ID
	 * @param start the lower bound of the range of productses
	 * @param end the upper bound of the range of productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching productses
	 */
	public static List<Products> findByProductFinder(
		long productsId, int start, int end,
		OrderByComparator<Products> orderByComparator) {

		return getPersistence().findByProductFinder(
			productsId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the productses where productsId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductsModelImpl</code>.
	 * </p>
	 *
	 * @param productsId the products ID
	 * @param start the lower bound of the range of productses
	 * @param end the upper bound of the range of productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching productses
	 */
	public static List<Products> findByProductFinder(
		long productsId, int start, int end,
		OrderByComparator<Products> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByProductFinder(
			productsId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first products in the ordered set where productsId = &#63;.
	 *
	 * @param productsId the products ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching products
	 * @throws NoSuchProductsException if a matching products could not be found
	 */
	public static Products findByProductFinder_First(
			long productsId, OrderByComparator<Products> orderByComparator)
		throws com.product.service.exception.NoSuchProductsException {

		return getPersistence().findByProductFinder_First(
			productsId, orderByComparator);
	}

	/**
	 * Returns the first products in the ordered set where productsId = &#63;.
	 *
	 * @param productsId the products ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching products, or <code>null</code> if a matching products could not be found
	 */
	public static Products fetchByProductFinder_First(
		long productsId, OrderByComparator<Products> orderByComparator) {

		return getPersistence().fetchByProductFinder_First(
			productsId, orderByComparator);
	}

	/**
	 * Returns the last products in the ordered set where productsId = &#63;.
	 *
	 * @param productsId the products ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching products
	 * @throws NoSuchProductsException if a matching products could not be found
	 */
	public static Products findByProductFinder_Last(
			long productsId, OrderByComparator<Products> orderByComparator)
		throws com.product.service.exception.NoSuchProductsException {

		return getPersistence().findByProductFinder_Last(
			productsId, orderByComparator);
	}

	/**
	 * Returns the last products in the ordered set where productsId = &#63;.
	 *
	 * @param productsId the products ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching products, or <code>null</code> if a matching products could not be found
	 */
	public static Products fetchByProductFinder_Last(
		long productsId, OrderByComparator<Products> orderByComparator) {

		return getPersistence().fetchByProductFinder_Last(
			productsId, orderByComparator);
	}

	/**
	 * Removes all the productses where productsId = &#63; from the database.
	 *
	 * @param productsId the products ID
	 */
	public static void removeByProductFinder(long productsId) {
		getPersistence().removeByProductFinder(productsId);
	}

	/**
	 * Returns the number of productses where productsId = &#63;.
	 *
	 * @param productsId the products ID
	 * @return the number of matching productses
	 */
	public static int countByProductFinder(long productsId) {
		return getPersistence().countByProductFinder(productsId);
	}

	/**
	 * Caches the products in the entity cache if it is enabled.
	 *
	 * @param products the products
	 */
	public static void cacheResult(Products products) {
		getPersistence().cacheResult(products);
	}

	/**
	 * Caches the productses in the entity cache if it is enabled.
	 *
	 * @param productses the productses
	 */
	public static void cacheResult(List<Products> productses) {
		getPersistence().cacheResult(productses);
	}

	/**
	 * Creates a new products with the primary key. Does not add the products to the database.
	 *
	 * @param productsId the primary key for the new products
	 * @return the new products
	 */
	public static Products create(long productsId) {
		return getPersistence().create(productsId);
	}

	/**
	 * Removes the products with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param productsId the primary key of the products
	 * @return the products that was removed
	 * @throws NoSuchProductsException if a products with the primary key could not be found
	 */
	public static Products remove(long productsId)
		throws com.product.service.exception.NoSuchProductsException {

		return getPersistence().remove(productsId);
	}

	public static Products updateImpl(Products products) {
		return getPersistence().updateImpl(products);
	}

	/**
	 * Returns the products with the primary key or throws a <code>NoSuchProductsException</code> if it could not be found.
	 *
	 * @param productsId the primary key of the products
	 * @return the products
	 * @throws NoSuchProductsException if a products with the primary key could not be found
	 */
	public static Products findByPrimaryKey(long productsId)
		throws com.product.service.exception.NoSuchProductsException {

		return getPersistence().findByPrimaryKey(productsId);
	}

	/**
	 * Returns the products with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param productsId the primary key of the products
	 * @return the products, or <code>null</code> if a products with the primary key could not be found
	 */
	public static Products fetchByPrimaryKey(long productsId) {
		return getPersistence().fetchByPrimaryKey(productsId);
	}

	/**
	 * Returns all the productses.
	 *
	 * @return the productses
	 */
	public static List<Products> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the productses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of productses
	 * @param end the upper bound of the range of productses (not inclusive)
	 * @return the range of productses
	 */
	public static List<Products> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the productses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of productses
	 * @param end the upper bound of the range of productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of productses
	 */
	public static List<Products> findAll(
		int start, int end, OrderByComparator<Products> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the productses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of productses
	 * @param end the upper bound of the range of productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of productses
	 */
	public static List<Products> findAll(
		int start, int end, OrderByComparator<Products> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the productses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of productses.
	 *
	 * @return the number of productses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ProductsPersistence getPersistence() {
		return _persistence;
	}

	private static volatile ProductsPersistence _persistence;

}