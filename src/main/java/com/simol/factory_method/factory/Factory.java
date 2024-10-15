package com.simol.factory_method.factory;

import com.simol.factory_method.Product;

public interface Factory {
    default Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }
    Product createProduct(String owner);
    void registerProduct(Product product);
}
