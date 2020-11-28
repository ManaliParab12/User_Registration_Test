package com.userregistrationvalidation;

import java.util.regex.Pattern;

public class UserRegistration {

    String firstNamePattern = "^[A-Z]{1}[ a-z]{2,25}";

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Validation");
    }

    public boolean validateFirstName(String firstName) {
        return (Pattern.matches(firstNamePattern,firstName));
    }
}
