package com.myan.java.eight.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by myan on 2018/8/24 7:35.
 */
public class StreamMapTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world");
        //list.stream().map(item -> item.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
        list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);

    }
}
