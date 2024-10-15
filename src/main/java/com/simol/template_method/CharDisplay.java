package com.simol.template_method;

public class CharDisplay implements Display{
    private char c;

    public CharDisplay(char c) {
        this.c = c;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(c);
    }

    @Override
    public void close() {
        System.out.print(">>");
    }
}
