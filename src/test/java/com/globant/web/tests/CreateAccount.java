package com.globant.web.tests;

import org.testng.annotations.*;

public class CreateAccount extends BaseTest {

    @BeforeTest
    public void createAccountPage(){
        System.out.println("The user is in the create account page.");
    }

    @BeforeClass
    public void completedFields(){
        System.out.println("The fields in the create account page are all entered.");
    }

    @BeforeMethod
    public void savedInformation(){
        System.out.println("The information of the creation of an account is saved.");
    }

    @Test
    public void createAccount(){
        System.out.println("The name field only has alphanumeric characters");
        System.out.println("The lastname field only has alphanumeric characters");
        System.out.println("The password at leat one special character, at leas three capital letters and minimun 10 alphanumeric characters.");
    }

    @AfterMethod
    public void platformPolicies(){
        System.out.println("The system shows the platform policies");
    }

    @AfterClass
    public void confirmationToast(){
        System.out.println("The system displays a confirmation toast");
    }

    @AfterTest
    public void signOutNewAccount(){
        System.out.println("The platform signs out of the new account.");
    }

}
