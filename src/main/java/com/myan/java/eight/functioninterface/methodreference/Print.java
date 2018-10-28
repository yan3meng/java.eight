package com.myan.java.eight.functioninterface.methodreference;

import java.util.Arrays;
import java.util.List;

/**
 * Created by myan on 2018/8/10 7:37.
 */
public class Print {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[]{1, 2, 3, 4, 5});
        // call function interface by lambda expression
        list.forEach(i -> System.out.println(i));
        // call function interface by method reference
        list.forEach(System.out::print); // Object:methodName  
    }
}
