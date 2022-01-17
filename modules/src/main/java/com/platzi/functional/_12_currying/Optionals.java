package com.platzi.functional._12_currying;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {

        List<String> names = getNames();
        if (names != null){
           //Operar con nombres
        }

        Optional<List<String>> optinalNames = getOptionalNames();
        if (optinalNames.isPresent()){

        }

        optinalNames.ifPresent(nameValues -> nameValues.forEach(System.out::println));//isPresent con el consumer
        Optional<String> valuablePlayer = optionalValuablePlayer();
        String valuablePlayerName = valuablePlayer.orElseGet(()->"No player");
    }

    static List<String> getNames(){
        List<String> list = new LinkedList<>();

        return Collections.emptyList();
    }

    static String mostValueablePlayer(){
        return null;
    }

    static int mostExpensiveItem(){
        return -1;
    }
    //Realizar las funciones anteriores con Opcional

    static Optional<List<String>> getOptionalNames(){
        List<String> namesList = new LinkedList<>();
        return Optional.of(namesList);
    }

    static Optional<String> optionalValuablePlayer(){

       // return Optional.ofNullable()
        try {
            return Optional.of("Juan");
        }catch (Exception e){
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
