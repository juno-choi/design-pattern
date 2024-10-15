package com.simol.adapter;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Properties;

class FilePropertiesTest {

    @Test
    void filePropertiesTest() {
        FileIO f = new FileProperties(new Properties());
        try {
            f.readFromFile("file.txt");
            String width = f.getValue("width");
            System.out.println("before : %s".formatted(width));

            f.setValue("width", "1024");
            f.setValue("height", "512");
            f.setValue("depth", "32");
            f.writeToFile("newfile.txt");
            System.out.println("newfile.txt is created.");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}