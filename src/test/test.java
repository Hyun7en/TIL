package test;

import java.io.IOException;
import java.util.function.DoubleUnaryOperator;

public class test{

    public static void main(String[] args) throws IOException {
        DoubleUnaryOperator oper;
        oper = Math::abs;

        System.out.println(oper.applyAsDouble(-5));

    }

}


