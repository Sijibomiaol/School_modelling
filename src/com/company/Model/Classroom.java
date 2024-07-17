package com.company.Model;

import java.util.List;

public class Classroom {
    private String Classname;
    private List<Student> studentList;
    private Boolean Attendance;
    private List<Course> courseList;

    public Classroom(String classname, List<Student> studentList, Boolean attendance, List<Course> courseList) {
        Classname = classname;
        this.studentList = studentList;
        Attendance = attendance;
        this.courseList = courseList;
    }

    public Classroom() {
    }

    public String getClassname() {
        return Classname;
    }

    public void setClassname(String classname) {
        Classname = classname;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Boolean getAttendance() {
        return Attendance;
    }

    public void setAttendance(Boolean attendance) {
        Attendance = attendance;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "Classname='" + Classname + '\'' +
                ", studentList=" + studentList +
                ", Attendance=" + Attendance +
                ", courseList=" + courseList +
                '}';
    }
}