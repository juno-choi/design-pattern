package com.simol.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuilderTest {

    @Test
    void textBuilderTest() {
        //given
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        //when
        String textResult = textBuilder.getTextResult();
        //then
        System.out.println(textResult);
    }

    @Test
    void htmlBuilderTest() {
        //given
        HTMLBuilder htmlBuilder = new HTMLBuilder();
        Director director = new Director(htmlBuilder);
        director.construct();
        //when
        String textResult = htmlBuilder.getHTMLResult();
        //then
        System.out.println(textResult);
    }
}