package com.myan.java.eight.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 给定一个整型集合，求出满足以下条件值
 * 1. 大于2
 * 2. 元素*2
 * 3. 跳过前2个元素
 * 4. 剩余前2个元素的和
 *
 * Created by myan on 2018/8/25 7:40.
 */
public class IntProcessTest {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 5, 7, 9, 11, 12);
        //System.out.println(stream.filter(item -> item > 2).mapToInt(x -> x * 2).skip(2).limit(2).sum());
        //stream.filter(item -> item > 2).mapToInt(x -> x * 2).skip(2).limit(2).min().ifPresent(System.out::print);
        IntSummaryStatistics summaryStatistics = stream.filter(item -> item > 2).mapToInt(x -> x * 2).skip(2).limit(2).summaryStatistics();
        System.out.println(summaryStatistics.getMin());
        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getAverage());

        System.out.println("==== iterate test ====");
        IntStream.iterate(1, i -> i * 2).limit(6).forEach(System.out::println);
        System.out.println("==== distinct test ====");
        IntStream.iterate(1, i -> (i + 1) % 2).limit(6).distinct().forEach(System.out::println);
    }
}
