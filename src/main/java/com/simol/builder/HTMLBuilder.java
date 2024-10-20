package com.simol.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class HTMLBuilder implements Builder{
    private StringBuilder sb = new StringBuilder();
    private String fileName = "untitle.html";


    @Override
    public void makeTitle(String title) {
        fileName = title + ".html";
        sb.append("<!DOCTYPE html>\n");
        sb.append("<html>\n");
        sb.append("<head><title>\n");
        sb.append(title);
        sb.append("</title></head>\n");
        sb.append("<body>\n");
        sb.append("<h1>");
        sb.append(title);
        sb.append("</h1>\n\n");

    }

    @Override
    public void makeString(String string) {
        sb.append("<p>");
        sb.append(string);
        sb.append("</p>\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        sb.append("<ul>\n");
        for (String s : items) {
            sb.append("<li>");
            sb.append(s);
            sb.append("</li>\n");
        }
        sb.append("</ul>\n\n");
    }

    @Override
    public void close() {
        sb.append("</body>\n");
        sb.append("</html>\n");
        try {
            Writer writer = new FileWriter(fileName);
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getHTMLResult() {
        return fileName;
    }
}
