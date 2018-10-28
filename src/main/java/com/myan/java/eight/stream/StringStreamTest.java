package com.myan.java.eight.stream;

import java.util.stream.Stream;

/**
 * Created by myan on 2018/8/26 10:17.
 */
public class StringStreamTest {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "", "world");
        //stream.map(item -> item == null ? "" : item.length() <= 1 ? item : item.substring(0, 1).toUpperCase() + item.substring(1)).forEach(System.out::println);
        stream.map(item ->
        {
            String res = item == null ? "" : item.length() <= 1 ? item : item.substring(0, 1).toUpperCase() + item.substring(1);
            System.out.println("==== middle str ====");
            return res;
        }).forEach(System.out::println); // stream operator is lazy operator
    }
}
