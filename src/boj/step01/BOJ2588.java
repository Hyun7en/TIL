package boj.step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
문제
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

출력
첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
 */
public class BOJ2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N1 = Integer.parseInt(br.readLine());
        int N2 = Integer.parseInt(br.readLine());

        int N3 = N1 * (N2 % 10);
        int N4 = N1 * ((N2 % 100) / 10 );
        int N5 = N1 * (N2 / 100);

        System.out.println(N3);
        System.out.println(N4);
        System.out.println(N5);
        System.out.println(N1 * N2);

    }

}
