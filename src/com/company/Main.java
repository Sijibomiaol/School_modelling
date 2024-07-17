package com.company;

import com.company.Impliment.PrincipalServiceImplement;
import com.company.Model.Applicant;
import com.company.Model.Principal;
import com.company.Service.PrincipalService;
import com.company.enun.Gender;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Applicant
        Applicant applicant1 = new Applicant("Aderinlewo", "Sijiibomi", 17, Gender.MALE, "650gt", 70 );
//        System.out.println(applicant1.toString());
//        Principal
        PrincipalService principal1 = new PrincipalServiceImplement();
        System.out.println(principal1.getApplicantApprovalForAdmission(applicant1));

//        Courses


    }
}
