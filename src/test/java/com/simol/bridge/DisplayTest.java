package com.simol.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisplayTest {
    @Test
    void displayTest() {
        //given
        Display d1 = new Display(new StringDisplayImpl("hello juno1"));
        Display d2 = new CountDisplay(new StringDisplayImpl("hello juno2"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("hello juno3"));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}