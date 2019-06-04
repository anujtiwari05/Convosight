package com.babydestination.automation.homePage;

import com.babydestination.automation.testBase.TestBase;
import com.babydestination.automation.uiActions.HomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class homePageTestCases extends TestBase {
    HomePage homePage;

    @BeforeSuite(alwaysRun = true)
    public void setUp()throws InterruptedException,IOException, IOException {
        init();
    }

    @Test(groups = {"Regression","Smoke"},enabled = false)
    public void TC1_TopHeader_Present() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.TC1_TopHeader_Present();
    }
    @Test(groups = {"Regression"},enabled = false)
    public void TC2_menuHeader_Present() throws InterruptedException,IOException {

        homePage.TC2_menuHeader_Present();
    }
    @Test(groups = {"Regression"},enabled = false)
    public void TC3_footer_Present() throws InterruptedException,IOException {

        homePage.TC3_footer_Present();
    }
    @Test(groups = {"Regression","Smoke"},enabled = false)
    public void TC4_widgets_ask_WA_Present() throws InterruptedException,IOException {

        homePage.TC4_widgets_ask_WA_Present();
    }
    @Test(groups = {"Regression","Smoke"},enabled = false)
    public void TC5_all_categories_postcard_present()throws InterruptedException,IOException {

        homePage.TC5_all_categories_postcard_present();
    }
    @Test(groups = {"Regression","Smoke"},enabled = false)
    public void TC6_click_blog() throws InterruptedException,IOException {

        homePage.TC6_click_blog();
    }
    @Test(groups = {"Regression","Smoke"},enabled = false)
    public void TC7_click_seeAll() throws InterruptedException,IOException {

        homePage.TC7_click_seeAll();
    }
    @Test(groups = {"Regression","Smoke"},enabled = false)
    public void TC8_expert_popup_submit() throws InterruptedException,IOException {

        homePage.TC8_expert_popup_submit();
    }
    @Test(groups = {"Regression","Smoke"},enabled = false)
    public void TC9_whatsapp_directory_page() throws InterruptedException,IOException {

        homePage.TC9_whatsapp_directory_page();
    }
    @Test(groups = {"Regression","Smoke"},enabled = false)
    public void TC10_video_blog_open() throws InterruptedException,IOException {

        homePage.TC10_video_blog_open();
    }
    @Test(groups = {"Regression","Smoke"},enabled = false)
    public void TC11_card_blog_open() throws InterruptedException,IOException {

        homePage.TC11_card_blog_open();
    }
    @Test(groups = {"Regression","Smoke"},enabled = false)
    public void TC12_all_sections_present() throws InterruptedException,IOException {

        homePage.TC12_all_sections_present();
    }
    @Test(groups = {"Regression","Smoke"},enabled = false)
    public void TC13_partner_us_page() throws InterruptedException,IOException {

        homePage.TC13_partner_us_page();
    }
    @Test(groups = {"Regression","Smoke"},enabled = false)
    public void TC14_language_dropdown() throws InterruptedException,IOException {

        homePage.TC14_language_dropdown();
    }
    @Test(groups = {"Regression"},enabled = false)
    public void TC15_Footer_social_links_redirection() throws InterruptedException,IOException {


        homePage.TC15_Footer_social_links_redirection();
    }
    @Test(groups = {"Regression"},enabled = false)
    public void TC16_Footer_pages_links_redirection() throws InterruptedException,IOException {


        homePage.TC16_Footer_pages_links_redirection();
    }
    @Test(groups = {"Regression"},enabled = false)
    public void TC17_search_page() throws InterruptedException,IOException {


        homePage.TC17_search_page();
    }

}
