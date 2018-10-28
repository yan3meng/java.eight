package com.myan.java.eight.common;

import java.util.Arrays;
import java.util.List;

/**
 * Created by myan on 2018/9/9 23:20.
 */
public final class ListUtil {

    private ListUtil(){

    }

    public static List<String> initStringList()
    {
        return Arrays.asList("hello", "james", "what's", "up", "hello");
    }

    public static List<Student> initStudent()
    {
        Student stu1 = new Student("zhangsan", 90);
        Student stu2 = new Student("lisi", 80);
        Student stu3 = new Student("wangwu", 90);
        Student stu4 = new Student("zhaoliu", 90);
        Student stu5 = new Student("zhaoliu", 90);
        Student stu6 = new Student("zhaoliu", 85);
        Student nullStr = new Student(null, 70);
        return Arrays.asList(stu1, stu2, stu3, null, stu4, stu5, stu6, nullStr);
        //return Arrays.asList(stu1, stu2, stu3, stu4, stu5, stu6, nullStr);
    }
}
