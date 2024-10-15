package com.simol.factory_method;

import com.simol.factory_method.factory.ErpFactory;
import com.simol.factory_method.factory.Factory;
import com.simol.factory_method.factory.IDCardFactory;
import org.junit.jupiter.api.Test;

class IDCardTest {

    @Test
    void idCardTest(){
        //given
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("juno");
        Product card2 = factory.create("siwal");
        Product card3 = factory.create("luna");

        //when
        //then
        card1.use();
        card2.use();
        card3.use();
    }

    @Test
    void erpTest(){
        //given
        Factory factory = new ErpFactory();
        Product erp1 = factory.create("juno");
        Product erp2 = factory.create("siwal");
        Product erp3 = factory.create("luna");

        //when
        //then
        erp1.use();
        erp2.use();
        erp3.use();
    }
}