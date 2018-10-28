package com.myan.java.eight.stream;

import java.util.UUID;
import java.util.stream.Stream;

/**
 * Created by myan on 2018/8/24 8:05.
 */
public class StreamGenerateTest {

    public static void main(String[] args) {
        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
        System.out.println("==== stream.findFirst() return an Optional<T> ====");
        stream.findFirst().ifPresent(System.out::print);
    }
}
