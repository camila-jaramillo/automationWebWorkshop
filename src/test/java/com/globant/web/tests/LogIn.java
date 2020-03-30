package com.globant.web.tests;

import org.testng.annotations.*;

public class LogIn extends BaseTest{

    @BeforeTest
    public void logInPage() {
        System.out.println("The user is in the logIn page.");
    }

    @BeforeClass
    public void completeFields() {
        System.out.println("The fields user and password are entered.");
    }

    @BeforeMethod
    public void confirmInformation() {
        System.out.println("The information of the user and password is confirmed.");
    }

    @Test
    public void logIn() {
        System.out.println("The name exists in the DB");
        System.out.println("The password related to the name is the same one as the one entered");
    }

    @AfterMethod
    public void chargingInformation() {
        System.out.println("The system loads the client information");
    }

    @AfterClass
    public void confirmationToast() {
        System.out.println("The system displays a confirmation toast");
    }

    @AfterTest
    public void signInAccount() {
        System.out.println("The platform sign in into the account.");
    }
}
