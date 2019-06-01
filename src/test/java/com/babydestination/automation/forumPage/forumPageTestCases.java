package com.babydestination.automation.forumPage;

import com.babydestination.automation.testBase.TestBase;
import com.babydestination.automation.uiActions.forumPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class forumPageTestCases extends TestBase {
    forumPage forumPage;


    @BeforeSuite
    public void setUp() throws InterruptedException, IOException {
        init();
    }

    @Test(groups = {"Regression","Smoke"})
    public void TC_36_0_Forum_Homepage() throws InterruptedException {
        forumPage = new forumPage(driver);
        forumPage.forumsHomepage();

    }

    @Test(groups = {"Regression","Smoke"})
    public void TC_36_1_View_Question() throws InterruptedException {

        forumPage.viewQuestion();

    }

    @Test(groups = {"Regression","smoke"},enabled = true)
    public void TC_37_Forum_Post_Question() throws InterruptedException {

        forumPage.postQuestion();

    }

    @Test(groups = {"Regression","Smoke"})
    public void TC_38_Forum_Post_Answer() throws InterruptedException {

        forumPage.postAnswer();

    }


}



