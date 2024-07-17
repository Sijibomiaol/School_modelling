package com.company.Service;

import com.company.Model.Classroom;
import com.company.Model.Course;
import com.company.Model.Student;

import java.util.List;

public interface ClassroomService {
String getAttendance(Classroom classroom, Student student);
String getListOfStudentInClass(Student student, Classroom classroom);
String CourseListPerClass(Course course, Classroom classroom);

}
