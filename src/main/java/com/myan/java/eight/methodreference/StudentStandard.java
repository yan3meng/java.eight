package com.myan.java.eight.methodreference;

/**
 * Created by myan on 2018/8/18 22:48.
 */
public class StudentStandard {

    private String name;

    private int score;

    public StudentStandard(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int compareByName(StudentStandard studentStandard)
    {
        return this.name == null ? -1 : this.name.compareToIgnoreCase(studentStandard.getName());
    }

    public int compareByScore(StudentStandard studentStandard)
    {
        return this.getScore() - studentStandard.getScore();
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
