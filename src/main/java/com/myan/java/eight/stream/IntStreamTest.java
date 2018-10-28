package com.myan.java.eight.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

/**
 * Created by myan on 2018/8/19 10:34.
 * @see java.util.stream.Stream
 */
public class IntStreamTest {

    public static void main(String[] args) {
        IntStream stream = IntStream.of(new int[]{1, 2 ,3 ,4 , 5, 6, 7, 8});
        stream.forEach(System.out::print);
        System.out.println("\r\n ==== Stream middle method and terminal method test====");
        IntStream.range(3, 8).forEach(System.out::print);
        System.out.println("\r\n ==== compute sum of all elements multiply 2 in an int list====");
        List<Integer> integerList = Arrays.asList(new Integer[]{1, 2, 3});
        Optional<Integer> res = integerList.stream().map(item -> item * 2).reduce(Integer::sum);
        System.out.println(res.orElse(0));
    }
}
