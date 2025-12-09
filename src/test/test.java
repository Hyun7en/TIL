package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        sb.insert(0, "s");
        sb.insert(0,"dd");

        System.out.println(sb);

        br.close();
    }

}

