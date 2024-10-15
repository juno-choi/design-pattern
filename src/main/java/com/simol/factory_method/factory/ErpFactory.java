package com.simol.factory_method.factory;

import com.simol.factory_method.Erp;
import com.simol.factory_method.Product;

public class ErpFactory implements Factory{
    @Override
    public Product createProduct(String erpName) {
        return new Erp(erpName);
    }

    @Override
    public void registerProduct(Product erp) {
        System.out.println("%s 등록 완료".formatted(erp));
    }
}
