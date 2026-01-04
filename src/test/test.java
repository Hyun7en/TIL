package test;

import java.io.IOException;


public class test {
    public static void main(String[] args) throws IOException {

        allLoop :

        for (int i = 2; i < 10; i++) {

            for (int j = 2; j < 10; j++) {

                if (i == 5) {


                    break allLoop;

                }

                System.out.println(i + " * " + j + " = " + (i * j));

            }

        }


    }


}

