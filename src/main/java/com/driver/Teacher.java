package com.driver;

public class Teacher {

    private String name;

    private int numberOfStudents;

    private int age;



    public Teacher(String name,int age,int numberOfStudents) {
        this.name=name;
        this.age=age;
        this.numberOfStudents=numberOfStudents;

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