package com.babydestination.automation.homePage;

import com.babydestination.automation.testBase.TestBase;
import com.babydestination.automation.uiActions.HomePage;
import org.apache.commons.mail.EmailException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import javax.mail.MessagingException;
import java.io.IOException;

public class homePageTestCases extends TestBase {
    HomePage homePage;

    @BeforeSuite(alwaysRun = true)
    public void setUp()throws InterruptedException, IOException {
        init();
    }

    @Test(groups = {"Regression","Smoke"},priority = 1)
    public void TC1_landingPageLoaded() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.homepage_element_test();
    }
    @Test(groups = {"Regression","Smoke"},priority = 2)
    public void TC2_login_buttonclick_test() throws InterruptedException, IOException, EmailException, MessagingException {
        homePage = new HomePage(driver);
        homePage.login_buttonclick_test();
    }

    @Test(groups = {"Regression","Smoke"},priority = 3)
    public void TC3_login_test() throws InterruptedException,IOException, EmailException {
        homePage = new HomePage(driver);
        homePage.login_test();

    }
    @Test(groups = {"Regression","Smoke"},priority = 4)
    public void TC4_categoryLink_conversationTab_test() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.categoryLink_conversationTab_test();
    }
    @Test(groups = {"Regression","Smoke"},priority = 5)
    public void TC5_categoryLink_keywordTab_test() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.categoryLink_keywordTab_test();
    }
    @Test(groups = {"Regression","Smoke"},priority = 6)
    public void TC6_categoryLink_WordcloudTab_test() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.categoryLink_WordcloudTab_test();
    }
    @Test(groups = {"Regression","Smoke"},priority = 7)
    public void TC7_subCategory_Linkclick_test() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.subCategory_Linkclick_test();
    }
    @Test(groups = {"Regression","Smoke"},priority = 8)
    public void TC8_subCategoryLink_conversationTab_test() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.subCategoryLink_conversationTab_test();
    }
    @Test(groups = {"Regression","Smoke"},priority = 9)
    public void TC9_subCategoryLink_KeywordTab_test() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.subCategoryLink_KeywordTab_test();
    }
    @Test(groups = {"Regression","Smoke"},priority = 10)
    public void TC10_subCategoryLink_SOVTab_test() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.subCategoryLink_SOVTab_test();
    }
    @Test(groups = {"Regression","Smoke"},priority = 11)
    public void TC11_subCategoryLink_WordcloudTab_test() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.subCategoryLink_WordcloudTab_test();
    }
    @Test(groups = {"Regression","Smoke"},priority = 12)
    public void TC12_brand_Linkclick_test() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.brand_Linkclick_test();
    }
    @Test(groups = {"Regression","Smoke"},priority = 13)
    public void TC13_brand_conversationTab_test() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.brand_conversationTab_test();
    }
    @Test(groups = {"Regression","Smoke"},priority = 14)
    public void TC14_brand_KaeywordTab_test() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.brand_KeywordTab_test();
    }
    @Test(groups = {"Regression","Smoke"},priority = 15)
    public void TC15_brand_SentimentTab_test() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.brand_SentimentTab_test();
    }
    @Test(groups = {"Regression","Smoke"},priority = 16)
    public void TC16_brand_WordcloudTab_test() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.brand_WordcloudTab_test();
    }
    @Test(groups = {"Regression","Smoke"},priority = 17)
    public void TC17_filter_button_clickable_test() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.filter_Button_Test();
    }
    @Test(groups = {"Regression","Smoke"},priority = 18)
    public void TC18_logout_button_test() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.logout_Button_Test();
    }

}
