package com.simol.prototype;

public interface Product extends Cloneable{
    void use(String s);
    Product createCopy();
}
