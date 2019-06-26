package com.babydestination.automation;
import org.testng.TestNG;
import com.babydestination.automation.homePage.homePageTestCases;


public class TestRunner {
    static TestNG testNG;
    public static void main(String[] args) {

        testNG=new TestNG();
        testNG.setTestClasses(new Class[] {homePageTestCases.class});
        testNG.run();
    }
}
