package boj.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ1000 {
//    public static void main(String[] args){
//        System.out.println("BOJ1000");
//        Scanner sc = new Scanner(System.in);
//
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//
//        sc.close();
//        System.out.println(num1 + num2);
//    }
}

class BOJ1000_1{

    public static void main(String[] args) throws IOException {
        System.out.println("BOJ1000_1");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();

        StringTokenizer st = new StringTokenizer(num);

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        br.close();
        System.out.println(num1 + num2);


    }

}