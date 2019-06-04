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



    @Test(groups = {"Regression","smoke"},enabled = true)
    public void TC_37_Forum_Post_Question() throws InterruptedException {

        forumPage.postQuestion();

    }

    @Test(groups = {"Regression","Smoke"})
    public void TC_38_Forum_Post_Answer() throws InterruptedException {

        forumPage.postAnswer();

    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_36_1_View_Question() throws InterruptedException {

        forumPage.viewQuestion();

    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_39_Red_Ans_Button() throws InterruptedException {

        forumPage.redAnsButton();

    }

    @Test(groups = {"Regression","Smoke"})
    public void TC_40_yellow_LS_Tag() throws InterruptedException {

        forumPage.yellowLSTagClick();

    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_41_Cancel_Button_Text() throws InterruptedException {

        forumPage.cancelButtonTest();
        pause3();

    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_42_Infinite_scroll_forumHomepage() throws InterruptedException {

        forumPage.infiniteScroll();
        pause3();

    }

}



