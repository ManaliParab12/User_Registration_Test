package com.userregistrationvalidation;

public class UserException extends Exception {
    enum ExceptionType {
<<<<<<< HEAD
        Invali_Input, Null;
=======
        Invalid_First_Name, Invalid_Last_Name, Invalid_Email, Invalid_Mobile, Invalid_Password ;
>>>>>>> UC1_ValidateFirstName
    }

    ExceptionType type;
    public UserException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
<<<<<<< HEAD
}
=======
}

>>>>>>> UC1_ValidateFirstName
