package com.simol.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    @Test
    void printerTest() {
        //given
        Printer normalPrinter = new Printer(new NormalStrategy());
        Printer vipPrinter = new Printer(new VipStrategy());

        //when
        //then
        normalPrinter.out();
        vipPrinter.out();
    }
}