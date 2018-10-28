package com.myan.java.eight.functioninterface.FunctionTest;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * Created by myan on 2018/8/15 7:37.
 */
public class BinaryOperatorTest {

    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        BinaryOperator<Integer> addOper = (a, b) -> a + b;
        System.out.println(calculate(x, y, addOper));
        BinaryOperator<Integer> subOper = (a, b) -> a - b;
        System.out.println(calculate(x, y, subOper));

        System.out.println("==== BinaryOperator minBy(Comparator) test");
        Comparator<String> comparator = (value1, value2) -> value1 == null ? -1 : (value2 == null ? 1 : value1.length() - value2.length());
        System.out.println(BinaryOperator.minBy(comparator).apply("xx", "xxx"));
    }

    private static int calculate(int a, int b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    private static String getMinValue(String value1, String value2, Comparator<String> comparator)
    {
        return BinaryOperator.maxBy(comparator).apply(value1, value2);
    }
}
