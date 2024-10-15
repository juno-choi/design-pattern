package com.simol.factory_method;

public class IDCard implements Product {
    private String owner;
    private Long userId;

    public IDCard(String owner) {
        System.out.println("%s의 카드를 만듭니다.".formatted(owner));
        this.owner = owner;
        this.userId = System.currentTimeMillis() + owner.hashCode();
    }

    @Override
    public void use() {
        System.out.println("%s을 사용합니다.".formatted(this));
    }

    @Override
    public String toString() {
        return "[IDCard: %s #%s]".formatted(owner, userId);
    }

    public String getOwner() {
        return owner;
    }
}
