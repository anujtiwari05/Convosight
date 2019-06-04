package com.babydestination.automation.uiActions;
import com.babydestination.automation.uiActions.blogDetailPage;
import org.apache.log4j.Logger;
import org.apache.xpath.operations.Bool;
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
    @FindBy(xpath = "//*[@id=\"keyword\"]")
    WebElement searchBox;

    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[2]/div/div/h1")
    WebElement hindiHeadingText;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[2]/div/div/h1")
    WebElement tamilHeadingText;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[2]/div/div/h1")
    WebElement banglaHeadingText;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[2]/div/div/h1")
    WebElement engHeadingText;



    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/footer/div[2]/div/div/app-footer/footer/div/ul/li[1]/a")
    WebElement aboutFooter;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/footer/div[2]/div/div/app-footer/footer/div/ul/li[4]/a")
    WebElement privacyFooter;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/footer/div[2]/div/div/app-footer/footer/div/ul/li[3]/a")
    WebElement termsFooter;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/footer/div[2]/div/div/app-footer/footer/div/ul/li[2]/a")
    WebElement contactFooter;


    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/footer/div[2]/div/div/app-footer/footer/div/div/a[1]/img")
    WebElement fbFooter;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/footer/div[2]/div/div/app-footer/footer/div/div/a[2]/img")
    WebElement instaFooter;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/footer/div[2]/div/div/app-footer/footer/div/div/a[3]/img")
    WebElement twitterFooter;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/footer/div[2]/div/div/app-footer/footer/div/div/a[4]/img")
    WebElement youtubeFooter;

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

    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[1]/div/div/div/button")
    WebElement partnerUs;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[3]/div/div[1]/div/div[1]/div/div/swiper")
    WebElement gettingPregSection;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[3]/div/div[1]/div/div[2]/div/div/swiper")
    WebElement pregnancySection;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[3]/div/div[1]/div/div[3]/div/div/swiper")
    WebElement babySection;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[3]/div/div[1]/div/div[4]/div/div/swiper")
    WebElement toddlerSection;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[3]/div/div[1]/div/div[5]/div/div/swiper")
    WebElement parentingSection;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[3]/div/div[1]/div/div[6]/div/div/swiper")
    WebElement womenLifeSection;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[4]/div/div/div/div/div/swiper")
    WebElement expertSection;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[5]/div/div/div/div/div/swiper")
    WebElement videoSection;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[6]/div/div/div/div/div/swiper")
    WebElement tipsSection;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[8]/div/div/div/div/div/div")
    WebElement askMomsSection;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[9]/div/div/div/div/div/swiper")
    WebElement testimonialSection;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/footer/div[1]/div/div/div/div/swiper")
    WebElement BDNewsSection;


    @FindBy(xpath = "/html/body/app-root/div[1]/app-content/div/div[3]/div[1]/div[2]/div/h3")
    WebElement cardPageReadNext;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[6]/div/div/div/div/div/swiper/div/div[1]/div[1]")
    WebElement cardBlog;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-content/div/div[3]/div[1]/div[1]/app-video/div/div/div/div/div")
    WebElement youtubeIcon;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[5]/div/div/div/div/div/swiper/div/div[1]/div[1]")
    WebElement videoBlog;
    @FindBy(xpath = "//*[@id=\"desktop-widget\"]/div[1]/button")
    WebElement joinNowHome;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-whatsapp-directory/div/ul/li[3]/a")
    WebElement joinChennaiGroup;
    @FindBy(xpath = "//*[@id=\"mat-input-0\"]")
    WebElement expName;
    @FindBy(xpath = "//*[@id=\"mat-input-1\"]")
    WebElement expEmail;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div[2]/app-unlock/div/app-personal-info/div/div[2]/form/div[3]/button/span")
    WebElement expSubmit;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[4]/div/div/div/div/div/swiper/div/div[1]/div[1]")
    WebElement expertBlog;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-category2/div/div/div/div[1]/div/h1")
    WebElement gettingTextCatPage;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-content/div/div[3]/div[1]/div/div[2]/button")
    WebElement continuePregBlog;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[3]/div/div[1]/div/div[1]/div/div/div/h2")
    WebElement gettingPregCat;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[3]/div/div[1]/div/div[1]/div/div/div/p")
    WebElement gettingPregDesc;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[3]/div/div[1]/div/div[1]/div/div/swiper/div/div[1]/div[1]")
    WebElement gettingPregBlog;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[3]/div/div[1]/div/div[1]/div/div/swiper/div/div[2]/span[3]")
    WebElement gettinPredThirdDot;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[3]/div/div[1]/div/div[1]/div/div/a/button")
    WebElement gettingPregSeeAll;
    @FindBy(xpath = "/html/body/app-root/app-header/div/div/nav/div[1]/div[2]/a[2]/span")
    WebElement loginSignupHeader;
    @FindBy(xpath = "//*[@id=\"desktop-widget\"]")
    WebElement askMomWAWidget;
    @FindBy(xpath = "/html/body/app-root/app-header/div/div/div[1]/ul")
    WebElement isMenuHeaderPresent;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/footer/div[2]/div/div/app-footer/footer/div")
    WebElement isFooterPresent;
    @FindBy(xpath = "/html/body/app-root/app-header/div/div/nav")
    WebElement isTopHeaderPresent;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


//	public void homePageBlog() throws InterruptedException,IOException {

    public void TC1_TopHeader_Present() throws InterruptedException, IOException {
        waitForElement(driver,isTopHeaderPresent,60);
        Boolean isPresent =isTopHeaderPresent.isDisplayed();
        Assert.assertEquals(isPresent.toString(),"true");
        pause1();

    }
    public void TC2_menuHeader_Present() throws InterruptedException, IOException {
        waitForElement(driver,isMenuHeaderPresent,60);
        Boolean isPresent =isMenuHeaderPresent.isDisplayed();
        Assert.assertEquals(isPresent.toString(),"true");
        pause1();

    }
    public void TC3_footer_Present() throws InterruptedException, IOException {
        scroll("scroll(0,6000)");
        pause1();
        waitForElement(driver,isFooterPresent,60);
        Boolean isPresent =isFooterPresent.isDisplayed();
        Assert.assertEquals(isPresent.toString(),"true");
        pause1();

    }
    public void TC4_widgets_ask_WA_Present() throws InterruptedException, IOException {
        waitForElement(driver,askMomWAWidget,60);
        Boolean isPresent =askMomWAWidget.isDisplayed();
        if (loginSignupHeader.getText()=="LOGIN / SIGN-UP") {
            Assert.assertEquals(isPresent.toString(), "true");
            pause1();
        }
        pause1();

    }
    public void TC5_all_categories_postcard_present() throws InterruptedException, IOException {

        waitForElement(driver,gettingPregCat,60);
        pause1();
        Boolean isGettingCat = gettingPregCat.isDisplayed();
        Assert.assertEquals(isGettingCat.toString(),"true");
        Boolean isGettingDesc = gettingPregDesc.isDisplayed();
        Assert.assertEquals(isGettingDesc.toString(),"true");
        Boolean isGettingBlog = gettingPregBlog.isDisplayed();
        Assert.assertEquals(isGettingBlog.toString(),"true");
        Boolean isGettingDot = gettinPredThirdDot.isDisplayed();
        Assert.assertEquals(isGettingDot.toString(),"true");
        Boolean isGettingSee = gettingPregSeeAll.isDisplayed();
        Assert.assertEquals(isGettingSee.toString(),"true");

    }
    public void TC6_click_blog() throws InterruptedException, IOException {
        waitForElement(driver,gettingPregBlog,60);
        gettingPregBlog.click();
        pause2();
        Boolean isContinue = continuePregBlog.isDisplayed();
        Assert.assertEquals(isContinue.toString(),"true");
        back();
        pause2();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.babydestination.com/");

    }
    public void TC7_click_seeAll() throws InterruptedException, IOException {
        waitForElement(driver,gettingPregSeeAll,60);
        gettingPregSeeAll.click();
        pause2();
        Boolean isCategory = gettingTextCatPage.isDisplayed();
        Assert.assertEquals(isCategory.toString(),"true");
        driver.navigate().back();
        pause2();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.babydestination.com/");

    }
    public void TC8_expert_popup_submit() throws InterruptedException, IOException {
        scroll("scroll(0,1200)");
        waitForElement(driver,expertBlog,60);
        expertBlog.click();
        pause1();
        expName.sendKeys("Anuj Tiwari");
        expEmail.sendKeys("anuj@bbd.com");
        Boolean isExpSubmit = expSubmit.isDisplayed();
        Assert.assertEquals(isExpSubmit.toString(),"true");
        pause1();
        expSubmit.click();
        pause3();
        expertBlog.click();
        pause();
        back();pause1();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.babydestination.com/");

    }
    public void TC9_whatsapp_directory_page() throws InterruptedException, IOException {
        scroll("scroll(0,1200)");
        waitForElement(driver,expertBlog,60);
        joinNowHome.click();
        pause2();
        Assert.assertEquals(driver.getTitle(),"Whatsapp Directory");
        joinChennaiGroup.click();
        pause();
        Assert.assertEquals(driver.getTitle(),"WhatsApp");
        back();
        pause2();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.babydestination.com/");

    }
    public void TC10_video_blog_open() throws InterruptedException, IOException {
        scroll("scroll(0,1200)");
        waitForElement(driver,videoBlog,60);
        videoBlog.click();
       pause2();
       Boolean isYoutube = youtubeIcon.isDisplayed();
       Assert.assertEquals(isYoutube.toString(),"true");
       pause1();back();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.babydestination.com/");
       pause2();

    }
    public void TC11_card_blog_open() throws InterruptedException, IOException {
        scroll("scroll(0,1200)");
        waitForElement(driver,cardBlog,60);
        cardBlog.click();
        pause2();
        Boolean isCardReadNext = cardPageReadNext.isDisplayed();
        Assert.assertEquals(isCardReadNext.toString(),"true");
        pause1();back();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.babydestination.com/");
        pause2();

    }
    public void TC12_all_sections_present() throws InterruptedException, IOException {

        driver.navigate().refresh();pause1();
        Boolean isGettingSection = gettingPregSection.isDisplayed();
        Assert.assertEquals(isGettingSection.toString(),"true");
        Boolean isPregSection = pregnancySection.isDisplayed();
        Assert.assertEquals(isPregSection.toString(),"true");
        Boolean isBabySection = babySection.isDisplayed();
        Assert.assertEquals(isBabySection.toString(),"true");
        Boolean isToddlerSection = toddlerSection.isDisplayed();
        Assert.assertEquals(isToddlerSection.toString(),"true");
        Boolean isParentingSection = parentingSection.isDisplayed();
        Assert.assertEquals(isParentingSection.toString(),"true");
        Boolean isWomenLifeSection = womenLifeSection.isDisplayed();
        Assert.assertEquals(isWomenLifeSection.toString(),"true");
        Boolean isExpertSection = expertSection.isDisplayed();
        Assert.assertEquals(isExpertSection.toString(),"true");
        Boolean isVideoSection = videoSection.isDisplayed();
        Assert.assertEquals(isVideoSection.toString(),"true");
        Boolean isCardSection = tipsSection.isDisplayed();
        Assert.assertEquals(isCardSection.toString(),"true");
        Boolean isAskMomsSection = askMomsSection.isDisplayed();
        Assert.assertEquals(isAskMomsSection.toString(),"true");
        Boolean isTestimonialSection = testimonialSection.isDisplayed();
        Assert.assertEquals(isTestimonialSection.toString(),"true");
        Boolean isBDNewsSection = BDNewsSection.isDisplayed();
        Assert.assertEquals(isBDNewsSection.toString(),"true");
        pause1();

    }
    public void TC13_partner_us_page() throws InterruptedException, IOException {
        waitForElement(driver,partnerUs,30);
        partnerUs.click();
        scroll("scroll(0,1000)");
        pause2();
        scroll("scroll(1000,2250)");
        pause2();
        Assert.assertEquals( driver.getTitle(),"partner-with-us");
        pause1();
        driver.navigate().back();
        pause2();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.babydestination.com/");
        pause1();

    }
    public void TC14_language_dropdown() throws InterruptedException, IOException {
        vernacularDrop.click();
        pause1();
        langHin.click();
        pause2();
        Assert.assertEquals( hindiHeadingText.getText(),"बेबी डेस्टिनेशन");
        pause1();
        vernacularDrop.click();
        pause1();
        langTamil.click();
        pause2();
        Assert.assertEquals(tamilHeadingText.getText(),"பேபி டெஸ்டினேஷன்");
        pause1();
        vernacularDrop.click();
        pause1();
        langBangla.click();
        pause2();
        Assert.assertEquals(banglaHeadingText.getText(),"বেবি ডেস্টিনেশন");
        pause1();
        vernacularDrop.click();
        pause1();
        langEng.click();
        pause2();
        Assert.assertEquals( engHeadingText.getText(),"Baby Destination");
        pause1();

    }
    public void TC15_Footer_social_links_redirection() throws InterruptedException, IOException {
        waitForElement(driver,fbFooter,30);
        fbFooter.click();
        Assert.assertEquals( driver.getCurrentUrl(),"https://www.facebook.com/Babydestination/");
        pause3();
        driver.navigate().back();
        pause2();
        waitForElement(driver,instaFooter,30);
        instaFooter.click();
        pause2();
        Assert.assertEquals( driver.getCurrentUrl(),"https://www.instagram.com/baby_destinationofficial/");
        pause1();
        driver.navigate().back();
        pause2();
        waitForElement(driver,twitterFooter,30);
        twitterFooter.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://twitter.com/@babydestination");
        pause3();
        driver.navigate().back();
        pause2();
        waitForElement(driver,youtubeFooter,30);
        youtubeFooter.click();
        Assert.assertEquals( driver.getCurrentUrl(),"https://www.youtube.com/channel/UCItunh2YRiNNgwvGKqhVk9Q");
        pause3();
        driver.navigate().back();
        pause2();
    }
    public void TC16_Footer_pages_links_redirection() throws InterruptedException, IOException {
        waitForElement(driver,aboutFooter,30);
        aboutFooter.click();
        Assert.assertEquals( driver.getCurrentUrl(),"https://www.babydestination.com/about-us");
        pause1();
        driver.navigate().back();
        waitForElement(driver,contactFooter,30);
        contactFooter.click();
        Assert.assertEquals( driver.getCurrentUrl(),"https://www.babydestination.com/contact");
        pause1();
        driver.navigate().back();
        waitForElement(driver,termsFooter,30);
        termsFooter.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.babydestination.com/terms-of-use");
        pause1();
        driver.navigate().back();
        waitForElement(driver,privacyFooter,30);
        privacyFooter.click();
        Assert.assertEquals( driver.getCurrentUrl(),"https://www.babydestination.com/privacy-policy");
        pause1();
        driver.navigate().back();
        pause2();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.babydestination.com/");
        pause();
    }
    public void TC17_search_page() throws InterruptedException, IOException {
        waitForElement(driver,searchBox,60);
        searchBox.sendKeys("baby care");
        searchBox.sendKeys(Keys.ENTER);
        pause();
        Assert.assertEquals(driver.getTitle(),"baby care");
        driver.navigate().back();
        pause1();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.babydestination.com/");

    }




}
