package com.driver;

public class Student {

    private String name;
    private int age;
    private double averageScore;

    public Student(String name, int age, double averageScore){
        this.averageScore=averageScore;
        this.age=age;
        this.name=name;

   }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAverageScore() {
        return averageScore;
    }
}
