package com.simol.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Hello");
        builder.makeString("normal");
        builder.makeItems(new String[] {"hello", "how are you?", "hi"});
        builder.makeString("times");
        builder.makeItems(new String[] {"good morning", "good afternoon", "good evening"});
        builder.close();
    }
}
