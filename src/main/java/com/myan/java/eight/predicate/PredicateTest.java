package com.myan.java.eight.predicate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by myan on 2018/8/13 7:33.
 */
public class PredicateTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});

        int i = 3;
        System.out.println("==== bigger than " + i + " ====");
        Predicate<Integer> predicate = item -> item > i;
        List<Integer> biggerThanRes = process(list, predicate);
        biggerThanRes.forEach(item -> System.out.print(item + ", "));
        System.out.println("\r\n==== print odd value ====");
        Predicate<Integer> predicateOfOdd = item -> item % 2 == 1;
        List<Integer> oddValueRes = process(list, predicateOfOdd);
        oddValueRes.forEach(item -> System.out.print(item + ", "));

        System.out.println("\r\n==== prediacete, value > 5 && value is even ====");
        Predicate<Integer> preAnd1 = item -> item > 5;
        Predicate<Integer> preAnd2 = item -> item % 2 == 0;
        List<Integer> andTestRes = predicateAndTest(list, preAnd1, preAnd2);
        andTestRes.forEach(value -> System.out.print(value + ", "));
        System.out.println("\r\n==== prediacete negate, value > 5 && value is even ====");
        List<Integer> negateTestRes = predicateNegateTest(list, preAnd1, preAnd2);
        negateTestRes.forEach(value -> System.out.print(value + ", "));
        System.out.println("\r\n==== prediacete isEquals ====");
        boolean isEqualRes = PredicateTest.isEqualTest("test").test("test");
        System.out.println(isEqualRes);
        System.out.println("\r\n==== prediacete isEquals, then or(Predicate p) .test(xx) ====");
        Predicate<String> isEqualsPre = item -> item.equals("xx");
        System.out.println(PredicateTest.isEqualTest("test").or(isEqualsPre).test("test"));

    }

    private static Predicate<String> isEqualTest(Object target)
    {
        return Predicate.isEqual(target);
    }

    private static List<Integer> predicateNegateTest(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> predicate2)
    {
        // lambda and un-lambda
        //return list.stream().filter(predicate.and(predicate2).negate()).collect(Collectors.toList());
        return list.stream().filter(item -> predicate.and(predicate2).negate().test(item)).collect(Collectors.toList());
    }

    private static List<Integer> predicateAndTest(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> predicate2)
    {
        // lambda and un-lambda
        //return list.stream().filter(predicate.and(predicate2)).collect(Collectors.toList());
        return list.stream().filter(item -> predicate.and(predicate2).test(item)).collect(Collectors.toList());
    }

    private static List<Integer> process(List<Integer> list, Predicate<Integer> predicate){
        // lambda and un-lambda
        //return list.stream().filter(item -> predicate.test(item)).collect(Collectors.toList());
        return list.stream().filter(predicate).collect(Collectors.toList());
    }

}
