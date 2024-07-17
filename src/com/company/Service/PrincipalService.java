package com.company.Service;

import com.company.Model.Applicant;
import com.company.Model.Student;

public interface PrincipalService {
    String getApplicantApprovalForAdmission(Applicant applicant);
    String expelStudent(Student student);
}
