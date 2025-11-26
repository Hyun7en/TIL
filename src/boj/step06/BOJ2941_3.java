package boj.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2941_3 {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String str = br.readLine();
            br.close();

            // 입력 길이 체크
            if (str.length() > 100) {
                throw new IllegalArgumentException("입력은 최대 100글자까지 가능합니다.");
            }

            int count = 0;
            int i = 0;
            int len = str.length();

            while (i < len) {
                if (i + 2 < len && str.charAt(i) == 'd'
                        && str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=') {
                    count++;
                    i += 3;
                } else if (i + 1 < len && str.charAt(i) == 'c'
                        && (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-')) {
                    count++;
                    i += 2;
                } else if (i + 1 < len && str.charAt(i) == 'd' && str.charAt(i + 1) == '-') {
                    count++;
                    i += 2;
                } else if (i + 1 < len && (str.charAt(i) == 'l' || str.charAt(i) == 'n')
                        && str.charAt(i + 1) == 'j') {
                    count++;
                    i += 2;
                } else if (i + 1 < len && (str.charAt(i) == 's' || str.charAt(i) == 'z')
                        && str.charAt(i + 1) == '=') {
                    count++;
                    i += 2;
                } else {
                    count++;
                    i++;
                }
            }

            System.out.println(count);

        } catch (IOException e) {
            System.out.println("입력 오류가 발생했습니다.");
        } catch (IllegalArgumentException e) {
            System.out.println("예외: " + e.getMessage());
        }
    }
}
