package boj.step05;

import javax.swing.event.InternalFrameEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
**문제(문자와 문자열)**
단어
S와 정수
i가 주어졌을 때,
S의
i번째 글자를 출력하는 프로그램을 작성하시오.

**입력**
첫째 줄에 영어 소문자와 대문자로만 이루어진 단어
S가 주어진다. 단어의 길이는 최대
1,000이다.

둘째 줄에 정수
i가 주어진다. (1 <= i <= S)

**출력**
S의 i번째 글자를 출력한다.
 */
public class BOJ27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int i = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(S.charAt(i - 1));
    }
}
