/*
 * Copyright (C) 2010 Brockmann Consult GmbH (info@brockmann-consult.de)
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 3 of the License, or (at your option)
 * any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, see http://www.gnu.org/licenses/
 */

package org.esa.snap.visat.actions.session.dom;

import com.bc.ceres.binding.dom.DomElement;
import org.esa.snap.framework.datamodel.Product;
import org.esa.snap.framework.datamodel.ProductManager;

class ProductDomConverter extends ProductNodeDomConverter<Product> {

    ProductDomConverter(ProductManager productManager) {
        super(Product.class, productManager);
    }

    @Override
    protected Product getProductNode(DomElement parentElement, Product product) {
        return product;
    }

    @Override
    protected void convertProductNodeToDom(Product product, DomElement parentElement) {
    }
}
