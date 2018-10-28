package com.myan.java.eight.methodreference;

/**
 * Created by myan on 2018/8/17 7:43.
 */
public class Student {

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

    public static int compareByScore(Student stu1, Student stu2)
    {
        return stu1.getScore() - stu2.getScore();
    }

    public static int compareByName(Student stu1, Student stu2)
    {
        return stu1.getName() == null ? -1 : stu1.getName().compareToIgnoreCase(stu2.getName());
    }
}
