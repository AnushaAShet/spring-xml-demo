package com.stackroute.springapplication.beans;

import org.springframework.beans.factory.annotation.Autowired;


public class Actor {
    private String name;
    private String gender;
    private int age;


    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
