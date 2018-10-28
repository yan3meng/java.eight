package com.myan.java.eight.functioninterface.FunctionTest;


import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * BiDirectory 双向Fucntion，输入参数为2个
 *
 * Created by myan on 2018/8/12 7:55.
 */
public class BiFunctionTest {
    public static void main(String[] args) {
        System.out.println("add res is :" + computeInteger(1, 2, (a, b) -> a + b));
        System.out.println("sub res is :" + computeInteger(1, 2, (a, b) -> a - b));
        System.out.println("mulitply res is :" + computeInteger(1, 2, (a, b) -> a * b));
        System.out.println("divide res is :" + computeInteger(1, 2, (a, b) -> a / b));

        System.out.println("----andThen----");
        Function<Integer, Integer> function = value -> value * value;
        System.out.println(andThen(1, 2, (a, b) -> a + b, function));
    }

    public static int computeInteger(int a, int b, BiFunction<Integer, Integer, Integer> operator)
    {
        return operator.apply(a,b);
    }

    public static int andThen(int a, int b, BiFunction<Integer, Integer, Integer> operator,
                              Function<Integer, Integer> func2)
    {
        return operator.andThen(func2).apply(a, b);
    }
}
