package boj.step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
**문제(A+B - 3)**
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

**입력**
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

**출력*8
각 테스트 케이스마다 A+B를 출력한다.
 */
public class BOJ10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String N = br.readLine();

            StringTokenizer st = new StringTokenizer(N);

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            System.out.println(A + B);

        }

        br.close();
    }
}
