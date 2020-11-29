package com.userregistrationvalidation;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    UserRegistration userregistration = new UserRegistration();

    //TEST TO CHECK  FIRST NAME VALID
    @Test
    public void givenFirstName_whenFirstLetterCapital_thenReturnTrue() {
        String name = "Manali";
        boolean firstName = userregistration.validateFirstName(name);
        Assert.assertTrue(firstName);
    }

    //TEST TO CHECK FIRST NAME INVALID
    @Test
    public void givenFirstName_whenInvalid_thenReturn() {
        String name = "manali";
        boolean firstName = userregistration.validateFirstName(name);
        Assert.assertFalse(firstName);
    }

    //TEST TO CHECK  LAST NAME VALID
    @Test
    public void givenLastName_whenValid_thenReturn() {
        String name = "Parab";
        boolean lastName = userregistration.validateLastName(name);
        Assert.assertTrue(lastName);
    }

    //TEST TO CHECK LAST NAME INVALID
    @Test
    public void givenLastName_whenInvalid_thenReturn() {
        String name = "parab";
        boolean lastName = userregistration.validateLastName(name);
        Assert.assertFalse(lastName);
    }
}
