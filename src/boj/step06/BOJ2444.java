package boj.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
**문제(별 찍기 - 7)**
예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

**입력**
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

**출력**
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 */
public class BOJ2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 윗부분 (1 ~ N줄)
        for (int i = 1; i <= N; i++) {
            // 공백: N - i
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            // 별: 2*i - 1
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아랫부분 (N-1 ~ 1줄)
        for (int i = N - 1; i >= 1; i--) {
            // 공백: N - i
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            // 별: 2*i - 1
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 1; i <= N; i++) {
//            sb.append(" ".repeat(N - i));
//            sb.append("*".repeat(2 * i - 1));
//            sb.append("\n");
//        }
//        for (int i = N - 1; i >= 1; i--) {
//            sb.append(" ".repeat(N - i));
//            sb.append("*".repeat(2 * i - 1));
//            sb.append("\n");
//        }
//
//        System.out.print(sb);


    }
}
