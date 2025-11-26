package boj.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//보는 사람이 이해하는데 복잡하긴함 이건
public class BOJ2941_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int len = str.length();

        int count = 0;

        for(int i = 0 ; i < len ; i++){

            //dz=
            if((i + 2 < len) && str.charAt(i) == 'd' && str.charAt(i + 1) == 'z'
                && str.charAt(i + 2) == '='){
                count++;
                i += 2;
            }
            // c=, c-
            else if ((i + 1 < len) && str.charAt(i) == 'c'
                      && (str.charAt(i + 1) == '-' || str.charAt(i + 1) == '=' )) {
                count++;
                i += 1;
            }
            //nj, lj
            else if ((i + 1 < len) &&
                    (str.charAt(i) == 'n' || str.charAt(i) == 'l')
                    && str.charAt(i + 1) == 'j' ) {
                count++;
                i += 1;
            }
            //d-
            else if ((i + 1 < len) &&
                    str.charAt(i) == 'd' && str.charAt(i + 1) == '-' ) {
                count++;
                i += 1;
            }
            //s=, z=
            else if ((i + 1 < len) &&
                    (str.charAt(i) == 's' || str.charAt(i) == 'z')
                    && str.charAt(i + 1) == '=' ) {
                count++;
                i += 1;
            }
            else{
                count++;
            }
        }
        br.close();
        System.out.println(count);

    }
}
