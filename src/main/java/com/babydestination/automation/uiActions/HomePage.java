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
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[1]")
    WebElement topHeaderCatNames;

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
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div[1]/div[2]/div/div/div[2]/div[1]/p")
    WebElement catConversionPosts;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/p")
    WebElement catConversionComments;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div[1]/div[2]/div/div/div[2]/div[3]/p")
    WebElement catConversionCommentsPerPost;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div[2]/div[1]/div/div")
    WebElement conversionGraph1;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div[2]/div[2]/div/div")
    WebElement conversionGraph2;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[1]/ul/li[2]/a")
    WebElement categoryKeywordsTab;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div/div/div[1]/div/div")
    WebElement catkeywordGraph1;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div/div/div[2]/div/div")
    WebElement catkeywordGraph2;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[1]/ul/li[3]/a")
    WebElement categoryWordcloudTab;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div/div/div[1]/div/div[2]")
    WebElement catwordcloudGraph1;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div/div/div[2]/div/div[2]")
    WebElement catwordcloudGraph2;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div/div/div[3]/div/div[2]")
    WebElement catwordcloudGraph3;
    @FindBy(xpath = "//*[@id=\"side-menu-accordion\"]/li/ul/li[1]/a")
    WebElement categoryLink;
    @FindBy(xpath = "//*[@id=\"side-menu-accordion\"]/li/ul/li[2]/a")
    WebElement subCategoryLink;

    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div[1]/div[1]/div")
    WebElement subCatConversions;


    @FindBy(xpath = "//*[@id=\"side-menu-accordion\"]/li/ul/li[3]/a")
    WebElement brandLink;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[1]/ul/li[3]/a")
    WebElement subcategorySov;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div/div/div[1]/div/div")
    WebElement sovGraph1;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div/div/div[2]/div/div")
    WebElement sovGraph2;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div/div/div[3]/div/div")
    WebElement sovGraph3;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div/div/div[4]/div/div")
    WebElement sovGraph4;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div/div/div[5]/div/div")
    WebElement sovGraph5;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[1]/ul/li[3]/a")
    WebElement brandSentiment;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div/div/div[1]/div/div")
    WebElement sentimentGraph1;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div/div/div[2]/div/div[2]")
    WebElement sentimentGraph2;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[2]/div/div/div[2]/div/div[1]")
    WebElement sentimentReportAnalysisDivider;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[2]/div[1]/div[2]/h1/a")
    WebElement filterButton;
    @FindBy(xpath = "/html/body/app-root/app-dashboard/div/div/div[2]/main/div/app-insights-view/main/div[3]/div/div[1]/ul/li[4]/a")
    WebElement subCatWordCloud;
    @FindBy(xpath = "//*[@id=\"collapseFilters\"]/div[1]/div[1]")
    WebElement dateRange;





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
        Boolean isTopHeader=topHeaderCatNames.isDisplayed();
        softAssert.assertEquals(isTopHeader.booleanValue(),true);
        Boolean isConversationTab=categoryConversationsTab.isDisplayed();
        softAssert.assertEquals(isConversationTab.booleanValue(),true);
//
        Boolean isConversationName=conversationName.isDisplayed();
        softAssert.assertEquals(isConversationName.booleanValue(),true);
        Boolean isConversationData=conversationData.isDisplayed();
        softAssert.assertEquals(isConversationData.booleanValue(),true);

        Boolean isCatPost=catConversionPosts.isDisplayed();
        softAssert.assertEquals(isCatPost.booleanValue(),true);
        Boolean isCatComment=catConversionComments.isDisplayed();
        softAssert.assertEquals(isCatComment.booleanValue(),true);
        Boolean isCommentPost=catConversionCommentsPerPost.isDisplayed();
        softAssert.assertEquals(isCommentPost.booleanValue(),true);

        Boolean isGraph1=conversionGraph1.isDisplayed();
        softAssert.assertEquals(isGraph1.booleanValue(),true);
        Boolean isGraph2=conversionGraph2.isDisplayed();
        softAssert.assertEquals(isGraph2.booleanValue(),true);
        softAssert.assertAll();
        pause1();

    }
    public void categoryLink_keywordTab_test() throws InterruptedException, IOException {
        Boolean isKeywordTab=categoryKeywordsTab.isDisplayed();
        softAssert.assertEquals(isKeywordTab.booleanValue(),true);
        categoryKeywordsTab.click();
        pause3();
        Boolean isCatKeyGraph1=catkeywordGraph1.isDisplayed();
        softAssert.assertEquals(isCatKeyGraph1.booleanValue(),true);
        Boolean isCatKeyGraoh2=catkeywordGraph2.isDisplayed();
        softAssert.assertEquals(isCatKeyGraoh2.booleanValue(),true);
        softAssert.assertAll();
        pause1();

    }
    public void categoryLink_WordcloudTab_test() throws InterruptedException, IOException {
        Boolean isWordcloudTab=categoryWordcloudTab.isDisplayed();
        softAssert.assertEquals(isWordcloudTab.booleanValue(),true);
        categoryWordcloudTab.click();
        pause3();
        Boolean isCatWordGraph1=catwordcloudGraph1.isDisplayed();
        softAssert.assertEquals(isCatWordGraph1.booleanValue(),true);
        Boolean isCatWordGraph2=catwordcloudGraph2.isDisplayed();
        softAssert.assertEquals(isCatWordGraph2.booleanValue(),true);
        Boolean isCatWordGraph3=catwordcloudGraph3.isDisplayed();
        softAssert.assertEquals(isCatWordGraph3.booleanValue(),true);
        softAssert.assertAll();
        pause1();
    }
    public void subCategory_Linkclick_test() throws InterruptedException, IOException {
        waitForElement(driver,subCategoryLink,60);
        subCategoryLink.click();
        pause3();
        Boolean isTopHeader=topHeaderCatNames.isDisplayed();
        softAssert.assertEquals(isTopHeader.booleanValue(),true);
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

        Boolean isSubCatConv=subCatConversions.isDisplayed();
        softAssert.assertEquals(isSubCatConv.booleanValue(),true);
        Boolean isCatPost=catConversionPosts.isDisplayed();
        softAssert.assertEquals(isCatPost.booleanValue(),true);
        Boolean isCatComment=catConversionComments.isDisplayed();
        softAssert.assertEquals(isCatComment.booleanValue(),true);
        Boolean isCommentPost=catConversionCommentsPerPost.isDisplayed();
        softAssert.assertEquals(isCommentPost.booleanValue(),true);

        Boolean isGraph1=conversionGraph1.isDisplayed();
        softAssert.assertEquals(isGraph1.booleanValue(),true);
        Boolean isGraph2=conversionGraph2.isDisplayed();
        softAssert.assertEquals(isGraph2.booleanValue(),true);

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
        pause3();

        Boolean isCatKeyGraph1=catkeywordGraph1.isDisplayed();
        softAssert.assertEquals(isCatKeyGraph1.booleanValue(),true);
        Boolean isCatKeyGraoh2=catkeywordGraph2.isDisplayed();
        softAssert.assertEquals(isCatKeyGraoh2.booleanValue(),true);
        softAssert.assertAll();

        pause1();
    }
    public void subCategoryLink_SOVTab_test() throws InterruptedException, IOException {
        waitForElement(driver,subcategorySov,60);
        Boolean isSovTab=subcategorySov.isDisplayed();
        softAssert.assertEquals(isSovTab.booleanValue(),true);
        subcategorySov.click();
        pause3();

        Boolean isSovGraph1=sovGraph1.isDisplayed();
        softAssert.assertEquals(isSovGraph1.booleanValue(),true);
        Boolean isSovGraph2=sovGraph2.isDisplayed();
        softAssert.assertEquals(isSovGraph2.booleanValue(),true);
        Boolean isSovGraph3=sovGraph3.isDisplayed();
        softAssert.assertEquals(isSovGraph3.booleanValue(),true);
        Boolean isSovGraph4=sovGraph4.isDisplayed();
        softAssert.assertEquals(isSovGraph4.booleanValue(),true);
        Boolean isSovGraph5=sovGraph5.isDisplayed();
        softAssert.assertEquals(isSovGraph5.booleanValue(),true);

        softAssert.assertAll();
        pause1();
    }
    public void subCategoryLink_WordcloudTab_test() throws InterruptedException, IOException {
        Boolean isWordcloudTab=subCatWordCloud.isDisplayed();
        softAssert.assertEquals(isWordcloudTab.booleanValue(),true);
        subCatWordCloud.click();
        pause3();
        Boolean isCatWordGraph1=catwordcloudGraph1.isDisplayed();
        softAssert.assertEquals(isCatWordGraph1.booleanValue(),true);
        Boolean isCatWordGraph2=catwordcloudGraph2.isDisplayed();
        softAssert.assertEquals(isCatWordGraph2.booleanValue(),true);
        Boolean isCatWordGraph3=catwordcloudGraph3.isDisplayed();
        softAssert.assertEquals(isCatWordGraph3.booleanValue(),true);
        softAssert.assertAll();

        pause1();
    }
    public void brand_Linkclick_test() throws InterruptedException, IOException {
        waitForElement(driver,brandLink,60);
        brandLink.click();
        pause3();
        Boolean isTopHeader=topHeaderCatNames.isDisplayed();
        softAssert.assertEquals(isTopHeader.booleanValue(),true);
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

        Boolean isBrandConv=subCatConversions.isDisplayed();
        softAssert.assertEquals(isBrandConv.booleanValue(),true);
        Boolean isBrandPost=catConversionPosts.isDisplayed();
        softAssert.assertEquals(isBrandPost.booleanValue(),true);
        Boolean isBrandComment=catConversionComments.isDisplayed();
        softAssert.assertEquals(isBrandComment.booleanValue(),true);
        Boolean isBrandCommentPost=catConversionCommentsPerPost.isDisplayed();
        softAssert.assertEquals(isBrandCommentPost.booleanValue(),true);

        Boolean isGraph1=conversionGraph1.isDisplayed();
        softAssert.assertEquals(isGraph1.booleanValue(),true);
        Boolean isGraph2=conversionGraph2.isDisplayed();
        softAssert.assertEquals(isGraph2.booleanValue(),true);

        Boolean isConversationName=conversationName.isDisplayed();
        softAssert.assertEquals(isConversationName.booleanValue(),true);
        Boolean isConversationData=conversationData.isDisplayed();
        softAssert.assertEquals(isConversationData.booleanValue(),true);
        softAssert.assertAll();
        pause1();
    }
    public void brand_KeywordTab_test() throws InterruptedException, IOException {
        waitForElement(driver,categoryKeywordsTab,60);
        categoryKeywordsTab.click();
        pause3();

        Boolean isCatKeyGraph1=catkeywordGraph1.isDisplayed();
        softAssert.assertEquals(isCatKeyGraph1.booleanValue(),true);
        Boolean isCatKeyGraoh2=catkeywordGraph2.isDisplayed();
        softAssert.assertEquals(isCatKeyGraoh2.booleanValue(),true);
        softAssert.assertAll();

        pause1();
        softAssert.assertAll();
        pause1();
    }
    public void brand_SentimentTab_test() throws InterruptedException, IOException {
        waitForElement(driver,brandSentiment,60);
        brandSentiment.click();
        pause3();
        Boolean isSentimentGraph1=sentimentGraph1.isDisplayed();
        softAssert.assertEquals(isSentimentGraph1.booleanValue(),true);
        Boolean isSentimentGraph2=sentimentGraph2.isDisplayed();
        softAssert.assertEquals(isSentimentGraph2.booleanValue(),true);
        Boolean isSentimentDividerAnalysis=sentimentReportAnalysisDivider.isDisplayed();
        softAssert.assertEquals(isSentimentDividerAnalysis.booleanValue(),true);
        softAssert.assertAll();

        pause1();
    }
    public void brand_WordcloudTab_test() throws InterruptedException, IOException {
        Boolean isWordcloudTab=subCatWordCloud.isDisplayed();
        softAssert.assertEquals(isWordcloudTab.booleanValue(),true);
        subCatWordCloud.click();
        pause3();
        Boolean isCatWordGraph1=catwordcloudGraph1.isDisplayed();
        softAssert.assertEquals(isCatWordGraph1.booleanValue(),true);
        Boolean isCatWordGraph2=catwordcloudGraph2.isDisplayed();
        softAssert.assertEquals(isCatWordGraph2.booleanValue(),true);
        Boolean isCatWordGraph3=catwordcloudGraph3.isDisplayed();
        softAssert.assertEquals(isCatWordGraph3.booleanValue(),true);
        softAssert.assertAll();

        pause1();

    }
    public void filter_Button_Test() throws InterruptedException, IOException {
        Boolean isFilterButton=filterButton.isDisplayed();
        softAssert.assertEquals(isFilterButton.booleanValue(),true);
        filterButton.click();
        pause2();
        Boolean isDateRange=dateRange.isDisplayed();
        softAssert.assertEquals(isDateRange.booleanValue(),true);
        pause1();
    }
    public void logout_Button_Test() throws InterruptedException, IOException {
        Boolean isLogoutButton=logoutButton.isDisplayed();
        softAssert.assertEquals(isLogoutButton.booleanValue(),true);
        logoutButton.click();
        pause2();
        Boolean isEmailFiled=enterEmail.isDisplayed();
        softAssert.assertEquals(isEmailFiled.booleanValue(),true);
        pause1();
    }
   }
