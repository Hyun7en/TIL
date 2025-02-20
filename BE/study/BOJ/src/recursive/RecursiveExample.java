package recursive;

public class RecursiveExample {
	
	 // 재귀함수를 이용한 팩토리얼
    public static long factorial(int n) {
    	if( n <= 1) {
    		return n;
    	}
    	
    	return n*factorial(n - 1);
    		
    	
    	
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(num + "! = " + factorial(num));
    }
}
