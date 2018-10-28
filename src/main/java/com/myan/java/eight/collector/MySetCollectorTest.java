package com.myan.java.eight.collector;

import com.myan.java.eight.common.ListUtil;

import java.util.List;
import java.util.Set;

/**
 * Created by myan on 2018/9/26 7:40.
 */
public class MySetCollectorTest {
    public static void main(String[] args) {
        List<String> stringList = ListUtil.initStringList();
        Set<String> set = stringList.stream().collect(new MySetCollector<String>());
        System.out.println(set);
    }
}
