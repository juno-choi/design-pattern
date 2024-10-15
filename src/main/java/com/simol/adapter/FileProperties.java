package com.simol.adapter;

import java.io.*;
import java.util.Properties;

public class FileProperties implements FileIO{
    private Properties properties;

    public FileProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void readFromFile(String filename) throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream input = classLoader.getResourceAsStream(filename);
        properties.load(input);
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        BufferedWriter output = new BufferedWriter(new FileWriter(filename));
        properties.store(output, "adapter pattern");
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
