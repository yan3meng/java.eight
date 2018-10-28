package com.myan.java.eight.collector;

import com.myan.java.eight.common.ListUtil;
import com.myan.java.eight.common.Student;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by myan on 2018/9/9 23:17.
 */
public class CollectorTest {

    public static void main(String[] args) {

        List<Student> studentList = ListUtil.initStudent();
        System.out.println("====print the studeng's name who got the min grade.====");
        studentList.stream().collect(Collectors.minBy(Comparator.comparingInt(student -> {
            if (student == null) {
                return -1;
            }
            else
            {
                return student.getScore();
            }
        }))).ifPresent(student -> System.out.println(student.getName()));
        System.out.println("====print the studeng's name who got the MAX grade.====");
        studentList.stream().collect(Collectors.maxBy(Comparator.comparingInt(student -> student.getScore())))
                .ifPresent(student -> System.out.println(student.getName()));
        System.out.println("====print the studeng's name who got the avg grade.====");
        System.out.println(studentList.stream().collect(Collectors.averagingInt(Student::getScore))) ;
        System.out.println("====print the summing int.====");
        System.out.println(studentList.stream().collect(Collectors.summingInt(Student::getScore)));
        System.out.println("====print the summarizing statics int.====");
        final IntSummaryStatistics intSummaryStatistics = studentList.stream().collect(Collectors.summarizingInt(Student::getScore));
        System.out.println(intSummaryStatistics);
        System.out.println("====print all names of students.====");
        System.out.println(studentList.stream().map(Student::getName).collect(Collectors.joining(",")));
    }
}
