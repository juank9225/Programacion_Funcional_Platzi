package com.platzi.functional._09_defaults;

public class StringFunctions {
//1)
    @FunctionalInterface
    interface StringOperation{
        int getAmount(); //metodo sin definicion

        default void operate(String text){ //metodo con definicion
            int x = getAmount();
            while (x-- >0){
                System.out.println(text);
            }
        }
    }
//2)
    @FunctionalInterface
    interface DoOperation{
        void take(String text);

        default void execute(int x,String text){
            while (x-- >0){
                take(text);
            }
        }
}

    public static void main(String[] args) {
        StringOperation six = () -> 6;// aqui llamamos al metodo getAmount() el cual no recibe parametros
        six.operate("juan");

        DoOperation operateFive = text -> System.out.println(text); //creo la funcion

        operateFive.execute(5,"Hola"); //ejecuto la funcion creada anteriormente
    }
}
