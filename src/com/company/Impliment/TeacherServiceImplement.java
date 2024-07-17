package com.company.Impliment;

import com.company.Model.Course;
import com.company.Model.Teacher;
import com.company.Service.TeacherService;

public class TeacherServiceImplement implements TeacherService {
    @Override
    public String canTeach(Course course, Teacher teacher) {
       if (teacher.getTeacherCourseList().contains(course))
       {
           return "Teacher can Teach" + course.getCourseTitle() + " " + course.getCourseCode();
       }
        else
       {
           return  "Teacher can't Teach" + course.getCourseTitle() + " " + course.getCourseCode();
       }
    }
}
