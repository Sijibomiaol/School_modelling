package com.company.Model;

import com.company.enun.Gender;

import java.util.List;

public class Student extends Bio_data {
    private Classroom classroom;
    private List <Course> courseList;
    private String conduct;
    private Boolean violationOfRule;

    public Student(String firstName, String lastName, int age, Gender gender, Classroom classroom, List<Course> courseList, String conduct, Boolean violationOfRule) {
        super(firstName, lastName, age, gender);
        this.classroom = classroom;
        this.courseList = courseList;
        this.conduct = conduct;
        this.violationOfRule = violationOfRule;
    }

    public Student(Classroom classroom, List<Course> courseList, String conduct, Boolean violationOfRule) {
        this.classroom = classroom;
        this.courseList = courseList;
        this.conduct = conduct;
        this.violationOfRule = violationOfRule;
    }

    public Student() {
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public String getConduct() {
        return conduct;
    }

    public void setConduct(String conduct) {
        this.conduct = conduct;
    }

    public Boolean getViolationOfRule() {
        return violationOfRule;
    }

    public void setViolationOfRule(Boolean violationOfRule) {
        this.violationOfRule = violationOfRule;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classroom=" + classroom +
                ", courseList=" + courseList +
                ", conduct='" + conduct + '\'' +
                ", violationOfRule=" + violationOfRule +
                '}';
    }
}

