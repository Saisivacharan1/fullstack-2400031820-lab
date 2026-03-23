package com.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int id;
    private String name;
    private String gender;

    private Certification certification;

    @Autowired
    public Student(Certification certification) {
        this.id = 1;
        this.name = "Bhavana";
        this.gender = "Female";
        this.certification = certification;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", certification=" + certification +
                '}';
    }
}