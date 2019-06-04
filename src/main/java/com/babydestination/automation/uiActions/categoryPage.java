package com.babydestination.automation.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.babydestination.automation.testBase.TestBase;

public class categoryPage extends TestBase {
    public static final Logger log = Logger.getLogger(categoryPage.class.getName());

    @FindBy(xpath = "/html/body/app-root/div[1]/app-home/div/div[5]/div/div/swiper/div/div[1]/div[1]/div")
    WebElement expBlog1;
    @FindBy(xpath = "//*[@id=\"mat-input-0\"]")
    WebElement expName;
    @FindBy(xpath = "//*[@id=\"mat-input-1\"]")
    WebElement expEmail;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home/div[2]/app-unlock/div/app-personal-info/div/div[2]/form/div[3]/button/span")
    WebElement expSubmit;


    public categoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void categoryPageTests() throws InterruptedException {

        log.info("Homepage Loaded");
        Thread.sleep(1000);
        scroll("scroll(0,1200)");
        log.info("page scrolled");
        if (expBlog1.isDisplayed() == false) {
            Thread.sleep(4000);
            expBlog1.click();
        }
        log.info("Random blog clicked");
        Thread.sleep(2000);
        expName.sendKeys("Anuj Tiwari");
        expEmail.sendKeys("anuj@bbd.com");
        Thread.sleep(1000);
        expSubmit.click();
        Thread.sleep(1000);
        expBlog1.click();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(2000);

    }
}