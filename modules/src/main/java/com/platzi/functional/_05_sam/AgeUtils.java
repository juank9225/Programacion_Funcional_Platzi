package com.platzi.functional._05_sam;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class AgeUtils {
    public static void main(String[] args) {

        Function<Integer,String> addCeros = x -> x < 10 ? "0"+x : String.valueOf(x); //para los numeros menores que cero , agregar ceros en casos necesarios

        TriFunction<Integer,Integer,Integer, LocalDate> parseDate =
                (day,month,year) -> LocalDate.parse(year+"-"+addCeros.apply(month)+"-"+addCeros.apply(day)); //obtener una fecha parceando los datos

        TriFunction<Integer,Integer,Integer,Integer> calculateAge =
                (day,month,year) -> Period.between(
                       parseDate.apply(day,month,year), LocalDate.now() //calcular la edad de una persona
                ).getYears();

        System.out.println(calculateAge.apply(10,10,1992));
    }

    @FunctionalInterface //creamos una funcion o generar nuestros propios tipos de interfaces funcionales
    interface TriFunction<T,U,V,R>{
        R apply(T t,U u,V v);
    }
}
