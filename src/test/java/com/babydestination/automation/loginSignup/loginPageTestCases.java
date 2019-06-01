package com.babydestination.automation.loginSignup;

import com.babydestination.automation.testBase.TestBase;
import com.babydestination.automation.uiActions.loginSignup;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class loginPageTestCases extends TestBase {
    loginSignup loginSignup;

    @BeforeSuite
    public void setUp() throws InterruptedException, IOException {
        init();
    }


    @Test(enabled = true)
    public void TC_33_Header_Login_Button() throws InterruptedException {
        loginSignup = new loginSignup(driver);
        loginSignup.loginSignupHeader();
//        loginSignup.loginSignupLink();
//        loginSignup.signUp();
    }
    @Test(enabled = true)
    public void TC_34_Login() throws InterruptedException {
        loginSignup.login();

    }

    @Test(enabled = true)
    public void TC_35_Logout() throws InterruptedException {

        loginSignup.logOut();

    }



}
