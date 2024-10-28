package com.simol.abstract_factory.factory;

import java.lang.reflect.InvocationTargetException;

public abstract class Factory {
    public static Factory getFactory(String className) {
        Factory factory = null;

        try {
            factory = (Factory) Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException cnfe) {
            throw new RuntimeException(cnfe);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
