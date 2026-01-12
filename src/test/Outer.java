package test;

public class Outer {
    private  int n = 10;
    static int value = 11;

    //instance inner class
    public class Inner{

        void print(){
            System.out.println(n);
        }
    }

    //static inner class
    public static class Inner2{
        void print(){
            System.out.println(value);
        }
    }

    //local inner class
    public void mathod(){
        class Inner3{
            void print(){
                System.out.println("local");
            }
        }
        new Inner3().print();
    }

    //anonymous inner class
    Runnable run = new Runnable() {
        @Override
        public void run() {
            System.out.println("run");
        }
    };




}
