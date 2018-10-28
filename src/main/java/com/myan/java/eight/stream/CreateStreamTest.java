package com.myan.java.eight.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by myan on 2018/8/19 10:26.
 */
public class CreateStreamTest {

    public static void main(String[] args) {
        System.out.println("==== create a stream by Stream.of====");
        Stream createByStreamOf = Stream.of("hello", "world");
        String[] strArr = new String[]{"This", "is", "an", "array"};
        Stream createByStreamOfArr = Stream.of(strArr);
        System.out.println("==== \r\nStream.of(Array) equals Arrays.stream ====");
        createByStreamOfArr = Arrays.stream(strArr);
        System.out.println("==== \r\n Stream.of(List) ====");
        List<String> list = Arrays.asList(strArr);
        Stream createByStreamOfList = Stream.of(list);
        System.out.println("==== \r\n Stream.of(List) equals Arrays.stream ====");
        createByStreamOfList = list.stream();
    }
}
