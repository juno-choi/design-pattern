package com.simol.template_method;

public class StringDisplay implements Display{
    private String s;

    public StringDisplay(String s) {
        this.s = s;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|%s|".formatted(s));
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i=0; i<s.length(); i++) {
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println();
    }
}
