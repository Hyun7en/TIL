package test;

public class Outer {
    private  int n = 10;

    public  class Inner {

        void print(){
            System.out.println(n);
        }
    }
}
