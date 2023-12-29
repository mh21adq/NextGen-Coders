package com.example.nextgencoders;

import java.util.Date;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private Date dateOfBirth;
    private EducationLevel educationLevel;
    private CodingSkillLevel codingSkillLevel;
    private String institutionName;

    public User(String firstName, String lastName, String email, Date dateOfBirth,
                EducationLevel educationLevel, CodingSkillLevel codingSkillLevel, String institutionName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.educationLevel = educationLevel;
        this.codingSkillLevel = codingSkillLevel;
        this.institutionName = institutionName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public EducationLevel getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(EducationLevel educationLevel) {
        this.educationLevel = educationLevel;
    }

    public CodingSkillLevel getCodingSkillLevel() {
        return codingSkillLevel;
    }

    public void setCodingSkillLevel(CodingSkillLevel codingSkillLevel) {
        this.codingSkillLevel = codingSkillLevel;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }


}