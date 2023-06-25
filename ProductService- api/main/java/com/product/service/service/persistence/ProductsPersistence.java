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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.product.service.exception.NoSuchProductsException;
import com.product.service.model.Products;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the products service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductsUtil
 * @generated
 */
@ProviderType
public interface ProductsPersistence extends BasePersistence<Products> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProductsUtil} to access the products persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the productses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching productses
	 */
	public java.util.List<Products> findByUuid(String uuid);

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
	public java.util.List<Products> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Products> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Products>
			orderByComparator);

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
	public java.util.List<Products> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Products>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first products in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching products
	 * @throws NoSuchProductsException if a matching products could not be found
	 */
	public Products findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Products>
				orderByComparator)
		throws NoSuchProductsException;

	/**
	 * Returns the first products in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching products, or <code>null</code> if a matching products could not be found
	 */
	public Products fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Products>
			orderByComparator);

	/**
	 * Returns the last products in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching products
	 * @throws NoSuchProductsException if a matching products could not be found
	 */
	public Products findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Products>
				orderByComparator)
		throws NoSuchProductsException;

	/**
	 * Returns the last products in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching products, or <code>null</code> if a matching products could not be found
	 */
	public Products fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Products>
			orderByComparator);

	/**
	 * Returns the productses before and after the current products in the ordered set where uuid = &#63;.
	 *
	 * @param productsId the primary key of the current products
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next products
	 * @throws NoSuchProductsException if a products with the primary key could not be found
	 */
	public Products[] findByUuid_PrevAndNext(
			long productsId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Products>
				orderByComparator)
		throws NoSuchProductsException;

	/**
	 * Removes all the productses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of productses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching productses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the products where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchProductsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching products
	 * @throws NoSuchProductsException if a matching products could not be found
	 */
	public Products findByUUID_G(String uuid, long groupId)
		throws NoSuchProductsException;

	/**
	 * Returns the products where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching products, or <code>null</code> if a matching products could not be found
	 */
	public Products fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the products where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching products, or <code>null</code> if a matching products could not be found
	 */
	public Products fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the products where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the products that was removed
	 */
	public Products removeByUUID_G(String uuid, long groupId)
		throws NoSuchProductsException;

	/**
	 * Returns the number of productses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching productses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the productses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching productses
	 */
	public java.util.List<Products> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Products> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Products> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Products>
			orderByComparator);

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
	public java.util.List<Products> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Products>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first products in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching products
	 * @throws NoSuchProductsException if a matching products could not be found
	 */
	public Products findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Products>
				orderByComparator)
		throws NoSuchProductsException;

	/**
	 * Returns the first products in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching products, or <code>null</code> if a matching products could not be found
	 */
	public Products fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Products>
			orderByComparator);

	/**
	 * Returns the last products in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching products
	 * @throws NoSuchProductsException if a matching products could not be found
	 */
	public Products findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Products>
				orderByComparator)
		throws NoSuchProductsException;

	/**
	 * Returns the last products in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching products, or <code>null</code> if a matching products could not be found
	 */
	public Products fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Products>
			orderByComparator);

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
	public Products[] findByUuid_C_PrevAndNext(
			long productsId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Products>
				orderByComparator)
		throws NoSuchProductsException;

	/**
	 * Removes all the productses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of productses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching productses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the productses where productsId = &#63;.
	 *
	 * @param productsId the products ID
	 * @return the matching productses
	 */
	public java.util.List<Products> findByProductFinder(long productsId);

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
	public java.util.List<Products> findByProductFinder(
		long productsId, int start, int end);

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
	public java.util.List<Products> findByProductFinder(
		long productsId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Products>
			orderByComparator);

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
	public java.util.List<Products> findByProductFinder(
		long productsId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Products>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first products in the ordered set where productsId = &#63;.
	 *
	 * @param productsId the products ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching products
	 * @throws NoSuchProductsException if a matching products could not be found
	 */
	public Products findByProductFinder_First(
			long productsId,
			com.liferay.portal.kernel.util.OrderByComparator<Products>
				orderByComparator)
		throws NoSuchProductsException;

	/**
	 * Returns the first products in the ordered set where productsId = &#63;.
	 *
	 * @param productsId the products ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching products, or <code>null</code> if a matching products could not be found
	 */
	public Products fetchByProductFinder_First(
		long productsId,
		com.liferay.portal.kernel.util.OrderByComparator<Products>
			orderByComparator);

	/**
	 * Returns the last products in the ordered set where productsId = &#63;.
	 *
	 * @param productsId the products ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching products
	 * @throws NoSuchProductsException if a matching products could not be found
	 */
	public Products findByProductFinder_Last(
			long productsId,
			com.liferay.portal.kernel.util.OrderByComparator<Products>
				orderByComparator)
		throws NoSuchProductsException;

	/**
	 * Returns the last products in the ordered set where productsId = &#63;.
	 *
	 * @param productsId the products ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching products, or <code>null</code> if a matching products could not be found
	 */
	public Products fetchByProductFinder_Last(
		long productsId,
		com.liferay.portal.kernel.util.OrderByComparator<Products>
			orderByComparator);

	/**
	 * Removes all the productses where productsId = &#63; from the database.
	 *
	 * @param productsId the products ID
	 */
	public void removeByProductFinder(long productsId);

	/**
	 * Returns the number of productses where productsId = &#63;.
	 *
	 * @param productsId the products ID
	 * @return the number of matching productses
	 */
	public int countByProductFinder(long productsId);

	/**
	 * Caches the products in the entity cache if it is enabled.
	 *
	 * @param products the products
	 */
	public void cacheResult(Products products);

	/**
	 * Caches the productses in the entity cache if it is enabled.
	 *
	 * @param productses the productses
	 */
	public void cacheResult(java.util.List<Products> productses);

	/**
	 * Creates a new products with the primary key. Does not add the products to the database.
	 *
	 * @param productsId the primary key for the new products
	 * @return the new products
	 */
	public Products create(long productsId);

	/**
	 * Removes the products with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param productsId the primary key of the products
	 * @return the products that was removed
	 * @throws NoSuchProductsException if a products with the primary key could not be found
	 */
	public Products remove(long productsId) throws NoSuchProductsException;

	public Products updateImpl(Products products);

	/**
	 * Returns the products with the primary key or throws a <code>NoSuchProductsException</code> if it could not be found.
	 *
	 * @param productsId the primary key of the products
	 * @return the products
	 * @throws NoSuchProductsException if a products with the primary key could not be found
	 */
	public Products findByPrimaryKey(long productsId)
		throws NoSuchProductsException;

	/**
	 * Returns the products with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param productsId the primary key of the products
	 * @return the products, or <code>null</code> if a products with the primary key could not be found
	 */
	public Products fetchByPrimaryKey(long productsId);

	/**
	 * Returns all the productses.
	 *
	 * @return the productses
	 */
	public java.util.List<Products> findAll();

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
	public java.util.List<Products> findAll(int start, int end);

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
	public java.util.List<Products> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Products>
			orderByComparator);

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
	public java.util.List<Products> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Products>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the productses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of productses.
	 *
	 * @return the number of productses
	 */
	public int countAll();

}