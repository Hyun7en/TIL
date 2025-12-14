package boj.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9506_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;

            int sum = 0;
            StringBuilder sb = new StringBuilder();

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;

                    if (sb.length() > 0) sb.append(" + ");
                    sb.append(i);
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
