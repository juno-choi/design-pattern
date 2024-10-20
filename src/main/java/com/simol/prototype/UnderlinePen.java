package com.simol.prototype;

public class UnderlinePen implements Product{
    private char underlineChar;

    public UnderlinePen(char underlineChar) {
        this.underlineChar = underlineChar;
    }

    @Override
    public void use(String s) {
        int length = s.length();
        System.out.println(s);
        for (int i=0; i<length; i++) {
            System.out.print(underlineChar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
        return new UnderlinePen(underlineChar);
    }
}
