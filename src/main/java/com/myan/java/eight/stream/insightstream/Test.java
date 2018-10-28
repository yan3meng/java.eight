package com.myan.java.eight.stream.insightstream;


import com.myan.java.eight.common.Student;

import java.util.Arrays;
import java.util.List;
/**
 * 静态导入
 */
import static java.util.stream.Collectors.*;

/**
 * Created by myan on 2018/9/1 16:08.
 */
public class Test {

    /**
     * {@link #init()}
     * @param args
     */
    public static void main(String[] args) {
        List<Student> list = init();
        System.out.println("list size is: " + list.stream().collect(counting()));
        System.out.println("list size is: " + list.stream().count());
    }

    private static List<Student> init()
    {
        Student stu1 = new Student("zhangsan", 90);
        Student stu2 = new Student("lisi", 80);
        Student stu3 = new Student("wangwu", 90);
        Student stu4 = new Student("zhaoliu", 85);
        Student stu5 = new Student("zhaoliu", 90);
        return Arrays.asList(stu1, stu2, stu3, stu4, stu5);
    }
}
