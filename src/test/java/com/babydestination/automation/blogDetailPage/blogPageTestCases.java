package com.babydestination.automation.blogDetailPage;

import com.babydestination.automation.testBase.TestBase;
import com.babydestination.automation.uiActions.blogDetailPage;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class blogPageTestCases extends TestBase {
    blogDetailPage blogDetailPage=new blogDetailPage(driver);

    @BeforeSuite
    public void setUp()throws InterruptedException, IOException {
        init();
    }

    @Test(groups = {"Regression","Smoke"})
    public void TC_27_1_Random_Blog_Text() throws InterruptedException
    {
        blogDetailPage=new blogDetailPage(driver);
        blogDetailPage.TC27();

    }

    @Test(groups = {"Regression"})
    public void  TC_28_Related1_Random_Blog_Text() throws InterruptedException
    {
        blogDetailPage.TC28();
    }
    @Test(groups = {"Regression"})
    public void  TC_29_Related2_Random_Blog_Text() throws InterruptedException
    {
       blogDetailPage.TC29();
    }
    @Test(groups = {"Regression","Smoke"},enabled = false)
    public void  TC_30_Read_More_Random_Blog_Text() throws InterruptedException
    {
        blogDetailPage.TC30();
    }
    @Test(groups = {"Regression","Smoke"})
    public void  TC_31_Lifestage_Breadcrumb_Click() throws InterruptedException
    {
        blogDetailPage.TC31();
    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_32_DOB_Popup_Submit() throws InterruptedException
    {

        blogDetailPage.TC32();
        Quit();
    }

//    @Test(priority = 1)
//    public void TC_33_DOB_Popup_Submit() throws InterruptedException
//    {
//      blogDetailPage=new blogDetailPage(driver);
//
//        blogDetailPage.TC33();
//
//    }
//    @Test(priority = 2)
//    public void TC_34_DOB_Popup_Submit() throws InterruptedException
//    {
//
//        blogDetailPage.TC34();
//
//    }
//    @Test(priority = 3)
//    public void TC_35_DOB_Popup_Submit() throws InterruptedException
//    {
//
//        blogDetailPage.TC35();
//
//
//    }

}
