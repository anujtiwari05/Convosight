package com.babydestination.automation.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.babydestination.automation.testBase.TestBase;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Parameters;

import java.util.Iterator;
import java.util.Set;

public class loginSignup extends TestBase {
    public static final Logger log = Logger.getLogger(loginSignup.class.getName());
    SoftAssert softAssert=new SoftAssert();

    @FindBy(xpath = "/html/body/app-root/app-group-admin-landing-page/div/div[1]/img")
    WebElement homePageBannerImg;
    @FindBy(xpath = "//*[@id=\"c1\"]/a/img")
    WebElement fbConnectTop;
    @FindBy(xpath = "/html/body/app-root/app-group-admin-landing-page/div/div[1]/h4[1]/a/img")
    WebElement fbConnectMiddle;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div[2]")
    WebElement continueButtonPopup;
    @FindBy(css = "div.modal-content:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button")
    WebElement continueFBButton;
    @FindBy(xpath = "//*[@id=\"u_0_12\"]/div[1]/div/div/div/div[1]/div[1]/div[2]/div[1]")
    WebElement profileAccessPopup;
    @FindBy(xpath = "//*[@id=\"u_0_0\"]")
    WebElement FbProfileAccessCancel;
    @FindBy(xpath = "//*[@id=\"u_0_10\"]/div[2]/div[1]/div[1]/button")
    WebElement continueAsUserButton;
    @FindBy(xpath = "//*[@id=\"u_0_z\"]/div/div/div/div/div[1]/div[1]/div[2]")
    WebElement groupAccessPopup;
    @FindBy(xpath = "//*[@id=\"platformDialogForm\"]/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td[2]/button[1]")
    WebElement groupAccessNotNow;
    @FindBy(xpath = "//*[@id=\"c1\"]/ul[2]/li/a")
    WebElement logOutButton;

    @FindBy(xpath = "//*[@id=\"platformDialogForm\"]/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td[2]/button[2]")
    WebElement groupAccessOK;
    @FindBy(xpath = "//*[@id=\"one\"]/div")
    WebElement myGroupsDashboard;
    @FindBy(xpath ="//*[@id=\"one\"]/table/tbody/tr[2]/td[2]")
    WebElement groupNameDashboardPage;

    @FindBy(xpath = "//*[@id=\"header_block\"]/span")
    WebElement loginFacebookPage;
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement FbEmail;
    @FindBy(xpath = "//*[@id=\"pass\"]")
    WebElement FbPass;
    @FindBy(xpath = "//*[@id=\"loginbutton\"]")
    WebElement FBloginButton;



    public loginSignup(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fbConnectPresent() throws InterruptedException {
        pause1();
        Boolean isFbConnect= fbConnectTop.isDisplayed();
        softAssert.assertEquals(isFbConnect.booleanValue(),true);
        Boolean isFbConnect2= fbConnectMiddle.isDisplayed();
        softAssert.assertEquals(isFbConnect2.booleanValue(),true);
        Boolean isBannerHomePage= homePageBannerImg.isDisplayed();
        softAssert.assertEquals(isBannerHomePage.booleanValue(),true);
        softAssert.assertAll();

    }
    public void fbConnectClick() throws InterruptedException {
        waitForElement(driver,fbConnectTop,60);
        pause1();fbConnectTop.click();
        Boolean isContinueFBButton= continueFBButton.isDisplayed();
        softAssert.assertEquals(isContinueFBButton.booleanValue(),true);
        softAssert.assertAll();

    }
    public void continueFBButtonClicked() throws InterruptedException {
        waitForElement(driver,continueFBButton,60);
        pause1();
        continueFBButton.click();
        pause1();
        softAssert.assertAll();

    }

    public void afterContinueClick() throws InterruptedException {

        if(loginFacebookPage.isDisplayed()){
            pause1();
            FbEmail.sendKeys("testbd123@gmail.com");
            FbPass.sendKeys("test@password");
            pause1();
            FBloginButton.click();
            pause();
            pause2();
            if(myGroupsDashboard.isDisplayed()){

                Boolean isMyGroupDashboard = myGroupsDashboard.isDisplayed();
                softAssert.assertEquals(isMyGroupDashboard.booleanValue(), true);
                softAssert.assertAll();
                pause1();
            }else
            {

                Boolean isGroupAccessPopup= groupAccessPopup.isDisplayed();
                softAssert.assertEquals(isGroupAccessPopup.booleanValue(),true);
                softAssert.assertAll();
                pause1();

            }

        }else {
            pause1();
            Boolean isProfileAccessPopup= profileAccessPopup.isDisplayed();
            softAssert.assertEquals(isProfileAccessPopup.booleanValue(),true);
            softAssert.assertAll();
        }

    }
    public void profileAccessDeny() throws InterruptedException {
        pause1();
        if(groupAccessPopup.isDisplayed()){
            pause1();
            waitForElement(driver,FbProfileAccessCancel,60);
            pause1();
            FbProfileAccessCancel.click();
            Boolean isContinueFBPopup= continueFBButton.isDisplayed();
            softAssert.assertEquals(isContinueFBPopup.booleanValue(),true);
            softAssert.assertAll();
            continueFBButton.click();
            pause1();
        }else {
            System.out.println("User is on GroupAccessPopup");
        }

    }
    public void profileAccessAllow() throws InterruptedException {
        waitForElement(driver,continueAsUserButton,60);
        pause1();
        continueAsUserButton.click();
        pause2();
        waitForElement(driver,groupAccessPopup,60);
        Boolean isGroupAccessPopup= groupAccessPopup.isDisplayed();
        softAssert.assertEquals(isGroupAccessPopup.booleanValue(),true);
        softAssert.assertAll();
        pause1();

    }
    public void groupAccessPopupAllow() throws InterruptedException {
        waitForElement(driver, groupAccessOK, 60);
        groupAccessOK.click();
        pause3();
        Boolean isGroupName = groupNameDashboardPage.isDisplayed();
        Boolean isMyGroupDashboard = myGroupsDashboard.isDisplayed();
        softAssert.assertEquals(isGroupName.booleanValue(), true);
        softAssert.assertEquals(isMyGroupDashboard.booleanValue(), true);
        softAssert.assertAll();
        pause1();

    }
    public void logOutTest() throws InterruptedException {
        pause1();
        waitForElement(driver, logOutButton, 60);
        pause1();
        logOutButton.click();
        pause2();
        Boolean isBannerHome= homePageBannerImg.isDisplayed();
        softAssert.assertEquals(isBannerHome.booleanValue(),true);
        softAssert.assertAll();
        pause();

    }
}