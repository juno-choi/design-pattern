package com.simol.prototype;

public class MessageBox implements Product{
    private char decoChar;

    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    @Override
    public void use(String s) {
        int length = s.length() + 1;
        for (int i=0; i<length; i++) {
            System.out.print(decoChar);
        }

        System.out.println();

        System.out.println(decoChar+s+decoChar);

        for (int i=0; i<length; i++) {
            System.out.print(decoChar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
        return new MessageBox(this.decoChar);
    }
}
