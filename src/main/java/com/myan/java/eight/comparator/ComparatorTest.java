package com.myan.java.eight.comparator;

import com.myan.java.eight.common.ListUtil;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by myan on 2018/9/13 7:43.
 */
public class ComparatorTest
{
    public static void main(String[] args) {
        List<String> list = ListUtil.initStringList();
        System.out.println("====compare by str len asc====");
        Collections.sort(list, (item1, item2) -> item1.length() - item2.length());
        System.out.println(list);
        Collections.sort(list, Comparator.comparingInt(String::length).reversed());
        Collections.sort(list, Comparator.comparingInt((String item) -> item.length()).reversed());
        System.out.println("==== reversed compare by comparator static method desc ====");
        System.out.println(list);
        System.out.println("==== compare by comparator static method desc, then compare by case ====");
       /* Collections.sort(list, Comparator.comparingInt((String item) -> item.length()).
            thenComparing((item1, item2) -> item1.toUpperCase().compareTo(item2.toUpperCase())));*/
        Collections.sort(list, Comparator.comparingInt((String item) -> item.length()).
            thenComparing(Comparator.comparing(String::toUpperCase)));
        System.out.println(list);

        System.out.println("==== compare by comparator static method desc, then compare by case, and Comparator.reverseOrder() ====");
        //  Comparator.reverseOrder() 逆序。james -> semaj
        Collections.sort(list, Comparator.comparingInt((String item) -> item.length()).
            thenComparing(Comparator.comparing(String::toUpperCase, Comparator.reverseOrder())));
        System.out.println(list);


    }
}
