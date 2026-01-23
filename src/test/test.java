package test;

import java.io.IOException;
import java.util.stream.IntStream;

public class test{

    public static void main(String[] args) throws IOException {
        IntStream.of(1, 2, 3)
                .peek(x -> System.out.println("peek: " + x))
                .forEach(x -> System.out.println("forEach: " + x));

        System.out.println("===================");

        IntStream.of(1, 2, 3)
                .forEach(x -> System.out.println("forEach: " + x));



    }

}


