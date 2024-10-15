package com.simol.factory_method.factory;

import com.simol.factory_method.IDCard;
import com.simol.factory_method.Product;

public class IDCardFactory implements Factory{

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    public void registerProduct(Product product) {
        System.out.println("%s을 등록했습니다.".formatted(product));
    }
}
