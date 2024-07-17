package com.company.Impliment;

import com.company.Model.Classroom;
import com.company.Model.Course;
import com.company.Model.Student;
import com.company.Service.ClassroomService;

public class ClassServiceImplement implements ClassroomService {
    @Override
    public String getAttendance(Classroom classroom, Student student) {
        if (classroom.getStudentList().contains(student))
        {
            return "Present";
        }
        else
        {
            return "Absent";
        }

    }

    @Override
    public String getListOfStudentInClass(Student student, Classroom classroom) {
        StringBuilder StudentName = new StringBuilder("Student in class");
        for(Student students : classroom.getStudentList()) {
            StudentName.append(students.getFirstName()).append(students.getLastName());
        }

        return StudentName.toString();
    }

    @Override
    public String CourseListPerClass(Course course, Classroom classroom) {
        StringBuilder ClassCourse = new StringBuilder(("Course available for")+getClass());
        for (Course courses : classroom.getCourseList())
        {
            ClassCourse.append(course.getCourseTitle()).append(" , ");
        }
        return ClassCourse.toString();
    }
}
