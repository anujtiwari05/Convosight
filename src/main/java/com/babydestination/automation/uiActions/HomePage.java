package com.babydestination.automation.uiActions;
import org.apache.commons.mail.EmailException;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.babydestination.automation.testBase.TestBase;
import org.testng.asserts.SoftAssert;
import com.babydestination.automation.notificationHelper.*;

import javax.mail.MessagingException;
import java.io.IOException;

public class HomePage extends TestBase {
    SoftAssert softAssert=new SoftAssert();

    public static final Logger log = Logger.getLogger(HomePage.class.getName());
    @FindBy(xpath = "/html/body/app-root/app-brand-landing-page/div/div[2]/img")
    WebElement homepageBanner;
    @FindBy(xpath = "/html/body/app-root/app-brand-landing-page/div/div[5]/div[1]/div[1]/img")
    WebElement homepageCampaignImg;
    @FindBy(xpath = "/html/body/app-root/app-brand-landing-page/div/div[1]")
    WebElement homepageHeader;

    @FindBy(xpath = "/html/body/app-root/app-brand-landing-page/div/div[1]/div[3]/a[2]/button")
    WebElement loginButtonHome;
    @FindBy(xpath = "//*[@id=\"InputEmail1\"]")
    WebElement enterEmail;
    @FindBy(xpath = "//*[@id=\"InputPassword\"]")
    WebElement enterPass;
    @FindBy(xpath = "/html/body/app-root/app-login/div/div/div/div/form/button")
    WebElement submitCredential;
    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul[2]/li/a")
    WebElement logoutButton;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[1]/ul/li[1]/a")
    WebElement categoryConversationsTab;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div[1]/div[1]/div/div")
    WebElement conversationName;  //this may change
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div[1]/div[2]/div/div/div[2]")
    WebElement conversationData;
    @FindBy(xpath = "//*[@id=\"chartdiv\"]/div/div[1]/div/svg/g[2]/rect")
    WebElement conversionGraph1;
    @FindBy(xpath = "//*[@id=\"chartdiv\"]/div/div[1]/div/svg/g[2]/rect")
    WebElement conversionGraph2;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[1]/ul/li[2]/a")
    WebElement categoryKeywordsTab;
    @FindBy(xpath = "")
    WebElement keywordGraph1;   //this may change
    @FindBy(xpath = "")
    WebElement keywordGraph2;   //this may change
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[1]/ul/li[3]/a")
    WebElement categoryWordcloudTab;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div/div/div[1]/div/div[2]")
    WebElement wordcloudGraph1;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div/div/div[2]/div/div[2]")
    WebElement wordcloudGraph2;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div/div/div[3]/div/div[2]")
    WebElement wordcloudGraph3;
    @FindBy(xpath = "//*[@id=\"side-menu-accordion\"]/li/ul/li[1]/a")
    WebElement categoryLink;
    @FindBy(xpath = "//*[@id=\"side-menu-accordion\"]/li/ul/li[2]/a")
    WebElement subCategoryLink;
    @FindBy(xpath = "//*[@id=\"side-menu-accordion\"]/li/ul/li[3]/a")
    WebElement brandLink;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[1]/ul/li[3]/a")
    WebElement subcategorySov;
    @FindBy(xpath = "")
    WebElement sovGraph1;
    @FindBy(xpath = "")
    WebElement sovGraph2;
    @FindBy(xpath = "")
    WebElement sovGraph3;
    @FindBy(xpath = "")
    WebElement sovGraph4;
    @FindBy(xpath = "")
    WebElement sovGraph5;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[1]/ul/li[3]/a")
    WebElement brandSentiment;
    WebElement sentimentGraph1;
    @FindBy(xpath = "")
    WebElement sentimentGraph2;
    @FindBy(xpath = "")
    WebElement sentimentGraph3;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[2]/div[1]/div[2]/h1/a")
    WebElement filterButton;





    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


//	public void homePageBlog() throws InterruptedException,IOException {

    public void homepage_element_test() throws InterruptedException, IOException {
       waitForElement(driver,homepageHeader,60);
       Boolean isHeader=homepageHeader.isDisplayed();
       softAssert.assertEquals(isHeader.booleanValue(),true);
       softAssert.assertAll();

    }
    public void login_buttonclick_test() throws InterruptedException, IOException, EmailException, MessagingException {
        waitForElement(driver,loginButtonHome,60);
        pause1();
        loginButtonHome.click();
        Boolean isEmail=enterEmail.isDisplayed();
        softAssert.assertEquals(isEmail.booleanValue(),true);
        softAssert.assertAll();


    }
    public void login_test() throws InterruptedException, IOException , EmailException {
        waitForElement(driver,submitCredential,60);
        pause1();
        enterEmail.sendKeys("babydove@babydestination.com");
        enterPass.sendKeys("12345");
        submitCredential.click();
        pause3();
        Boolean isLogout=logoutButton.isDisplayed();
        softAssert.assertEquals(isLogout.booleanValue(),true);
        softAssert.assertAll();


    }
    public void categoryLink_conversationTab_test() throws InterruptedException, IOException {
        Boolean isConversationTab=categoryConversationsTab.isDisplayed();
        softAssert.assertEquals(isConversationTab.booleanValue(),true);
//        Boolean isConversationGraph1=conversionGraph1.isDisplayed();
//        softAssert.assertEquals(isConversationGraph1.booleanValue(),true);
//        Boolean isConversationGraph2=conversionGraph2.isDisplayed();
//        softAssert.assertEquals(isConversationGraph2.booleanValue(),true);
        Boolean isConversationName=conversationName.isDisplayed();
        softAssert.assertEquals(isConversationName.booleanValue(),true);
        Boolean isConversationData=conversationData.isDisplayed();
        softAssert.assertEquals(isConversationData.booleanValue(),true);
        softAssert.assertAll();
        pause1();

    }
    public void categoryLink_keywordTab_test() throws InterruptedException, IOException {
        Boolean isKeywordTab=categoryKeywordsTab.isDisplayed();
        softAssert.assertEquals(isKeywordTab.booleanValue(),true);
        categoryKeywordsTab.click();
        pause1();
//        Boolean isConversationGraph1=conversionGraph1.isDisplayed();           these comments xpath not correct will update soon
//        softAssert.assertEquals(isConversationGraph1.booleanValue(),true);
//        Boolean isConversationGraph2=conversionGraph2.isDisplayed();
//        softAssert.assertEquals(isConversationGraph2.booleanValue(),true);
        softAssert.assertAll();

        pause1();

    }
    public void categoryLink_WordcloudTab_test() throws InterruptedException, IOException {
        Boolean isWordcloudTab=categoryWordcloudTab.isDisplayed();
        softAssert.assertEquals(isWordcloudTab.booleanValue(),true);
        categoryWordcloudTab.click();
        pause1();
//        Boolean isConversationGraph1=conversionGraph1.isDisplayed();           these comments xpath not correct will update soon
//        softAssert.assertEquals(isConversationGraph1.booleanValue(),true);
//        Boolean isConversationGraph2=conversionGraph2.isDisplayed();
//        softAssert.assertEquals(isConversationGraph2.booleanValue(),true);
        softAssert.assertAll();

        pause1();
    }
    public void subCategory_Linkclick_test() throws InterruptedException, IOException {
        waitForElement(driver,subCategoryLink,60);
        subCategoryLink.click();
        pause1();
        Boolean isConversation=categoryConversationsTab.isDisplayed();
        softAssert.assertEquals(isConversation.booleanValue(),true);
        Boolean isKeyword=categoryKeywordsTab.isDisplayed();
        softAssert.assertEquals(isKeyword.booleanValue(),true);
        Boolean isSov=subcategorySov.isDisplayed();
        softAssert.assertEquals(isSov.booleanValue(),true);
        Boolean isWordcloud=categoryWordcloudTab.isDisplayed();
        softAssert.assertEquals(isWordcloud.booleanValue(),true);
        softAssert.assertAll();
        pause1();
    }
    public void subCategoryLink_conversationTab_test() throws InterruptedException, IOException {

//        Boolean isConversationGraph1=conversionGraph1.isDisplayed();           these comments xpath not correct will update soon
//        softAssert.assertEquals(isConversationGraph1.booleanValue(),true);
//        Boolean isConversationGraph2=conversionGraph2.isDisplayed();
//        softAssert.assertEquals(isConversationGraph2.booleanValue(),true);
        Boolean isConversationName=conversationName.isDisplayed();
        softAssert.assertEquals(isConversationName.booleanValue(),true);
        Boolean isConversationData=conversationData.isDisplayed();
        softAssert.assertEquals(isConversationData.booleanValue(),true);
        softAssert.assertAll();
        pause1();
    }
    public void subCategoryLink_KeywordTab_test() throws InterruptedException, IOException {
        waitForElement(driver,categoryKeywordsTab,60);
        categoryKeywordsTab.click();
        pause1();

//        Boolean isConversationGraph1=conversionGraph1.isDisplayed();           these comments xpath not correct will update soon
//        softAssert.assertEquals(isConversationGraph1.booleanValue(),true);
//        Boolean isConversationGraph2=conversionGraph2.isDisplayed();
//        softAssert.assertEquals(isConversationGraph2.booleanValue(),true);
        softAssert.assertAll();

        pause1();
    }
    public void subCategoryLink_SOVTab_test() throws InterruptedException, IOException {
        waitForElement(driver,subcategorySov,60);
        subcategorySov.click();
        pause1();

//        Boolean isConversationGraph1=conversionGraph1.isDisplayed();           these comments xpath not correct will update soon
//        softAssert.assertEquals(isConversationGraph1.booleanValue(),true);
//        Boolean isConversationGraph2=conversionGraph2.isDisplayed();
//        softAssert.assertEquals(isConversationGraph2.booleanValue(),true);
//        Boolean isConversationName=conversationName.isDisplayed();                  this section is not here, but keeping to implement exception handling feature
//        softAssert.assertEquals(isConversationName.booleanValue(),true);
//        Boolean isConversationData=conversationData.isDisplayed();
//        softAssert.assertEquals(isConversationData.booleanValue(),true);

        softAssert.assertAll();
        pause1();
    }
    public void subCategoryLink_WordcloudTab_test() throws InterruptedException, IOException {
        waitForElement(driver,categoryWordcloudTab,60);
        categoryWordcloudTab.click();
        pause1();

//        Boolean isConversationGraph1=conversionGraph1.isDisplayed();           these comments xpath not correct will update soon
//        softAssert.assertEquals(isConversationGraph1.booleanValue(),true);
//        Boolean isConversationGraph2=conversionGraph2.isDisplayed();
//        softAssert.assertEquals(isConversationGraph2.booleanValue(),true);
        softAssert.assertAll();

        pause1();
    }
    public void brand_Linkclick_test() throws InterruptedException, IOException {
        waitForElement(driver,brandLink,60);
        brandLink.click();
        pause2();
        Boolean isConversation=categoryConversationsTab.isDisplayed();
        softAssert.assertEquals(isConversation.booleanValue(),true);
        Boolean isKeyword=categoryKeywordsTab.isDisplayed();
        softAssert.assertEquals(isKeyword.booleanValue(),true);
        Boolean isSentiment=brandSentiment.isDisplayed();
        softAssert.assertEquals(isSentiment.booleanValue(),true);
        Boolean isWordcloud=categoryWordcloudTab.isDisplayed();
        softAssert.assertEquals(isWordcloud.booleanValue(),true);
        softAssert.assertAll();
        pause1();
    }
    public void brand_conversationTab_test() throws InterruptedException, IOException {

//        Boolean isConversationGraph1=conversionGraph1.isDisplayed();           these comments xpath not correct will update soon
//        softAssert.assertEquals(isConversationGraph1.booleanValue(),true);
//        Boolean isConversationGraph2=conversionGraph2.isDisplayed();
//        softAssert.assertEquals(isConversationGraph2.booleanValue(),true);
        Boolean isConversationName=conversationName.isDisplayed();
        softAssert.assertEquals(isConversationName.booleanValue(),true);
        Boolean isConversationData=conversationData.isDisplayed();
        softAssert.assertEquals(isConversationData.booleanValue(),true);
        softAssert.assertAll();
        pause1();
    }
    public void brand_KaeywordTab_test() throws InterruptedException, IOException {
        waitForElement(driver,categoryKeywordsTab,60);
        categoryKeywordsTab.click();
        pause1();
//        Boolean isConversationGraph1=conversionGraph1.isDisplayed();           these comments xpath not correct will update soon
//        softAssert.assertEquals(isConversationGraph1.booleanValue(),true);
//        Boolean isConversationGraph2=conversionGraph2.isDisplayed();
//        softAssert.assertEquals(isConversationGraph2.booleanValue(),true);
        softAssert.assertAll();
        pause1();
    }
    public void brand_SentimentTab_test() throws InterruptedException, IOException {
        waitForElement(driver,brandSentiment,60);
        brandSentiment.click();
        pause1();
//        Boolean isConversationGraph1=conversionGraph1.isDisplayed();           these comments xpath not correct will update soon
//        softAssert.assertEquals(isConversationGraph1.booleanValue(),true);
//        Boolean isConversationGraph2=conversionGraph2.isDisplayed();
//        softAssert.assertEquals(isConversationGraph2.booleanValue(),true);
        softAssert.assertAll();

        pause1();
    }
    public void brand_WordcloudTab_test() throws InterruptedException, IOException {
        waitForElement(driver,categoryWordcloudTab,60);
        categoryWordcloudTab.click();
        pause1();
//        Boolean isConversationGraph1=conversionGraph1.isDisplayed();           these comments xpath not correct will update soon
//        softAssert.assertEquals(isConversationGraph1.booleanValue(),true);
//        Boolean isConversationGraph2=conversionGraph2.isDisplayed();
//        softAssert.assertEquals(isConversationGraph2.booleanValue(),true);
        softAssert.assertAll();

        pause1();

    }
   }
