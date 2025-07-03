package test;

public class Outer {
    public static void main(String[] args) {
        System.out.println("outer.");
    }

    public static class inner {
        public static void main(String[] args) {
            System.out.println("inner.");
        }
    }
}
