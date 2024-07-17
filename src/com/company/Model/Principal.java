package com.company.Model;

import com.company.enun.Gender;

public class Principal extends Bio_data{
    private Teacher teacher;

    public Principal(String firstName, String lastName, int age, Gender gender, Teacher teacher) {
        super(firstName, lastName, age, gender);
        this.teacher = teacher;

    }

    public Principal(Teacher teacher) {
        this.teacher = teacher;
    }

    public Principal() {
    }

    public Teacher getStaff() {
        return teacher;
    }

    public void setStaff(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "staff=" + teacher +
                '}';
    }
}
