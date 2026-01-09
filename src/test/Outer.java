package test;

public class Outer {
    private static int n = 10;
    public static void main(String[] args) {
        System.out.println("outer");
    }

    public static class Inner {
        public static void main(String[] args) {
            System.out.println(Outer.n);
        }
    }
}
