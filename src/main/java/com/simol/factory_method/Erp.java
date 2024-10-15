package com.simol.factory_method;

public class Erp implements Product {
    private String erpName;

    public Erp(String erpName) {
        System.out.println("%s 생성".formatted(erpName));
        this.erpName = erpName;
    }

    @Override
    public void use() {
        System.out.println("%s 연동 시작".formatted(erpName));
    }

    @Override
    public String toString() {
        return "[ERP: %s]".formatted(erpName);
    }
}
