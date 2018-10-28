package com.myan.java.eight.stream;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 筛选掉重复字符串，并输出
 * --其中字符串中单词以一个空格分隔
 * Created by myan on 2018/8/30 7:38.
 */
public class PrintDistinctStr {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello world", null, "This is new world", "hello");

        //List<String> res = list.stream().map(item -> item.split("")).flatMap(arr -> Arrays.stream(arr)).distinct().collect(Collectors.toList());
        List<String> res = list.stream().filter(item -> item != null).map(item -> item.split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        res.forEach(System.out::println);

    }
}
