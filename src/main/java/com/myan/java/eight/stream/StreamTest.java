package com.myan.java.eight.stream;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by myan on 2018/8/20 7:46.
 */
public class StreamTest {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("hello", "world");
        //String[] strArr = stringStream.toArray(length -> new String[length]);
        /*String[] strArr = stringStream.toArray(String[]::new);
        Arrays.asList(strArr).forEach(System.out::println);*/
        System.out.println("\r\n====stream to list ====");
        //List<String> stringList = stringStream.collect(Collectors.toList());
        //List<String> stringList = stringStream.collect(() -> new LinkedList<String>(), (list, item) -> list.add(item), (suppilerList, oriList) -> suppilerList.addAll(oriList));
        //List<String> stringList = stringStream.collect(LinkedList::new, LinkedList::add, LinkedList::addAll);
        //stringList.forEach(System.out::println);
        System.out.println("\r\n====stream to list ====");
        List<String> stringList = stringStream.collect(Collectors.toCollection(LinkedList::new));
        stringList.forEach(System.out::println);
    }
}
