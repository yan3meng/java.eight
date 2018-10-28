package com.myan.java.eight.collector;

import com.myan.java.eight.common.ListUtil;
import com.myan.java.eight.common.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by myan on 2018/9/10 7:50.
 */
public class CollectGroupingByTest {

    public static void main(String[] args) {
        final List<Student> studentList = ListUtil.initStudent();
        System.out.println("====groupingBy ====");
        Map<Integer, Map<String, List<Student>>> res = studentList.stream().collect(Collectors.groupingBy(Student::getScore,
                Collectors.groupingBy(Student::getName)));
        System.out.println(res);
        System.out.println("====partitionBy ====");
        Map<Boolean, Map<Boolean, List<Student>>> partitionRes =  studentList.stream().collect(Collectors.partitioningBy(student -> student.getScore() > 80,
                Collectors.partitioningBy(student -> student.getScore() >= 90)));
        System.out.println(partitionRes);
    }
}
