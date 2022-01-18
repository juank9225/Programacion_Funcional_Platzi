package com.platzi.functional._15_streams_intro;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> courseList = NombresUtils.getList(
                "FrontEnd",
                "Backend",
                "FullStack");

        for (String course : courseList){
            System.out.println("Platzi: "+course);
        }

        Stream<String> coursesStream = Stream.of("java", //Stream.of() es la foma mas simple de crear un stream
                "FrontEnd",
                "BacKend",
                "FullStack");

        Stream<Integer> courseLengthStream = coursesStream.map(course -> course.length());

        Optional<Integer> longest = courseLengthStream.max((x,y) ->y-x); //recibe una comparacion
    }
}
