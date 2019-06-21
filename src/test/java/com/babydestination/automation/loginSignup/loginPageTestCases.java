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


    @Test(enabled = true,groups = {"convosight_added1"})
    public void TC_1_Landing_Page() throws InterruptedException {
        loginSignup = new loginSignup(driver);
        loginSignup.fbConnectPresent();
    }
    @Test(enabled = true,groups = {"convosight_added2"})
    public void TC_2_FBPopup_Page() throws InterruptedException {

        loginSignup.fbConnectClick();
    }
    @Test(enabled = true,groups = {"convosight_added3"})
    public void TC_3_continue_button_clicked() throws InterruptedException {

        loginSignup.continueFBButtonClicked();
    }
//    @Parameters({"FbEmail","FbPassword"})
    @Test(enabled = true,groups = {"convosight_added4"})
    public void TC_4_after_continue_button_clicked() throws InterruptedException {

        loginSignup.afterContinueClick();
    }
    @Test(enabled = false,dependsOnGroups = {"convosight_added4"},groups = {"convosight_added5"})
    public void TC_5_profileAccessDeny() throws InterruptedException {

        loginSignup.profileAccessDeny();
    }
    @Test(enabled = false,dependsOnGroups = {"convosight_added5"})
    public void TC_6_profileAccessAllow() throws InterruptedException {

        loginSignup.profileAccessAllow();
    }
    @Test(enabled = false,dependsOnGroups = {"convosight_added5","convosight_added4"})
    public void TC_7_groupAccessPopupAllow() throws InterruptedException {

        loginSignup.groupAccessPopupAllow();
    }
    @Test(enabled = true,groups = {"convosight_added6"})
    public void TC_8_logOutTest() throws InterruptedException {

        loginSignup.logOutTest();
    }

}
