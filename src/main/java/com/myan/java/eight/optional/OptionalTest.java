package com.myan.java.eight.optional;

import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;

import java.util.Optional;

/**
 * Created by myan on 2018/8/16 7:32.
 */
public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
       /* if (optional.isPresent())
        {
            System.out.println(optional.get());
        }*/
       optional.ifPresent(item -> System.out.println(item)); // Optional推荐使用方式

        System.out.println("==== optional orelse test");
        Optional<String> optionalOfNull = Optional.empty();
        System.out.println(optionalOfNull.orElse("world"));
        System.out.println(optionalOfNull.orElseGet(() -> "world"));
    }
}
