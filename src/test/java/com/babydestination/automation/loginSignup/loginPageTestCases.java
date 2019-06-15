package com.babydestination.automation.loginSignup;

import com.babydestination.automation.testBase.TestBase;
import com.babydestination.automation.uiActions.loginSignup;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class loginPageTestCases extends TestBase {
    loginSignup loginSignup;

    @BeforeSuite
    public void setUp() throws InterruptedException, IOException {
        init();
    }


    @Test(enabled = true)
    public void TC_1_Landing_Page() throws InterruptedException {
        loginSignup = new loginSignup(driver);
        loginSignup.fbConnectPresent();
    }
    @Test(enabled = true)
    public void TC_2_FBPopup_Page() throws InterruptedException {

        loginSignup.fbConnectClick();
    }
    @Test(enabled = true)
    public void TC_3_continue_button_clicked() throws InterruptedException {

        loginSignup.continueFBButtonClicked();
    }
//    @Parameters({"FbEmail","FbPassword"})
    @Test(enabled = true)
    public void TC_4_after_continue_button_clicked() throws InterruptedException {

        loginSignup.afterContinueClick();
    }
    @Test(enabled = false)
    public void TC_5_profileAccessDeny() throws InterruptedException {

        loginSignup.profileAccessDeny();
    }
    @Test(enabled = false)
    public void TC_6_profileAccessAllow() throws InterruptedException {

        loginSignup.profileAccessAllow();
    }
    @Test(enabled = false)
    public void TC_7_groupAccessPopupAllow() throws InterruptedException {

        loginSignup.groupAccessPopupAllow();
    }
    @Test(enabled = true)
    public void TC_8_logOutTest() throws InterruptedException {

        loginSignup.logOutTest();
    }

}
