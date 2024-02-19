package com.example.RestStudent1.entity;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;

@Entity
@Table(name="student")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String quif;

    public Student(Integer id) {
        this.id = id;
    }

    public Student(int i, String dhoni, String cricter) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuif() {
        return quif;
    }

    public void setQuif(String quif) {
        this.quif = quif;
    }
}
