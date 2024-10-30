package com.simol.bridge;

public class Display {
    private DisplayInterface displayInterface;

    public Display(DisplayInterface displayInterface) {
        this.displayInterface = displayInterface;
    }

    public void open() {
        displayInterface.open();
    }

    public void print() {
        displayInterface.print();
    }

    public void close() {
        displayInterface.close();
    }

    public final void display() {
        open();
        print();
        close();
    }
}
