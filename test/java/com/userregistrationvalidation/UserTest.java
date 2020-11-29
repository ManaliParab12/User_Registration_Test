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
    public void givenFirstName_whenFirstLetterNotCapital_thenReturnFalse() {
        String name = "manali";
        boolean firstName = userregistration.validateFirstName(name);
        Assert.assertFalse(firstName);
    }

    //TEST TO CHECK  LAST NAME VALID
    @Test
    public void givenLastName_whenLastLetterCapital_thenReturnTrue() {
        String name = "Parab";
        boolean lastName = userregistration.validateLastName(name);
        Assert.assertTrue(lastName);
    }

    //TEST TO CHECK LAST NAME INVALID
    @Test
    public void givenLastName_whenLastLetterNotCapital_thenReturnFalse() {
        String name = "parab";
        boolean lastName = userregistration.validateLastName(name);
        Assert.assertFalse(lastName);
    }

    //TEST TO CHECK  EMAIL ID VALID
    @Test
    public void givenEmailID_whenValid_thenReturnTrue() {
        String emailID = "abc.xyz@bl.co.in";
        boolean emailName = userregistration.validateEmailID(emailID);
        Assert.assertTrue(emailName);
    }

    //TEST TO CHECK EMAIL ID INVALID
    @Test
    public void givenEmailID_whenInvalid_thenReturnFalse() {
        String emailID = "abc";
        boolean emailName = userregistration.validateEmailID(emailID);
        Assert.assertFalse(emailName);
    }
}
