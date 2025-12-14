package boj.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
<문제: 소수 찾기>
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

<입력>
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

<출력>
주어진 수들 중 소수의 개수를 출력한다.
 */
public class BOJ1978_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        //에라토스테네스의 체

        boolean[] isPrime = new boolean[1001];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= 1000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 1000; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (isPrime[num]) result++;
        }

        System.out.println(result);
        br.close();
    }
}
