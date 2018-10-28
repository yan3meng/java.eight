package com.myan.java.eight.lambda;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by myan on 2018/8/10 7:55.
 */
public class LambdaContext {
    public static void main(String[] args) {
        // 通过 MyInterface 引用判断lambda表示的函数式接口类型
        MyInterface i1 = () -> {
        };
        System.out.println(i1.getClass().getInterfaces()[0]);

        MyInterface2 i2 = System.out::print; // method reference
        System.out.println(i2.getClass().getInterfaces()[0]);

        new Thread(() -> System.out.println("hello world")).start();

        List<String> list = Arrays.asList(new String[]{"words", "to", "uppercase"});
        //list.forEach(i -> System.out.println(i.toUpperCase()));
        List<String> upperCaseList = new LinkedList<>();
        list.forEach(i -> upperCaseList.add(i.toUpperCase()));
        upperCaseList.forEach(System.out::println);

        //list.stream().map(item -> item.toUpperCase()).forEach(item -> System.out.println(item));
        list.stream().map(String :: toUpperCase).forEach(item -> System.out.println(item));

    }
}

@FunctionalInterface
interface MyInterface
{
    void method();
}

@FunctionalInterface
interface MyInterface2
{
    void method2(int i);
}
