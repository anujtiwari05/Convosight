package com.babydestination.automation.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.babydestination.automation.testBase.TestBase;

public class whatsappDirectory extends TestBase {
    public static final Logger log = Logger.getLogger(whatsappDirectory.class.getName());

    @FindBy(xpath = "/html/body/app-root/div[1]/app-home/div/div[2]/div/div/swiper/div/div[1]/div[1]/div/button")
    WebElement joinNowHome;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-whatsapp-directory/div/ul/li[3]/a")
    WebElement joinChennaiGroup;


    public whatsappDirectory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void joinWhatsapp() throws InterruptedException {

        log.info("Homepage Loaded");
        Thread.sleep(1000);
        scroll("scroll(0,400)");
        log.info("page scrolled");

        joinNowHome.click();
        Thread.sleep(5000);
        joinChennaiGroup.click();
        pause();
        back();


    }
}
