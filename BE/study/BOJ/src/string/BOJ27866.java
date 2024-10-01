package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * <문자와 문자열>
 * 
 * <문제>
 * 
 * <입력>
 * 
 * <출력>
 * 
 */
public class BOJ27866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		
		for(int i = 0; i < arr.length; i++ ) {
			arr[i] = i + 1;
		}
		
		for(int i = 0; i < N; i++ ) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			while( a < b ) {
				int temp = arr[a];
				arr[a++] = arr[b];
				arr[b] = temp;
			}
		}
	}
}
