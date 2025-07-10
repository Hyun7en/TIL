package boj.step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제
두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
 */
public class BOJ1008 {
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        double A = sc.nextInt();
//        double B = sc.nextInt();
//        sc.close();
//
//        System.out.println(A/B);
//
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();

        StringTokenizer st = new StringTokenizer(N);

        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());

        br.close();

        System.out.println(A/B);
    }
}
