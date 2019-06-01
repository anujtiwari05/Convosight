package com.babydestination.automation.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.babydestination.automation.testBase.TestBase;
import org.testng.Assert;

public class blogDetailPage extends TestBase {
    public static final Logger log = Logger.getLogger(blogDetailPage.class.getName());

    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[3]/div/div[1]/div/div[1]/div/div/swiper/div/div[1]/div[1]")
    WebElement blog1;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-content/div/div[3]/div[1]/div/div[2]/button")
    WebElement continueReading;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-content/div/div[3]/div[1]/div[2]/ul[2]/li")
    WebElement related1;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-content/div/div[3]/div[1]/div[2]/ul[4]/li")
    WebElement related2;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-content/div/div[1]/app-breadcrumb/ul/li[3]/a/span/app-category-list/span")
    WebElement subCatBreadcrumb;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-content/div/div[1]/app-breadcrumb/ul/li[2]/a/span/app-category-list/span")
    WebElement categoryBread;
    @FindBy(partialLinkText = "10 Food Recipes for 1 to 2 years old kids")
    WebElement exitLink;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-content/div/div[1]/app-breadcrumb/ul/li[1]")
    WebElement homeBredcrumb;
    @FindBy(xpath = "//*[@id=\"desktop-widget\"]/div/div[2]/button")
    WebElement askMomWidget;
    @FindBy(xpath = "//*[@id=\"desktop-widget\"]/div/div[1]/button")
    WebElement whatsappWidget;
    @FindBy(xpath = "//*[@id=\"desktop-widget\"]/div/div[1]/p")
    WebElement whatsappWidgetText;
    @FindBy(xpath = "//*[@id=\"desktop-widget\"]/div/div[2]/h2")
    WebElement askMomWidgetText;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-content/div/div[1]/app-breadcrumb/ul")
    WebElement isBreadcrumbPresent;
    @FindBy(xpath = "/html/body/app-root/app-header/div/div/div[1]/ul")
    WebElement isMenuHeaderPresent;
    @FindBy(xpath = "/html/body/app-root/app-footer/footer/div")
    WebElement isFooterPresent;
    @FindBy(xpath = "/html/body/app-root/app-header/div/div/nav")
    WebElement isTopHeaderPresent;

//    @FindBy(id = "mat-radio-3")
//    WebElement expectingLifestage;
//    @FindBy(id = "mat-radio-2")
//    WebElement kidLifestage;
    @FindBy(xpath = "/html/body/app-root/app-header/div/div/nav/div[1]/a")
    WebElement BDLogo;
//    @FindBy(xpath = "/html/body/app-root/div[1]/app-content/div/app-capture-dob/div/app-personal-info/div/div[2]/form/div[2]/mat-form-field[1]/div/div[1]/div/mat-select/div/div[1]")
//    WebElement dobDay;
//    @FindBy(xpath = "/html/body/app-root/div[1]/app-content/div/app-capture-dob/div/app-personal-info/div/div[2]/form/div[2]/mat-form-field[2]/div/div[1]/div/mat-select/div/div[1]")
//    WebElement dobmonth;
//    @FindBy(xpath = "/html/body/app-root/div[1]/app-content/div/app-capture-dob/div/app-personal-info/div/div[2]/form/div[2]/mat-form-field[3]/div/div[1]/div/mat-select/div/div[1]")
//    WebElement dobYear;
//    @FindBy(xpath = "/html/body/app-root/div[1]/app-content/div/app-capture-dob/div/app-personal-info/div/div[2]/form/div[4]/button")
//    WebElement dobSubmit;
    @FindBy(partialLinkText = "Click here and we will get in touch with you")
    WebElement googleForm;
    @FindBy(partialLinkText = "5 Questions About Your Vagina You Were Too Embarrassed To Ask")
    WebElement randomExitLink;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home/div/div[6]/div/div/swiper/div/div[1]/div[3]")
    WebElement video1;
    @FindBy(xpath = "//*[@id=\"player_uid_613575749_1\"]/div[4]/button")
    WebElement videoYoutubeIcon;
//    @FindBy(xpath = "//*[@id=\"player_uid_808671330_1\"]/div[21]/div[2]/div[1]/button")
    @FindBy(xpath = "//*[@id=\"player_uid_382439362_1\"]/div[21]/div[2]/div[1]/button/svg/use")
    WebElement playPauseButton;
    @FindBy(xpath = "//*[@id=\"player_uid_808671330_1\"]/div[21]/div[2]/div[2]/button[6]")
    WebElement fullScreen;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-content/div/div[3]/div[2]/div/div[2]/ul[2]/li")
    WebElement relatedVideo;



    public blogDetailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


//
        public void TC27() throws InterruptedException
        {
            scroll("scroll(0,400)");
            waitForElement(driver,blog1,60);
            blog1.click();
            pause();
        }

        public void TC28() throws InterruptedException
        {
            waitForElement(driver,continueReading,60);
            continueReading.click();
            pause1();
            scroll("scroll(800,2800)");
            pause2();
        }
    public void TC29() throws InterruptedException
    {
        waitForElement(driver,related1,60);
        related1.click();
        pause2();
        scroll("scroll(800,2800)");
        waitForElement(driver,related2,60);
        related2.click();
        pause2();
    }
        public void TC30() throws InterruptedException
        {
            driver.navigate().refresh();
            pause1();
            Assert.assertEquals(continueReading.isDisplayed(),true);
            pause1();

        }

        public void TC31() throws InterruptedException
        {
            waitForElement(driver,subCatBreadcrumb,60);
            subCatBreadcrumb.click();
            pause3();
            driver.navigate().back();
        }
        public void TC32() throws InterruptedException
        {
            waitForElement(driver,categoryBread,60);
            categoryBread.click();
            pause3();
            driver.navigate().back();
        }
    public void TC33() throws InterruptedException
    {
        waitForElement(driver,homeBredcrumb,60);
        homeBredcrumb.click();
        pause3();
        driver.navigate().back();
    }
    public void TC34() throws InterruptedException
    {
        waitForElement(driver,askMomWidget,60);
        askMomWidget.click();
        pause3();
        driver.navigate().back();
        pause3();
    }
    public void TC35() throws InterruptedException
    {
        waitForElement(driver,whatsappWidget,60);
        whatsappWidget.click();
        pause3();
        driver.navigate().back();
        pause3();
    }
    public void TC36() throws InterruptedException
    {
        waitForElement(driver,whatsappWidgetText,60);
        String waText=whatsappWidgetText.getText();
        Assert.assertEquals(waText,"Get your questions answered by our 45,000+ trusted moms community");

    }
    public void TC37() throws InterruptedException
    {
        waitForElement(driver,askMomWidgetText,60);
        String askText=askMomWidgetText.getText();
        Assert.assertEquals(askText,"More than 50,000+ Questions Answered!");

    }
    public void TC38() throws InterruptedException
    {
        waitForElement(driver,isBreadcrumbPresent,60);
        Boolean isPresent =isBreadcrumbPresent.isDisplayed();
        Assert.assertEquals(isPresent.toString(),"true");

    }
    public void TC39() throws InterruptedException
    {
        waitForElement(driver,isMenuHeaderPresent,60);
        Boolean isPresent =isMenuHeaderPresent.isDisplayed();
        Assert.assertEquals(isPresent.toString(),"true");

    }
    public void TC40() throws InterruptedException
    {
        waitForElement(driver,isFooterPresent,60);
        Boolean isPresent =isFooterPresent.isDisplayed();
        Assert.assertEquals(isPresent.toString(),"true");

    }
    public void TC41() throws InterruptedException
    {
        waitForElement(driver,continueReading,60);
        continueReading.click();
        pause1();
        scroll("scroll(800,2800)");
        pause2();
        waitForElement(driver,googleForm,60);
        Boolean isPresent =googleForm.isDisplayed();
        Assert.assertEquals(isPresent.toString(),"true");

    }
    public void TC42() throws InterruptedException
    {
        waitForElement(driver,isTopHeaderPresent,60);
        Boolean isPresent =isTopHeaderPresent.isDisplayed();
        Assert.assertEquals(isPresent.toString(),"true");
        pause1();

    }
    public void TC43() throws InterruptedException
    {

        waitForElement(driver,randomExitLink,60);
        randomExitLink.click();
        pause3();
        driver.navigate().back();
        pause1();
//        Quit();

    }
//


    }
