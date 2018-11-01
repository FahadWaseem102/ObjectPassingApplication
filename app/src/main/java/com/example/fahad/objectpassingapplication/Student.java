package com.example.fahad.objectpassingapplication;

import java.io.Serializable;

public class Student implements  Serializable{
    private String name, fathers_name, city;
    private int roll_no, age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathers_name() {
        return fathers_name;
    }

    public void setFathers_name(String fathers_name) {
        this.fathers_name = fathers_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "Student{ Name: " + name + "\n" + "Father's Name: " + fathers_name + "\n" +
                "Roll No: " + roll_no + "\n" + "Age: " + age + "\n" + "City: " + city + "}" ;
    }
}
