package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.function.DoubleUnaryOperator;
import java.util.stream.Stream;

public class test{

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Stream<Integer> stream = list.stream();

        stream.forEach(System.out::println);

    }

}


