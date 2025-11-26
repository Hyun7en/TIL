package boj.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//문자열 계속 새로 만들어서 안 좋은 풀이

public class BOJ2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int len = str.length();

        int count = 0; // 크로아티아 알파벳이 몇개인지

        for(int i = 0 ; i < len; i++){

            //dz=
            if((i + 2 < len) && (str.substring(i, i + 3).equals("dz="))){
                count++;
                i += 2; // 3글자니까 세지 않고 넘김
            }
            //c=, c-, d-, lj, nj, s=, z=
            else if((i + 1 < len)){
                String two = str.substring(i, i + 2);
                if(two.equals("c=") || two.equals("c-") || two.equals("d-") ||
                   two.equals("lj") || two.equals("nj") || two.equals("s=") ||
                   two.equals("z=") ){

                    count++;
                    i += 1;
                }else{
                    count++;
                }

            }else{
                count++;
            }
        }
        br.close();
        System.out.println(count);
    }
}
