package com.myan.java.eight.functioninterface.FunctionTest;

import java.util.function.Function;

/**
 * Created by myan on 2018/8/11 7:45.
 */
public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest.compute(1, value -> 2 * value);
        FunctionTest.convert(1, value -> String.valueOf(value));

    }

    public static int compute(int i, Function<Integer, Integer> function){
        return function.apply(i);
    }

    public static String convert(int i, Function<Integer, String> function){
        return function.apply(i);
    }
}
