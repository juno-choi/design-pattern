package com.simol.abstract_factory.listfactory;

import com.simol.abstract_factory.factory.Item;
import com.simol.abstract_factory.factory.Page;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n");
        sb.append("<html><head><title>");
        sb.append(title);
        sb.append("</title></head>\n");
        sb.append("<body>\n");
        sb.append("<h1>");
        sb.append(title);
        sb.append("</h1>\n");
        sb.append("<ul>\n");

        for (Item item : content) {
            sb.append(item.makeHTML());
        }

        sb.append("</ul>\n");
        sb.append("<hr><address>");
        sb.append(author);
        sb.append("</address>");
        sb.append("</body></html>\n");
        sb.append("</body></html>\n");
        return sb.toString();
    }
}
