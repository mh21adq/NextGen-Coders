package com.example.nextgencoders;

import org.junit.Before;
import org.junit.Test;
import java.util.Date;

import static org.junit.Assert.*;

public class UserUnitTest {
    private User user;
    private Date dateOfBirth;

    @Before
    public void setUp() {
        // Set up a User object with known values that we can test against.
        dateOfBirth = new Date(); // Use current date for the test
        user = new User("John", "Doe", "john.doe@example.com", dateOfBirth,
                EducationLevel.UNDERGRADUATE, CodingSkillLevel.BEGINNER, "NextGen University");
    }

    @Test
    public void userFirstName_isCorrect() {
        assertEquals("John", user.getFirstName());
    }

    @Test
    public void userLastName_isCorrect() {
        assertEquals("Doe", user.getLastName());
    }

    @Test
    public void userEmail_isCorrect() {
        assertEquals("john.doe@example.com", user.getEmail());
    }

    @Test
    public void userDateOfBirth_isCorrect() {
        assertEquals(dateOfBirth, user.getDateOfBirth());
    }

    @Test
    public void userEducationLevel_isCorrect() {
        assertEquals(EducationLevel.UNDERGRADUATE, user.getEducationLevel());
    }

    @Test
    public void userCodingSkillLevel_isCorrect() {
        assertEquals(CodingSkillLevel.BEGINNER, user.getCodingSkillLevel());
    }

    @Test
    public void userInstitutionName_isCorrect() {
        assertEquals("NextGen University", user.getInstitutionName());
    }
}
