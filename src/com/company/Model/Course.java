package com.company.Model;

public class Course {
    private String CourseTitle;
    private String CourseCode;

    public Course(String courseTitle, String courseCode) {
        CourseTitle = courseTitle;
        CourseCode = courseCode;
    }

    public Course() {
    }

    public String getCourseTitle() {
        return CourseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        CourseTitle = courseTitle;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String courseCode) {
        CourseCode = courseCode;
    }

    @Override
    public String toString() {
        return "Course{" +
                "CourseTitle='" + CourseTitle + '\'' +
                ", CourseCode='" + CourseCode + '\'' +
                '}';
    }
}
