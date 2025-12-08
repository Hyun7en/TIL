package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       String str = br.readLine();

       StringTokenizer st = new StringTokenizer(str);

        String a = new StringBuilder(st.nextToken()).reverse().toString();
        String b = new StringBuilder(st.nextToken()).reverse().toString();

        int result = Math.max(Integer.parseInt(a),Integer.parseInt(b));

        System.out.println(result);

        br.close();
    }
}

