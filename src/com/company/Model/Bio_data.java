package com.company.Model;

import com.company.enun.Gender;

public abstract class Bio_data {
    private String firstName;
    private String LastName;
    private int Age;
    private Gender gender;

    public Bio_data(String firstName, String lastName, int age, Gender gender) {
        this.firstName = firstName;
        LastName = lastName;
        Age = age;
        this.gender = gender;
    }

    public Bio_data() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge(int i) {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Bio_data{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Age=" + Age +
                ", gender=" + gender +
                '}';
    }
}

