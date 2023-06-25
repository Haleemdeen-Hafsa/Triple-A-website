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
 * Provides a wrapper for {@link ProductsService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProductsService
 * @generated
 */
public class ProductsServiceWrapper
	implements ProductsService, ServiceWrapper<ProductsService> {

	public ProductsServiceWrapper() {
		this(null);
	}

	public ProductsServiceWrapper(ProductsService productsService) {
		_productsService = productsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _productsService.getOSGiServiceIdentifier();
	}

	@Override
	public ProductsService getWrappedService() {
		return _productsService;
	}

	@Override
	public void setWrappedService(ProductsService productsService) {
		_productsService = productsService;
	}

	private ProductsService _productsService;

}