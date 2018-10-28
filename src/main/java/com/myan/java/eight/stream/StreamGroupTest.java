package com.myan.java.eight.stream;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 分组grouping()
 * 分区 partitionBy
 *
 * Created by myan on 2018/9/1 8:59.
 */
public class StreamGroupTest {
    public static void main(String[] args) {
        List<Student> list = init();
        //gorupingByTest(list);
        //countingTest(list);
        //avgScoreTest(list);
        partitionTest(list);
    }

    private static void partitionTest(List<Student> list) {
        Map<Boolean, List<Student>> res = list.stream().collect(Collectors.partitioningBy(stu -> stu.getScore() >= 90));
        System.out.println(res);
        System.out.println("=== partiotion ===");
        List<Student> highScoreStus = res.get(true);
        highScoreStus.forEach(student -> System.out.println(student.getName() + ", " + student.getScore()));
    }

    private static void avgScoreTest(List<Student> list) {
        Map<String, Double> res = list.stream().collect(Collectors.groupingBy(stu -> stu.getName(),
                Collectors.averagingDouble(Student::getScore)));
        System.out.println(res);
    }

    private static void countingTest(List<Student> list) {
        Map<Integer, Long> res = list.stream().collect(Collectors.groupingBy(stu -> stu.getScore(), Collectors.counting()));
        System.out.println(res);
    }

    private static void gorupingByTest(List<Student> list) {
        Map<String, List<Student>> res = list.stream().collect(Collectors.groupingBy(stu -> stu.getName()));
        //Map<Integer, List<Student>> res = list.stream().collect(Collectors.groupingBy(stu -> stu.getScore()));
        System.out.println(res);
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
class Student
{
    private String name;

    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
