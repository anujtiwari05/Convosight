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
    public void  TC_28_Continue_Button_Text() throws InterruptedException
    {
        blogDetailPage.TC28();
    }
    @Test(groups = {"Regression"})
    public void  TC_29_Related_1_2() throws InterruptedException
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
    public void  TC_32_Lifestage_Breadcrumb_Click() throws InterruptedException
    {
        blogDetailPage.TC32();
    }
    @Test(groups = {"Regression","Smoke"})
    public void  TC_33_Lifestage_Breadcrumb_Click() throws InterruptedException
    {
        blogDetailPage.TC33();
    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_34_DOB_Popup_Submit() throws InterruptedException
    {

        blogDetailPage.TC34();

    }
    @Test(groups = {"Regression","Smoke"})
    public void  TC_35_Lifestage_Breadcrumb_Click() throws InterruptedException
    {
        blogDetailPage.TC35();
    }
    @Test(groups = {"Regression","Smoke"})
    public void  TC_36_Lifestage_Breadcrumb_Click() throws InterruptedException
    {
        blogDetailPage.TC36();
    }
    @Test(groups = {"Regression","Smoke"})
    public void  TC_37_Lifestage_Breadcrumb_Click() throws InterruptedException
    {
        blogDetailPage.TC37();
    }
    @Test(groups = {"Regression","Smoke"})
    public void  TC_38_Lifestage_Breadcrumb_Click() throws InterruptedException
    {
        blogDetailPage.TC38();
    }
    @Test(groups = {"Regression","Smoke"})
    public void  TC_39_Lifestage_Breadcrumb_Click() throws InterruptedException
    {
        blogDetailPage.TC39();
    }
    @Test(groups = {"Regression","Smoke"})
    public void  TC_40_Lifestage_Breadcrumb_Click() throws InterruptedException
    {
        blogDetailPage.TC40();
    }
    @Test(groups = {"Regression","Smoke"})
    public void  TC_41_Lifestage_Breadcrumb_Click() throws InterruptedException
    {
        blogDetailPage.TC41();
    }
    @Test(groups = {"Regression","Smoke"})
    public void  TC_42_Lifestage_Breadcrumb_Click() throws InterruptedException
    {
        blogDetailPage.TC42();
    }
    @Test(groups = {"Regression","Smoke"})
    public void  TC_43_Lifestage_Breadcrumb_Click() throws InterruptedException
    {
        blogDetailPage.TC43();
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
