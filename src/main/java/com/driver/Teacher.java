package com.driver;

public class Teacher {

    private String name;

    private int numberOfStudents;

    private int age;

    public Teacher(String name,int age) {
        this.name=name;
        this.age=age;
        //numberOfStudents=0;

    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public int getAge() {
        return age;
    }


}