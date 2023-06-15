package org.createClasses;

public class NewStudent {
    private int roll;
    private String name;
    private String course;
    private int m1;
    private int m2;
    private int m3;

    public NewStudent(int roll, String name, String course, int m1, int m2, int m3) {
        this.roll = roll;
        this.name = name;
        this.course = course;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public int getTotal() {
        return m1 + m2 + m3;
    }

    public double getAverage() {
        return getTotal() / 3.0;
    }

    public char getGrade() {
        double averageScore = getAverage();
        if (averageScore >= 70) {
            return 'A';
        } else if (averageScore >= 60) {
            return 'B';
        } else if (averageScore >= 50) {
            return 'C';
        } else if (averageScore >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

