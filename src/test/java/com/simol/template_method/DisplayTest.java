package com.simol.template_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisplayTest {

    @Test
    void displayTest() {
        //given
        Display charDisplay = new CharDisplay('K');
        Display stringDisplay = new StringDisplay("hello juno");
        //when
        charDisplay.display();
        System.out.println();
        stringDisplay.display();
        //then
    }
}