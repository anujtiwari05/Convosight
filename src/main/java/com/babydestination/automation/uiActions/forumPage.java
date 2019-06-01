package com.babydestination.automation.uiActions;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.babydestination.automation.testBase.TestBase;

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

    public void postQuestion() throws InterruptedException
    {
        waitForElement(driver,askButton,60);
        askButton.click();
        pause1();
        cancelButton.click();
        pause1();
        askButton.click();
        quesArea.clear();
        pause2();
        quesArea.sendKeys("testing question on forum for auto");
        pause2();
//        selectCat.click();
//        pause2();
        postQues.click();
        loginsignup = new loginSignup(driver);
        loginsignup.login();
        pause();
        driver.navigate().refresh();
        loginsignup.logOut();
        pause();


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
        pause1();
        loginsignup = new loginSignup(driver);
//        loginsignup.loginSignupLink();
        loginsignup.login();
        pause();
//        waitForElement(driver,ansName,120);
//        ansName.clear();
//        pause1();
//        ansName.sendKeys("Automation Testing");
//        pause1();
//        ansNameSubmitButton.click();
//        pause2();
        driver.navigate().refresh();
       pause();
    }
    public void viewQuestion() throws  InterruptedException
    {
        waitForElement(driver,viewQues,120);
        viewQues.click();
        pause();
        driver.navigate().back();
        pause2();
    }

}
