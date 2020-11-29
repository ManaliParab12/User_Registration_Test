package com.userregistrationvalidation;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EmailValidation {
    String emailAddress;
    boolean expected;

    public EmailValidation(String emailAddress, boolean expected) {
        this.emailAddress = emailAddress;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> email() {
        return Arrays.asList(new Object[][] {
                { "abc.100@yahoo.com", true },
                { "abc111@abc.com", true },
                { "abc.100@gmail.com.au", true },
                { "abc100@gmail.com", true },
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {"abc.@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
        });
    }

    @Test
    public void givenEmailId_whenValid_MustRetrunResult() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertEquals(expected, userRegistration.validateSampleEmail(emailAddress));
    }
}