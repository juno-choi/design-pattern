package com.simol.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    void prototypeTest() {
        // given
        final String STRONG = "strong message";
        final String WARNING = "warning message";
        final String SLASH = "slash message";

        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('-');
        MessageBox messageBox1 = new MessageBox('*');
        MessageBox messageBox2 = new MessageBox('/');

        manager.register(STRONG, underlinePen);
        manager.register(WARNING, messageBox1);
        manager.register(SLASH, messageBox2);

        Product strong = manager.create(STRONG);
        Product warning = manager.create(WARNING);
        Product slash = manager.create(SLASH);

        // when
        // then
        strong.use("hello juno prototype");
        System.out.println();
        warning.use("hello juno prototype");
        System.out.println();
        slash.use("hello juno prototype");
    }
}