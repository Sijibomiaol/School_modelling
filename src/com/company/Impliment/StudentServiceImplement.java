package com.company.Impliment;

import com.company.Model.Classroom;
import com.company.Model.Course;
import com.company.Model.Student;
import com.company.Service.StudentService;

public class StudentServiceImplement implements StudentService {
    @Override
    public String getStudentCourse(Classroom classroom, Student student) {
        if(student.getClassroom().equals(getClass())){
            StringBuilder StudentCourses = new StringBuilder( "Hello" + student.getFirstName()
                    + " " + student.getLastName() + " " + "the courses available for " + " " + student.getClassroom() );
            for(Course CoursesStudent: student.getCourseList())
            {
                StudentCourses.append(CoursesStudent.getCourseTitle()).append("\n");
            }
                return StudentCourses.toString();

        }
        else
        {
            return "You're not a student";
        }
    }
}
