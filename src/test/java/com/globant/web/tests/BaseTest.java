package com.globant.web.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Parent of the other classes of test.
 *
 * @author María Camila Jaramillo Benavides
 */
public class BaseTest {

    @BeforeSuite
    public void mainPage() {
        System.out.println("The user gets to the platform main page.");
    }

    @AfterSuite
    public void finalEndPage() {
        System.out.println("The user is taken by the platform to the main page.");
    }

}
