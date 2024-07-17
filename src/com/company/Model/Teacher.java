package com.company.Model;

import com.company.enun.Gender;
import com.company.enun.Staff;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Bio_data {
    private String role;
    private Staff staff;
    private List<Course> teacherCourseList = new ArrayList<>();

    public Teacher(String firstName, String lastName, int age, Gender gender, String role, Staff staff, List<Course> teacherCourseList) {
        super(firstName, lastName, age, gender);
        this.role = role;
        this.staff = staff;
        this.teacherCourseList = teacherCourseList;
    }

    public Teacher(String role, Staff staff, List<Course> teacherCourseList) {
        this.role = role;
        this.staff = staff;
        this.teacherCourseList = teacherCourseList;
    }

    public Teacher() {
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public List<Course> getTeacherCourseList() {
        return teacherCourseList;
    }

    public void setTeacherCourseList(List<Course> teacherCourseList) {
        this.teacherCourseList = teacherCourseList;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "role='" + role + '\'' +
                ", staff=" + staff +
                ", teacherCourseList=" + teacherCourseList +
                '}';
    }
}