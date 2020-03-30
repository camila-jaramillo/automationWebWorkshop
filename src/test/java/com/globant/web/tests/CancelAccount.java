package com.globant.web.tests;

import org.testng.annotations.*;

public class CancelAccount extends BaseTest {

    @BeforeTest
    public void logInPage() {
        System.out.println("The user is in the logIn page.");
    }

    @BeforeClass
    public void logIn() {
        System.out.println("The user logs in.");
    }

    @BeforeMethod
    public void cancelRegistrationPage() {
        System.out.println("The user goes to the configuration page. ");
        System.out.println("The user clicks on the cancel registration. ");
        System.out.println("The user enters name and password. ");
    }

    @Test
    public void cancelRegistration() {
        System.out.println("The name exists in the DB");
        System.out.println("The password related to the name is the same one as the one entered");
    }

    @AfterMethod
    public void chargingInformation() {
        System.out.println("The system load the client information");
    }

    @AfterClass
    public void confirmationToast() {
        System.out.println("The system displays a toast: ¿Do you really want to cancel the account? ");
        System.out.println("The system displays a confirmation button");
    }

    @AfterTest
    public void deleteAccount() {
        System.out.println("The platform deletes the account.");
    }
}
