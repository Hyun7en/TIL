package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = 5; // 입력 5줄

        Character[][] arr = new Character[15][15];

        String result = "";

        for(int i = 0 ; i < input ; i++ ){
            String str = br.readLine();

            for(int j = 0 ; j < str.length() ; j++){
                arr[i][j] = str.charAt(j);
            }
        }

        for(int j = 0; j < 15; j++){
            for(int i = 0; i < 15; i++){
                if(arr[i][j] != null) {
                    result += arr[i][j];
                }
            }
        }

        System.out.println(result);



        br.close();
    }
}

