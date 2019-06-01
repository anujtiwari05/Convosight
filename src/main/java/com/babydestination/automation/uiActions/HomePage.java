package com.babydestination.automation.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.babydestination.automation.testBase.TestBase;

import java.io.IOException;
import java.util.Properties;

public class HomePage extends TestBase {

    public static final Logger log = Logger.getLogger(HomePage.class.getName());

    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[3]/div/div/swiper/div/div[1]/div[1]")
    WebElement blog1;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[6]/div/div/swiper/div/div[1]/div[3]")
    WebElement video1;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[7]/div/div/swiper/div/div[1]/div[3]/a")

    WebElement card1;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[2]/div/div/swiper/div/div[4]")
    WebElement RArrow1;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[5]/div/div/swiper/div/div[1]/div[1]/div")
    WebElement expBlog1;
    @FindBy(xpath = "//*[@id=\"mat-input-0\"]")
    WebElement expName;
    @FindBy(xpath = "//*[@id=\"mat-input-1\"]")
    WebElement expEmail;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div[2]/app-unlock/div/app-personal-info/div/div[2]/form/div[3]/button/span")
    WebElement expSubmit;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-content/div/div[3]/div[1]/div[2]/button")
    WebElement continueReading;
    WebElement RArrow2;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[4]/div/div/div/swiper/div/div[4]")
    WebElement RArrow3;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[4]/div/div/div/swiper/div/div[1]/div[6]/div[2]/button")
    WebElement seeMoreButton1;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[4]/div/div/div/swiper/div/div[1]/div[9]/div[2]/button")
    WebElement seeMoreButton2;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[4]/div/div/div/swiper/div/div[1]/div[8]/div/div[2]/div/div/button")
    WebElement clickToAnswerHome;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[1]/div/div/div/button")
    WebElement partnerUs;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/footer/div[1]/div/div/div/swiper/div/div[1]/div[3]/a/img")
    WebElement BDNews;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/footer/div[3]/div/div/app-footer/footer/div/div/a[1]/img")
    WebElement fbFooter;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/footer/div[3]/div/div/app-footer/footer/div/div/a[2]/img")
    WebElement instaFooter;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/footer/div[3]/div/div/app-footer/footer/div/div/a[3]/img")
    WebElement twitterFooter;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/footer/div[3]/div/div/app-footer/footer/div/div/a[4]/img")
    WebElement youtubeFooter;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[2]/div/div/swiper/div/div[1]/div[1]/div/button")
    WebElement joinNowHome;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[2]/div/div/swiper/div/div[1]/div[2]/div/button")
    WebElement exploreHome;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[2]/div/div/swiper/div/div[1]/div[3]/div/button")
    WebElement askMomHome;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[2]/div/div/swiper/div/div[1]/div[4]/div/button")
    WebElement fbConnectHome;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[2]/div/div/swiper/div/div[1]/div[5]/div/button")
    WebElement signupHome;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div[2]/app-user-registration/div/button")
    WebElement signupCross;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div[2]/div/app-facebook-group-join/div/div/div/button")
    WebElement fbCross;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div[2]/div/app-facebook-group-join/div/div/div/div/div/div[2]/div[3]/button/a")
    WebElement joinFbConnect;
    @FindBy(id = "keyword")
    WebElement searchBox;
    @FindBy(xpath = "/html/body/app-root/app-header/div/div/nav/div[1]/div[1]/ul/li[2]")
    WebElement langHin;
    @FindBy(xpath = "/html/body/app-root/app-header/div/div/nav/div[1]/div[1]/ul/li[4]")
    WebElement langBangla;
    @FindBy(xpath = "/html/body/app-root/app-header/div/div/nav/div[1]/div[1]/ul/li[3]")
    WebElement langTamil;
    @FindBy(xpath = "/html/body/app-root/app-header/div/div/nav/div[1]/div[1]/ul/li[1]")
    WebElement langEng;
    @FindBy(xpath = "/html/body/app-root/app-header/div/div/nav/div[1]/div[1]/i")
    WebElement vernacularDrop;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-content/div/div[3]/div[2]/div/div[1]/div/div[2]/button")
    WebElement whatsAppjoinwidget;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-forum/div[1]/div/div[1]/div[1]/div[1]/h3")
    WebElement askAnything;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


//	public void homePageBlog() throws InterruptedException,IOException {

        public void TC1() throws InterruptedException,IOException {
        engPropFile();
        pause1();
        scroll("scroll(0,750)");
        waitForElement(driver,blog1,60);
        blog1.click();
        Assert.assertEquals(continueReading.getText(),OR.getProperty("Continue_Reading"));
        pause2();
        back();

    }

    public void TC2() throws InterruptedException,IOException {
        engPropFile();
        waitForElement(driver,partnerUs,30);
        partnerUs.click();
        scroll("scroll(0,1000)");
        pause2();
        scroll("scroll(1000,2250)");
        pause2();
        Assert.assertEquals( driver.getTitle(),OR.getProperty("partner_with_us"));
    }

    public void TC3() throws InterruptedException,IOException {
        engPropFile();
        driver.navigate().back();
        pause1();
        Assert.assertEquals(driver.getTitle(),OR.getProperty("homepage_title"));
    }

    public void TC4() throws InterruptedException,IOException {
        engPropFile();
        scroll("scroll(0,1500)");
        waitForElement(driver,video1,60);
        pause2();
        video1.click();
        Assert.assertEquals(whatsAppjoinwidget.getText(),OR.getProperty("Join_WhatsApp_Group"));
        back();
    }

    public void TC4_1() throws InterruptedException,IOException {
        engPropFile();
        pause1();
        scroll("scroll(0,1200)");
        pause();
        Assert.assertEquals(driver.getTitle(), OR.getProperty("homepage_title"));
    }


//        log.info("page scrolled");

    public void TC5() throws InterruptedException,IOException {
        engPropFile();
        waitForElement(driver,expBlog1,60);
        expBlog1.click();
        Assert.assertEquals(expSubmit.getText(),OR.getProperty("Unlock_Now") );
    }

    //        log.info("Random blog clicked");
    public void TC6() throws InterruptedException,IOException {
        engPropFile();
        waitForElement(driver,expName,60);
        expName.sendKeys("Anuj Tiwari");
        expEmail.sendKeys("anuj@bbd.com");
        expSubmit.click();
        pause();
        waitForElement(driver,expBlog1,60);
        expBlog1.click();
        Assert.assertEquals(continueReading.getText(),OR.getProperty("Continue_Reading"));
    }

    public void TC7() throws InterruptedException,IOException {
        engPropFile();
        pause2();
        back();
        Assert.assertEquals( driver.getTitle(),OR.getProperty("homepage_title"));
    }

    public void TC8() throws InterruptedException,IOException {
        engPropFile();
        scroll("scroll(0,2000)");
        waitForElement(driver,card1,60);
        card1.click();
        Assert.assertEquals(whatsAppjoinwidget.getText(),OR.getProperty("Join_WhatsApp_Group"));
    }

    public void TC9() throws InterruptedException,IOException {
        engPropFile();
        pause3();
        back();
        Assert.assertEquals(driver.getTitle(),OR.getProperty("homepage_title") );
        pause2();
    }

    public void TC10() throws InterruptedException,IOException {
        engPropFile();
        waitForElement(driver,joinNowHome,60);
        joinNowHome.click();
        Assert.assertEquals( driver.getTitle(),OR.getProperty("Whatsapp_Directory"));
        pause2();
        driver.navigate().back();
    }

    public void TC11() throws InterruptedException,IOException {
        engPropFile();
        waitForElement(driver,exploreHome,60);
        exploreHome.click();
        pause();
        Assert.assertEquals( driver.getTitle(),OR.getProperty("Timeline"));
        driver.navigate().back();
    }

    public void TC12() throws InterruptedException,IOException {
        engPropFile();
        pause2();
        waitForElement(driver,askMomHome,60);
        askMomHome.click();
        pause();pause();pause2();
        Assert.assertEquals(askAnything.getText(),OR.getProperty("Ask_moms_anything"));
        driver.navigate().back();
    }

    public void TC13() throws InterruptedException,IOException {
        engPropFile();
        waitForElement(driver,fbConnectHome,30);
        fbConnectHome.click();
        waitForElement(driver,joinFbConnect,30);
        joinFbConnect.click();
        Assert.assertEquals( joinFbConnect.getText(),OR.getProperty("FB_Connect"));
        pause2();
        newTab();
        pause2();
        fbCross.click();
        pause1();
    }

    public void TC14() throws InterruptedException,IOException {
        engPropFile();
        RArrow1.click();
        waitForElement(driver,signupHome,60);
        signupHome.click();
        Assert.assertEquals( driver.getTitle(),OR.getProperty("Sign_up"));
        pause1();
        signupCross.click();
        pause2();
    }

    public void TC15() throws InterruptedException,IOException {
        engPropFile();
        scroll("scroll(0,1000)");
        waitForElement(driver,RArrow3,60);
        for (int i = 0; i <= 1; i++) {
            RArrow3.click();
            pause1();

        }
        Assert.assertEquals(seeMoreButton1.getText(),OR.getProperty("SEE_MORE"));
        seeMoreButton1.click();pause();pause();pause3();
    }

    public void TC16() throws InterruptedException,IOException {
        engPropFile();
        waitForElement(driver,RArrow3,60);
        for (int i = 0; i <= 2; i++) {
            RArrow3.click();
            pause1();

        }
        Assert.assertEquals( seeMoreButton2.getText(),OR.getProperty("SEE_MORE"));
        seeMoreButton2.click();
        pause();pause();
    }

    public void TC17() throws InterruptedException,IOException {
        engPropFile();
        waitForElement(driver,clickToAnswerHome,60);
        clickToAnswerHome.click();
        Assert.assertEquals( driver.getTitle(),OR.getProperty("Forum_Ask_Question"));
        driver.navigate().back();
    }

    //        RArrow2.click();
    public void TC18() throws InterruptedException,IOException {
        engPropFile();
        scroll("scroll(0,2000)");
        waitForElement(driver,fbFooter,30);
        fbFooter.click();
        Assert.assertEquals( driver.getCurrentUrl(),OR.getProperty("Prod_FB_Page"));
        pause3();
        driver.navigate().back();
    }

    public void TC19() throws InterruptedException,IOException {
        engPropFile();
        waitForElement(driver,instaFooter,30);
        instaFooter.click();
        pause2();
        Assert.assertEquals( driver.getCurrentUrl(),OR.getProperty("Prod_Insta_Page"));
        pause1();
        driver.navigate().back();

    }

    public void TC20() throws InterruptedException,IOException {
        engPropFile();
        waitForElement(driver,twitterFooter,30);
        twitterFooter.click();
        Assert.assertEquals(driver.getCurrentUrl(),OR.getProperty("Prod_Twitter_Page"));
        pause3();
        driver.navigate().back();

    }

    public void TC21() throws InterruptedException,IOException {
        engPropFile();
        waitForElement(driver,youtubeFooter,30);
        youtubeFooter.click();
        Assert.assertEquals( driver.getCurrentUrl(),OR.getProperty("Prod_Youtube_Page"));
        pause3();
        driver.navigate().back();

    }

    public void TC22() throws InterruptedException,IOException {
        waitForElement(driver,BDNews,30);
        BDNews.click();
        pause();
        newTab();
    }

    public void TC23() throws InterruptedException,IOException {
        engPropFile();
        searchBox.sendKeys("baby care");
        pause1();
        searchBox.sendKeys(Keys.ENTER);
        pause();
        pause1();
        Assert.assertEquals(driver.getTitle(),OR.getProperty("search_baby_care"));
    }

    public void TC24() throws InterruptedException,IOException {
        vernacularDrop.click();
        pause1();
        langHin.click();
        pause();
        Assert.assertEquals( driver.getCurrentUrl().endsWith("hindi.babydestination.com"),true);
    }

    public void TC25() throws InterruptedException,IOException {
        vernacularDrop.click();
        pause1();
        langTamil.click();
        pause();
        Assert.assertEquals( driver.getCurrentUrl().endsWith("tamil.babydestination.com"),true);
        pause();

    }
    public void TC26() throws InterruptedException,IOException {
        vernacularDrop.click();
        pause1();
        langEng.click();
        pause();
        Assert.assertEquals( driver.getCurrentUrl().endsWith(".babydestination.com"),true);
        pause();
        driver.quit();
    }

}


