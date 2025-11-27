package boj.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//함수 따로 빼서 하는게 깔끔
public class BOJ1316_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //첫째 즐 단어 개수 N
        int count = 0; // 그룹 단어 세기

        //둘째 줄 ~ N번째 줄
        for(int i = 0 ; i < N ; i++){
            String str = br.readLine();//단어

            //그룹 단어 확인
            if(check(str)){
                count++;
            }

        }

        br.close();
        System.out.println(count);

    }

    public static boolean check(String str){
        boolean[] arr  = new boolean[26]; //문자 체크

        for(int i = 0 ; i < str.length(); i++){

            int idx = str.charAt(i) - 'a';

            //이미 나왔는데 전과 다른 경우
            if(arr[idx] && (str.charAt(i) != str.charAt(i - 1))){
                return false;
            }

            //처음 나온 경우
            arr[idx] = true;
        }

        //끝까지 문제 없으면
        return true;
    }
}
