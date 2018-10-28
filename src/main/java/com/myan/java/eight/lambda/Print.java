package com.myan.java.eight.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by myan on 2018/8/10.
 */
public class Print {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[]{1, 2, 3, 4, 5});

        // collection().forEach() is 1.8 new attr.
        // anonymous method
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        // lambda expression
        list.forEach(i -> System.out.println(i));
        list.forEach((Integer i) -> System.out.println(i));
    }
}
