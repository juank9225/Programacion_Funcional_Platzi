package com.platzi.functional._04_functional;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class StringFunctions {
    public static void main(String[] args) {

        UnaryOperator<String> quote = text -> "\" "+ text +"\"";
        UnaryOperator<String> adMark = text -> text+ "!";

        System.out.println(quote.apply("Hola Estudiante!!!.."));
        System.out.println(adMark.apply("HOLA"));

        BiFunction<String,Integer,String> leftPad = (text, number) -> String.format("%"+ number + "s", text);
        System.out.println(leftPad.apply("JAVA",10));
    }
}
