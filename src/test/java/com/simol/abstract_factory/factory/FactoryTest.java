package com.simol.abstract_factory.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {

    @Test
    public void testFactory() {
        //given
        String fileName = "list.html";
        String className = "com.simol.abstract_factory.listfactory.ListFactory";
        Factory factory = Factory.getFactory(className);

        Link blog1 = factory.createLink("Link", "http://www.google.com");
        Link blog2 = factory.createLink("Link", "http://www.google.com");
        Link blog3 = factory.createLink("Link", "http://www.google.com");

        Tray blogTray = factory.createTray("Blog Site");
        blogTray.add(blog1);
        blogTray.add(blog2);
        blogTray.add(blog3);

        Link news1 = factory.createLink("News 1", "http://www.google.com/new1");
        Link news2 = factory.createLink("News 2", "http://www.google.com/new2");
        Tray news3 = factory.createTray("News3");
        news3.add(factory.createLink("News3 US", "http://www.google.com/us"));
        news3.add(factory.createLink("News3 Korea", "http://www.google.com/Korea"));

        Tray newsTray = factory.createTray("News Site");
        newsTray.add(news1);
        newsTray.add(news2);
        newsTray.add(news3);

        Page page = factory.createPage("Blog Page", "juno.com");
        page.add(blogTray);
        page.add(newsTray);
        //when
        //then
        page.output(fileName);
    }

}