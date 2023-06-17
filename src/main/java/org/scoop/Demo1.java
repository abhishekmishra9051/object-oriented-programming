package org.scoop;

import java.util.Arrays;

class Subject {
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtains;

    public Subject(String subID, String name, int maxMarks){
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public Subject(String subID, String name, int maxMarks, int marksObtains){
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
        this.marksObtains = marksObtains;
    }

    public String getSubID(){ return subID;}
    public String getName(){ return name;}
    public int getMaxMarks() { return maxMarks; }
    public int getMarksObtains() { return marksObtains; }

    public void setMaxMarks(int maxM){ maxMarks = maxM;}

    public void setMarksObtains(int marksObtains) {
        this.marksObtains = marksObtains;
    }

    boolean isQualified()
    {
        return marksObtains>=maxMarks/10*4;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subID='" + subID + '\'' +
                ", name='" + name + '\'' +
                ", maxMarks=" + maxMarks +
                ", marksObtains=" + marksObtains +
                '}';
    }
}

class Student {
    private int roll;
    private String name;
    private String dept;
    private String[] subjects;

    public Student(int roll, String name, String dept, String[] subjects) {
        this.roll = roll;
        this.name = name;
        this.dept = dept;
        this.subjects = subjects;
    }

    public int getRoll() { return roll;}
    public String getName() { return name;}
    public String getDept(){ return dept;}
    public String[] getSubjects(){ return  subjects;}
    public void setSubjects(String[] subjects){ this.subjects = subjects; }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Subject subs[]=new Subject[3];
        subs[0]=new Subject("s101","DS",100);
        subs[1]=new Subject("s102","Algorithms",100);
        subs[2]=new Subject("s103","Operating Systems",100);

        for(Subject s:subs)
            System.out.println(s);

        String[] subjects = {"Mathematics", "Physics", "Chemistry"};
        Student student = new Student(1, "Abhishek Mishra", "Science", subjects);

        System.out.println("Roll: " + student.getRoll());
        System.out.println("Name: " + student.getName());
        System.out.println("Department: " + student.getDept());
        System.out.println("Subjects: ");
        for (String subject : student.getSubjects()) {
            System.out.println("- " + subject);
        }
//        for(String sub : subjects)
//            System.out.println(sub);
    }
}
