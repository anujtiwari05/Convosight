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

    @Test(groups = {"Regression","Smoke"})
    public void TC_001_Text_Blog() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.TC1();
    }
    @Test(groups = {"Regression"})
    public void TC_002_Partnert_Us() throws InterruptedException,IOException {

        homePage.TC2();
    }
    @Test(groups = {"Regression"})
    public void TC_003_Homepage_Navigate_from_PartnerUs() throws InterruptedException,IOException {

        homePage.TC3();
    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_004_Video_Blog() throws InterruptedException,IOException {

        homePage.TC4();
    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_005_Homepage_Navigate_from_Video() throws InterruptedException,IOException {

        homePage.TC4_1();
    }
    @Test(groups = {"Regression","Smoke"},enabled = false)
    public void TC_006_Expert_Blog() throws InterruptedException,IOException {

        homePage.TC5();
    }
    @Test(groups = {"Regression","Smoke"},enabled = false)
    public void TC_007_Expert_Popup_Submit_Blog_Clicked() throws InterruptedException,IOException {

        homePage.TC6();
    }
    @Test(groups = {"Regression","Smoke"},enabled=false)
    public void TC_008_Homepage_Navigate_from_Expert() throws InterruptedException,IOException {

        homePage.TC7();
    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_009_Card_Blog() throws
            InterruptedException,IOException {

        homePage.TC8();
    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_010_Homepage_Navigate_from_Card() throws InterruptedException,IOException {

        homePage.TC9();
    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_011_JoinNow_Button_Homapage() throws InterruptedException,IOException {

        homePage.TC10();
    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_012_ExploreNow_Button_Homepage() throws InterruptedException,IOException {

        homePage.TC11();
    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_013_AskNow_Button_Homepage() throws InterruptedException,IOException {

        homePage.TC12();
    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_014_ConnectNow_Button_Homepage() throws InterruptedException,IOException {

        homePage.TC13();
    }
    @Test(groups = {"Regression"},enabled = false)
    public void TC_015_SignupNow_Button_Homepage() throws InterruptedException,IOException {

        homePage.TC14();
    }
    @Test(groups = {"Regression"})
    public void TC_016_SeeMore_Button1_Answer_Section() throws InterruptedException,IOException {

        homePage.TC15();
    }
    @Test(groups = {"Regression"})
    public void TC_017_SeeMore_Button2_Answer_Section() throws InterruptedException,IOException {

        homePage.TC16();
    }
    @Test(groups = {"Regression"})
    public void TC_018_ClickToAnswer_Button_Answer_Section_Homepage() throws InterruptedException,IOException {

        homePage.TC17();
    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_019_Facebook_Footer_Link() throws InterruptedException,IOException {

        homePage.TC18();
    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_020_Instagram_Footer_Link() throws InterruptedException,IOException {

        homePage.TC19();
    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_021_Twitter_Footer_Link() throws InterruptedException,IOException {

        homePage.TC20();
    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_022_Youtube_Footer_Link() throws InterruptedException,IOException {

        homePage.TC21();
    }
    @Test(groups = {"Regression"})
    public void TC_023_BabyDestinationNews_Random_Link() throws InterruptedException,IOException {

        homePage.TC22();
    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_024_Search_English_Site() throws InterruptedException,IOException {

        homePage.TC23();
    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_025_VernacularDropdown_Hindi_Site() throws InterruptedException,IOException {

        homePage.TC24();
    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_026_VernacularDropdown_Tamil_Site() throws InterruptedException,IOException {

        homePage.TC25();

    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_027_VernacularDropdown_English_Site() throws InterruptedException,IOException {

        homePage.TC26();
    }


}
