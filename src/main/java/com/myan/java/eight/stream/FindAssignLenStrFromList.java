package com.myan.java.eight.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 找出第一个长度为5的字符串
 * Created by myan on 2018/8/29 7:48.
 */
public class FindAssignLenStrFromList {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello1", null, "world", "hello world");
        list.stream().mapToInt(item -> {
            int res = item == null ? -1 : item.length();
            System.out.print(res + "\t");
            return res;
        }).filter(item -> item == 5).findFirst().ifPresent(System.out::println);
    }
}
