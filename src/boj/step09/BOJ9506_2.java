package boj.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9506_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;

            int sum = 1;
            StringBuilder sb = new StringBuilder("1");

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    sb.append(" + ").append(i);
                }
            }

            if (sum == n) {
                System.out.println(n + " = " + sb);
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }

        br.close();
    }
}
