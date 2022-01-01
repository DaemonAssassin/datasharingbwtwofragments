package com.gmail.mateendev3.datasharingbwfragments.model;

public class Student {

    private String name;
    private int rollNo;
    private Byte age;

    public Student(String name, int rollNo, Byte age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public Byte getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nAge: %s\nRollNo: %s",
                name, age, rollNo);
    }
}
