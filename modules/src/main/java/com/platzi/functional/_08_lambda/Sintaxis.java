package com.platzi.functional._08_lambda;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Sintaxis {
    public static void main(String[] args) {

        List<String> cursos = NombresUtils.getList("java","funcional");

        cursos.forEach(curso -> System.out.println(curso));

        usarZero(()->2);

        usarPredicato(text->text.isEmpty());

        usarBifunction((x,y) -> x*y);

        usarBifunction((x,y)->{
            System.out.println("X: "+x+" y: "+y);
            return x+y;
        });

        usarNda(()->{
            System.out.println("Hola juan");
        });

        usarBifunction((Integer x,Integer y) -> x*y);
    }

    static void usarZero(ZeroArgumentos zeroArgumentos){

    }
    static void usarPredicato(Predicate<String> predicate){

    }

    static void usarBifunction(BiFunction<Integer,Integer,Integer> operaciones){

    }

    static void usarNda(OperarNada operarNada){

    }

    @FunctionalInterface
    interface ZeroArgumentos{
        int get();
    }

    @FunctionalInterface
    interface OperarNada{
        void nada();
    }
}
