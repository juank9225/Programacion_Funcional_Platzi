package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunction {

    public static void main(String[] args) {

        Function<Integer, Integer> squareFunction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };

        System.out.println(squareFunction.apply(5));
        System.out.println(squareFunction.apply(25));
        System.out.println(square(5));

        Function<Integer,Boolean> isOdd = x ->x % 2 ==1;

        Predicate<Integer> isEven = x-> x % 2 ==0 ; //si el numero es par
        isEven.test(4); //true ejecucion de la funcion

//........................algo mas practico....................................................

        Predicate<Student> isApproved = student -> student.getCalificacion() >= 3.0;
        Student cristian = new Student(5.0);
        System.out.println("estudiantes aprobo? "+isApproved.test(cristian));
    }

    static class Student{
        private double calificacion;

        public Student(double calificacion){
            this.calificacion = calificacion;
        }
        public double getCalificacion(){
            return calificacion;
        }
    }

    static int square(int x){
        return x * x;
    }

}
