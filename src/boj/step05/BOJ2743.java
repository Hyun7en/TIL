package boj.step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
**문제(단어 길이 재기)**
알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.

**입력**
첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.

**출력**
첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.
 */
public class BOJ2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //첮째 줄
        String word = br.readLine();
        br.close();

        System.out.println(word.length());


    }
}
