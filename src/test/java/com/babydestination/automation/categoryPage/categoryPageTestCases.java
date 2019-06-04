package com.babydestination.automation.categoryPage;

import com.babydestination.automation.testBase.TestBase;
import com.babydestination.automation.uiActions.blogDetailPage;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class categoryPageTestCases extends TestBase {
    blogDetailPage blogDetailPage=new blogDetailPage(driver);

    @BeforeSuite
    public void setUp()throws InterruptedException, IOException {
        init();
    }

    @Test(groups = {"Regression","Smoke"})
    public void TC_18_Random_Blog_Text() throws InterruptedException
    {
        blogDetailPage=new blogDetailPage(driver);
        blogDetailPage.TC27();

    }

}
