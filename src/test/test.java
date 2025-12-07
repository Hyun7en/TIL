package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str  = br.readLine().trim();

        StringTokenizer st = new StringTokenizer(str);

        if(str.isEmpty()){
            System.out.println(0);
            return;
        }

        System.out.println(st.countTokens());


        br.close();
    }
}

