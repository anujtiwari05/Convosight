package com.babydestination.automation.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.babydestination.automation.testBase.TestBase;

public class blogDetailPage extends TestBase {
    public static final Logger log = Logger.getLogger(blogDetailPage.class.getName());

    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[3]/div/div[1]/div/div[1]/div/div/swiper/div/div[1]/div[1]")
    WebElement blog1;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-content/div/div[3]/div[1]/div[1]/button")
    WebElement continueReading;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-content/div/div[3]/div[1]/div[2]/ul[2]/li")
    WebElement related1;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-content/div/div[3]/div[1]/div[2]/ul[4]/li")
    WebElement related2;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-content/div/div[1]/app-breadcrumb/ul/li[3]/a/span/app-category-list/span")
    WebElement subCatBreadcrumb
    @FindBy(xpath = "/html/body/app-root/div[1]/app-content/div/div[1]/app-breadcrumb/ul/li[2]/a/span/app-category-list/span")
    WebElement categoryBread;
    @FindBy(partialLinkText = "10 Food Recipes for 1 to 2 years old kids")
    WebElement exitLink;
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
    public void TC28_1() throws InterruptedException
    {
        related1.click();
        pause1();
        scroll("scroll(800,2800)");
        related2.click();
        pause2();
    }
        public void TC29() throws InterruptedException
        {
            driver.navigate().refresh();
            pause1();
            waitForElement(driver,related1,60);
            related1.click();
            pause1();
        }
        public void TC29_1() throws InterruptedException
        {
            waitForElement(driver,related2,60);
            related2.click();
            pause1();
        }
        public void TC31() throws InterruptedException
        {
            waitForElement(driver,lifestageBread,60);
            lifestageBread.click();
            pause1();
        }
        public void TC32() throws InterruptedException
        {
            expectingLifestage.click();
            pause1();
            kidLifestage.click();
            dobDay.click();
            driver.findElement(By.xpath("//*[@id=\"mat-option-6\"]")).click();
            dobmonth.click();
            driver.findElement(By.xpath("//*[@id=\"mat-option-39\"]")).click();
            dobYear.click();
            driver.findElement(By.xpath("//*[@id=\"mat-option-49\"]")).click();
            dobSubmit.click();
            pause();
            BDLogo.click();
            pause2();

        }
//            public void TC33() throws InterruptedException
//    {
//
//            pause1();
//            scroll("scroll(0,1900)");
//            waitForElement(driver,video1,60);
//            pause1();
//            video1.click();
//
//    }
//       public void TC34() throws InterruptedException
//    {
//        pause();
//        driver.switchTo().frame("ebyust3");
//        videoYoutubeIcon.click();
//        videoYoutubeIcon.click();
//        pause();
//        playPauseButton.click();
//        pause2();
//        playPauseButton.click();
//        pause2();
//        fullScreen.click();
//        pause3();
//        fullScreen.click();
//
//    }
//    public void TC35() throws InterruptedException
//    {
//       pause2();
//       relatedVideo.click();
//       videoYoutubeIcon.click();
//       playPauseButton.click();
//       playPauseButton.click();
//       fullScreen.click();
//       fullScreen.click();
//
//    }



    }
