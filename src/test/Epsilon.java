package test;

public class Epsilon {
    public static void main(String[] args) {

        double epsilon = 1E-5;

        //앱실론 출력
        System.out.println(epsilon); // 1.0E-5

        //부동 소수점 수 오차 검사
        double a = 0.1 + 0.2;
        double b = 0.3;
        System.out.println(a - b); //5.551115123125783E-17

        if(a == b) {
            System.out.println("a와 b는 같은 값입니다.");
        }else{
            System.out.println("a와 b는 다른 값입니다.");
        }

        if(Math.abs(a - b) < epsilon){
            System.out.println("a와 b는 같은 값입니다.");
        }else{
            System.out.println("a와 b는 다른 값입니다.");
        }

        //end
    }
}
