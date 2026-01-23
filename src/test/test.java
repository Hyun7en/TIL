package test;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class test{

    public static void main(String[] args) throws IOException {
        String[] arr = {"I    study hard", "You study JAVA", "I am hungry"};

        Stream<String> stream = Arrays.stream(arr);
        stream.flatMap(s -> Stream.of(s.split("\\s+"))).forEach(System.out::println);

    }

}


