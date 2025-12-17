package test;

import java.io.IOException;
import java.math.BigDecimal;


public class test {
    public static void main(String[] args) throws IOException {

        BigDecimal a = new BigDecimal("10.0");
        BigDecimal b = new BigDecimal("3.2");

        System.out.println(a.remainder(b));
    }

}

