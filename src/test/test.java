package test;


public class test {
    public static void main(String[] args)   {
        Integer num = new Integer(4);
        Integer num1 = new Integer(4);

        Integer num2 = Integer.valueOf(222);
        Integer num3 = Integer.valueOf(222);

        Integer num4 = 222;
        Integer num5 = 222;


        System.out.println(num == num1);
        System.out.println(num2 == num3);
        System.out.println(num4 == num5);
        System.out.println(num == num2);
        System.out.println(num2 == num4);
    }

}

