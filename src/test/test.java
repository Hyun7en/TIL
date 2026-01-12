package test;


public class test {
    public static void main(String[] args)   {
        Integer num = new Integer(4);
        Integer num1 = new Integer(4);

        Integer num2 = Integer.valueOf(4);
        Integer num3 = Integer.valueOf(4);

        Integer num4 = 4;
        Integer num5 = 4;


        System.out.println(num == num1);
        System.out.println(num2 == num3);
        System.out.println(num4 == num5);
        System.out.println(num == num2);
    }

}

