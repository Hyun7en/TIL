package boj.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
<문제: 분수찾기> ##
무한히 큰 배열에 다음과 같이 분수들이 적혀있다.

1/1	1/2	1/3	1/4	1/5	…
2/1	2/2	2/3	2/4	…	…
3/1	3/2	3/3	…	…	…
4/1	4/2	…	…	…	…
5/1	…	…	…	…	…
…	…	…	…	…	…
이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로
차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.

X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.

<입력>
첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.

<출력>
첫째 줄에 분수를 출력한다.
 */
public class BOJ1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X  = Integer.parseInt(br.readLine());

        int line = 1; //현재 라인 번호
        int sum = 1; //각 라인의 마지막 번호

        //x가 포함된 라인 찾기
        while(sum < X){
            line++;
            sum += line; //누적합 계속 증가
        }

        int position = X - (sum - line);

        int numerator;
        int denominator;

        // line 홀수면 위 -> 아래 (분모 증가)
        // line 짝수면 아래 -> 위 (분자 증가)

        if(line % 2 == 0){
            numerator = position;
            denominator = line - position + 1;
        }else{
            numerator = line - position + 1;
            denominator = position;
        }

        System.out.println(numerator + "/" + denominator);
        br.close();
    }
}
