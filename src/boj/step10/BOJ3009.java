package boj.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
<문제: 네 번째 점>
세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

<입력>
세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.

<출력>
직사각형의 네 번째 점의 좌표를 출력한다.
 */
public class BOJ3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = 0;
        int y = 0;

        for(int i = 0 ; i < 3 ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            x ^= Integer.parseInt(st.nextToken());
            y ^= Integer.parseInt(st.nextToken());
        }

        System.out.println(x + " " + y);
        br.close();
    }
}
