package com.xworkz.dto;


import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    public  Student(){
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int s_id;
    private String s_name;
    private String s_course;
    private int s_age;

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_course() {
        return s_course;
    }

    public void setS_course(String s_course) {
        this.s_course = s_course;
    }

    public int getS_age() {
        return s_age;
    }

    public void setS_age(int s_age) {
        this.s_age = s_age;
    }
}
