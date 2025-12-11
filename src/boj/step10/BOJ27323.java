package boj.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
<문제: 직사각형>
정수 A, B 가 주어진다. 세로 길이가 A cm, 가로 길이가 B cm 인 아래와 같은
직사각형의 넓이를 cm2 단위로 구하시오.

<입력>
표준 입력에 다음과 같은 형태로 입력이 주어진다.

A
B
<출력>
세로 길이가 A cm, 가로 길이가 B cm인 직사각형의 넓이를 cm2 단위로 구하고,
단위 (cm2)를 생략하여 출력한다.
 */
public class BOJ27323 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        System.out.println(A*B);
        br.close();


    }
}
