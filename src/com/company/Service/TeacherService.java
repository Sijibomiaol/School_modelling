package com.company.Service;

import com.company.Model.Course;
import com.company.Model.Teacher;

public interface TeacherService {
    String canTeach(Course course, Teacher teacher);
}
