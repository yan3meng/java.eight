package com.myan.java.eight.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 2个字符串数组，第一个数组中的每个元素作为首字符串分别与第二组中的每个元素结合组成新的字符串，并打印
 *
 * Created by myan on 2018/8/31 7:39.
 */
public class DoubleCycle {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("1", "2", "3");
        List<String> list2 = Arrays.asList("a", "b", "c");
        List<String> res = list1.stream().flatMap(item -> {
            return list2.stream().map(item2 -> item + item2);
        }).collect(Collectors.toList());
        res.forEach(System.out::println);
    }
}
