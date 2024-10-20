package com.simol.builder;

public class TextBuilder implements Builder{
    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        sb.append("======================\n");
        sb.append("[");
        sb.append(title);
        sb.append("]\n\n");
    }

    @Override
    public void makeString(String string) {
        sb.append("*");
        sb.append(string);
        sb.append("\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String s : items) {
            sb.append(" .");
            sb.append(s);
            sb.append("\n");
        }
    }

    @Override
    public void close() {
        sb.append("======================\n");
    }

    public String getTextResult() {
        return sb.toString();
    }
}
