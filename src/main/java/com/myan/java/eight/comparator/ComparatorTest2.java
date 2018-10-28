package com.myan.java.eight.comparator;

import com.myan.java.eight.common.ListUtil;
import com.myan.java.eight.common.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * thenComparing接收新的Comparator
 * 新的Comparator又可以嵌套thenComparator
 *
 * Created by myan on 2018/9/17 7:27.
 */
public class ComparatorTest2 {
    public static void main(String[] args) {
        List<Student> list = ListUtil.initStudent();
        System.out.println("====sort by name.length() ====");
        Collections.sort(list, Comparator.comparingInt(student -> {
            return Objects.isNull(student.getName()) ? -1 : student.getName().length();
        }));
        list.forEach(student -> System.out.println(student.getName() + ",\t" + student.getScore()));
        System.out.println("====sort by name.length(), then sort by score ====");
        Collections.sort(list, Comparator.comparingInt((Student student) -> {
            return Objects.isNull(student.getName()) ? -1 : student.getName().length();
            //}).thenComparing(new ScoreCompatator()));
            //}).thenComparing((stu1, stu2) -> stu1.getScore() - stu2.getScore()));
            //}).thenComparingInt(stu1 -> stu1.getScore()));
        }).thenComparing(Comparator.comparingInt(Student::getScore)));
        list.forEach(student -> System.out.println(student.getName() + ",\t" + student.getScore()));
    }

    private static class ScoreCompatator implements Comparator<Student>,java.io.Serializable
    {
        // use serialVersionUID from JDK 1.2.2 for interoperability
        private static final long serialVersionUID = 8575799808933029326L;

        public int compare(Student s1, Student s2) {
           return s1.getScore() - s2.getScore();
        }
    }
}
