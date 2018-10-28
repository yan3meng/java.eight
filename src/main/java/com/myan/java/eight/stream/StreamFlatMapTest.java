package com.myan.java.eight.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by myan on 2018/8/24 7:48.
 */
public class StreamFlatMapTest {

    public static void main(String[] args) {
        Stream<List<Integer>> intStream = Stream.of(Arrays.asList(1), Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6));
        intStream.flatMap(list -> list.stream()).map(item -> item * item).forEach(System.out::println);
    }
}
