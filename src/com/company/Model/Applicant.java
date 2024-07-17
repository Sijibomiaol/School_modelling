package com.company.Model;

import com.company.enun.Gender;

public class Applicant extends Bio_data{
    private String RegNo;
    private int Score;

    public Applicant(String firstName, String lastName, int age, Gender gender, String regNo, int score) {
        super(firstName, lastName, age, gender);
        RegNo = regNo;
        Score = score;
    }

    public Applicant(String regNo, int score) {
        RegNo = regNo;
        Score = score;
    }

    public Applicant(String firstName, String lastName, int age, Gender gender) {
        super(firstName, lastName, age, gender);
    }

    public Applicant() {
    }

    public String getRegNo() {
        return RegNo;
    }

    public void setRegNo(String regNo) {
        RegNo = regNo;
    }

    public int getScore(int i) {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "RegNo='" + RegNo + '\'' +
                ", Score=" + Score +
                '}';
    }
}
