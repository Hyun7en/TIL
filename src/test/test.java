package test;


import java.util.Calendar;

public class test {

    public static void main(String[] args)   {
        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();
        Calendar time3 = Calendar.getInstance();

        time2.set(1982, 2, 19);
        time3.set(2020, 2, 19);

        System.out.println(time1.before(time2));
        System.out.println(time1.after(time3));
    }

}

