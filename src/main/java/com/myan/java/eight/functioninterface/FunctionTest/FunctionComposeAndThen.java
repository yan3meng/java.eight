package com.myan.java.eight.functioninterface.FunctionTest;

import java.util.function.Function;

/**
 * Created by myan on 2018/8/12 7:41.
 */
public class FunctionComposeAndThen {
    public static void main(String[] args) {
        Function<Integer, Integer> func1 = value -> 2 * value;
        Function<Integer, Integer> func2 = value -> 3 + value;
        System.out.println("----compose----");
        final int composeRes = FunctionComposeAndThen.composeCompute(1, func1, func2);
        System.out.println(composeRes);
        System.out.println("----andThen----");
        final int andThenRes = FunctionComposeAndThen.andThenCompute(1, func1, func2);
        System.out.println(andThenRes);

    }

    public static int composeCompute(int a, Function<Integer, Integer> fun1, Function<Integer, Integer> fun2)
    {
        return fun1.compose(fun2).apply(a);
    }

    public static int andThenCompute(int a, Function<Integer, Integer> fun1, Function<Integer, Integer> fun2)
    {
        return fun1.andThen(fun2).apply(a);
    }
}
