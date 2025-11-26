package boj.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//간단하긴 하나 시간복잡도 증가 위험 및 문자열 생성함
//사람이 빠르게 이해 가능
public class BOJ2941_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();

        //크로아티아 알파벳을 패턴으로 치환
        String[] croatia = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};

        for(String c : croatia){
            str = str.replace(c, "x");
        }

        br.close();
        System.out.println(str.length());

    }
}
