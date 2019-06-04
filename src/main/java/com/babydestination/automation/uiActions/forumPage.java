package com.babydestination.automation.uiActions;


import org.apache.log4j.Logger;
import org.apache.xpath.operations.Bool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.babydestination.automation.testBase.TestBase;
import org.testng.Assert;

import java.util.ArrayList;

public class forumPage extends TestBase {
    public static final Logger log = Logger.getLogger(forumPage.class.getName());
    loginSignup loginsignup;

//    @FindBy(xpath = "/html/body/app-root/app-header/div/nav/div[1]/div[2]/a[1]/span")
    @FindBy(xpath = "/html/body/app-root/app-header/div/div/nav/div[1]/div[2]/a[1]/span")
    WebElement askMomHeader;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-forum/div[1]/div/div[1]/div[1]/div[2]")
    WebElement askButton;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-forum-ask-question/div/div/div/form/div[1]/textarea")
    WebElement quesArea;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-forum-ask-question/div/div/div/form/div[2]/div[2]/select/option[8]")
    WebElement selectCat;
    @FindBy(className = "btn-cancel")
    WebElement cancelButton;
    //    /html/body/app-root/div[1]/app-forum-ask-question/div/div/div/form/div[3]/button[2]              //for prod
   @FindBy(xpath = " /html/body/app-root/div[1]/app-forum-ask-question/div/div/div/form/div[3]/button[2]")
   WebElement postQues;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-forum-ask-question/div/div/div/form/div[2]/button[2]")
    WebElement postAns;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-forum/div[1]/div/div[1]/div[2]/div[2]/app-forum-question-card/div/div/div[2]/div/div/button")
    WebElement ansButton;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-forum-ask-question/div/div/div/form/div[1]/textarea")
    WebElement ansArea;
    //    @FindBy(css = "html body app-root div.language-en-Us app-forum-ask-question div.container-fluid.post-ques-wrapper div.row div.col-12 form.ask-ques-form.ng-untouched.ng-pristine.ng-valid div.button-wrapper button.btn-cancel")
    @FindBy(className = "btn-cancel")
    WebElement btnCancel;
    @FindBy(id = "mat-input-6")
    WebElement ansName;
    @FindBy(xpath = "/html/body/app-root/div[3]/app-ask-name/div/div/div/div[2]/app-personal-info/div/div[2]/form/div[2]/button/span")
    WebElement ansNameSubmitButton;
//    @FindBy(xpath = "/html/body/app-root/div[1]/app-forum/div[1]/div/div[1]/div[2]/div[2]/app-forum-question-card/div")
    @FindBy(xpath = "/html/body/app-root/div[1]/app-forum/div[1]/div/div[1]/div[2]/div[1]")
    WebElement viewQues;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-forum/div[2]/app-select-topic/div/div/div/div[1]/a[5]")
    WebElement parentingQues;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-forum/div[2]/app-select-topic/div/div/div/button")
    WebElement submitCatPopup;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-forum/div[1]/div/div[1]/div[2]/div[1]/app-forum-question-card/div")
    WebElement forumFirstQues;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-forum-view-question/div/div/div/div[1]/div[4]")
    WebElement yellowQuestionButtonOnViewQuestionPage;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-forum-view-question/div/div/div/div[1]/button")
    WebElement redAnsButtonOnViewQuestionPage;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-forum-view-question/div/div/div/div[1]/div[2]/p")
    WebElement viewQuesText;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-forum-view-question/div/div/div/div[2]/app-trending-questions/div")
    WebElement similarQuestions;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-forum/div[1]/div/div[1]/div[2]/div[1]/app-forum-question-card/div/div/div[1]/a")
    WebElement yellowLSTag;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-category2/div/div/div/div[1]/div/h1")
    WebElement redirectAfterLSTag;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-forum/div[1]/div/div[2]/div/div/div[1]")
    WebElement WAWidgetText;


    public forumPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void forumsHomepage() throws InterruptedException
    {
        askMomHeader.click();
        pause();

//        scroll("scroll(0,1200)");
//        pause();
//        scroll("scroll(1200,2500)");
//        pause();
//        scroll("scroll(2500,3500)");

    }

    public void cancelButtonTest() throws InterruptedException
    {
        waitForElement(driver,askButton,60);
        askButton.click();
        pause1();
        cancelButton.click();
        pause3();

    }

    public void postQuestion() throws InterruptedException
    {
        waitForElement(driver,askButton,60);
        pause1();
        askButton.click();
        quesArea.clear();
        pause1();
        quesArea.sendKeys("testing question on forum for auto");
        pause1();
//        selectCat.click();
//        pause2();
        postQues.click();
        pause2();
        loginsignup = new loginSignup(driver);
        if(!(loginsignup.loginSignupButton.getText()=="LOGIN / SIGN-UP")) {
            loginsignup.login();
            pause();
            parentingQues.click();
            submitCatPopup.click();
            pause2();
            driver.navigate().refresh();
            pause3();
            forumFirstQues.getText().contains("testing question on forum for auto");
            pause1();
            loginsignup.logOut();
            pause();
        }
        else {
            pause();
            parentingQues.click();
            submitCatPopup.click();
            pause2();
            driver.navigate().refresh();
            pause3();
            forumFirstQues.getText().contains("testing question on forum for auto");
            pause1();
            loginsignup.logOut();
            pause();
        }
    }

    public void postAnswer() throws InterruptedException {

        askMomHeader.click();
        waitForElement(driver,ansButton,120);
        ansButton.click();
        pause1();
        cancelButton.click();
        pause1();
        ansButton.click();
        pause1();
        ansArea.clear();
        ansArea.sendKeys("Ohhhhh!!!! Really thats great...cool ever!!");
        postAns.click();
        pause2();
        loginsignup = new loginSignup(driver);
//        loginsignup.loginSignupLink();
        if(!(loginsignup.loginSignupButton.getText()=="LOGIN / SIGN-UP")) {
            loginsignup.login();
            pause();
            driver.navigate().refresh();
            pause2();

        }
        else {

            pause();
//        waitForElement(driver,ansName,120);
//        ansName.clear();
//        pause1();
//        ansName.sendKeys("Automation Testing");
//        pause1();
//        ansNameSubmitButton.click();
//        pause2();

            driver.navigate().refresh();
            pause2();
                    }
    }
    public void viewQuestion() throws  InterruptedException
    {
        waitForElement(driver,viewQues,120);
        viewQues.click();
        pause();
        pause3();
        Assert.assertEquals(viewQuesText.getText(),driver.getTitle());
//        Assert.assertEquals(viewQues.getText(),driver.getTitle());
        Boolean isPresentyellowQues = yellowQuestionButtonOnViewQuestionPage.isDisplayed();
        Assert.assertEquals(isPresentyellowQues.toString(),"true");

        Boolean isPresentAns = redAnsButtonOnViewQuestionPage.isDisplayed();
        Assert.assertEquals(isPresentAns.toString(),"true");
        Boolean relatedQues = similarQuestions.isDisplayed();
        Assert.assertEquals(relatedQues.toString(),"true");
        driver.navigate().back();
        pause2();
    }
    public void redAnsButton() throws InterruptedException
    {
        waitForElement(driver,redAnsButtonOnViewQuestionPage,120);
        pause2();
        redAnsButtonOnViewQuestionPage.click();
        pause1();
        Boolean isAnsAreaPresent = ansArea.isDisplayed();
        Assert.assertEquals(isAnsAreaPresent.toString(),"true");
        pause1();
        cancelButton.click();
        pause();
        Assert.assertEquals(driver.getTitle(),"Forum");
        pause1();
    }
    public void yellowLSTagClick() throws InterruptedException
    {
        waitForElement(driver,yellowLSTag,120);
        pause2();
        yellowLSTag.click();
        pause3();
        Assert.assertEquals(redirectAfterLSTag.getText(),yellowLSTag.getText());
        pause1();
        driver.navigate().back();
        pause2();
        Assert.assertEquals(driver.getTitle(),"Forum");

    }
    public void infiniteScroll() throws InterruptedException
    {
        pause2();
        scroll("scroll(0,1500)");
        pause2();
        scroll("scroll(1500,2000)");
        pause2();
        scroll("scroll(2000,2800)");
        pause2();
        scroll("scroll(2800,3800)");
        pause2();
        scroll("scroll(3800,4800)");
        pause2();
        System.out.println("Infinite scroll working");

    }



}
