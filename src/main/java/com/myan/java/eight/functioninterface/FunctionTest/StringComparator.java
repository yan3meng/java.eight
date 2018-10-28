package com.myan.java.eight.functioninterface.FunctionTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by myan on 2018/8/11 7:27.
 */
public class StringComparator {

    public static void main(String[] args) {
        List<String> list = Arrays.asList(new  String[]{"zsan", "lsi", "wwu"});
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // reverse sort
            }
        });
        System.out.println(list);

        // lambda expression
        Collections.sort(list, (String o1, String o2) -> {return o2.compareTo(o1);});
        System.out.println(list);

        Collections.sort(list, (o1, o2) -> o2.compareTo(o1));
        System.out.println(list);
    }

}
