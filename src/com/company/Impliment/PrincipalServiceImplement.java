package com.company.Impliment;

import com.company.Model.Applicant;
import com.company.Model.Student;
import com.company.Service.PrincipalService;

public class PrincipalServiceImplement implements PrincipalService {

    @Override
    public String getApplicantApprovalForAdmission(Applicant applicant) {
        if(applicant.getScore(70) >= 50)
        {
            if (applicant.getAge(16) >=15)
            {
                return " Congratulations!!! You've been admitted to our school";
            }
            else
            {
                return "Sorry!!! We are sorry you didn't score up to the require score.";
            }

        }
        else{
            return "Sorry!!! You're Young ";
        }
    }

    @Override
    public String expelStudent(Student student) {
        if(student.getViolationOfRule().equals(true))
        {
            return "Since you are violate the rules and regulation of the school you are here by expel";
        }
        else
        {
            return  "You are a good student";
        }
    }
}
