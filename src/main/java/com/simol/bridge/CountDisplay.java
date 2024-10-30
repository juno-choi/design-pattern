package com.simol.bridge;

public class CountDisplay extends Display{

    public CountDisplay(DisplayInterface displayInterface) {
        super(displayInterface);
    }

    public void multiDisplay(int times) {
        open();
        for (int i=0; i<times; i++) {
            print();
        }
        close();
    }
}
