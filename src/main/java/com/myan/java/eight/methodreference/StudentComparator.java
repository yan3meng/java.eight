package com.myan.java.eight.methodreference;

/**
 * Created by myan on 2018/8/18 7:51.
 */
public class StudentComparator {

    public int compareByScore(Student stu1, Student stu2)
    {
        return stu1.getScore() - stu2.getScore();
    }

    public int compareByName(Student stu1, Student stu2)
    {
        return stu1.getName() == null ? -1 : stu1.getName().compareToIgnoreCase(stu2.getName());
    }
}
