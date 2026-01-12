package test;


public class test {
    enum Rainbow{
        RED,ORANGE
    }
    public static void main(String[] args)   {
        Rainbow[] arr = Rainbow.values();

        for (Rainbow rb : arr){
            System.out.println(rb);
        }
    }

}

