package test;


public class test {
    public static void main(String[] args) {

        int c = 0;
        int i;

        for ( i = 1; i <= 2023; i++) {

            if (i % 4 == 0) {
                c++;
            }
        }


        System.out.println(c);
        System.out.println(i);
    }


}

