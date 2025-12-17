package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = "";
       for(int i = 0; i < N; i++){
           str += "*";
           System.out.println(str);
       }

        br.close();
    }

}

