package com.platzi.functional._06_reference_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NombresUtils {

    public static void main(String[] args) {

        List<String> profesores = getList("juan","pedro","jaime");

        Consumer<String> pinter = text -> System.out.println(text); // el metodo consumer consume un dayo y devuelve vacio o void
        profesores.forEach(pinter);
        System.out.println("///////////////////");
        profesores.forEach(System.out::println);
    }

    static <T> List<T> getList(T... elementos){
        return Arrays.asList(elementos);
    }
}
