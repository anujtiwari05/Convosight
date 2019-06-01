package com.babydestination.automation.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.babydestination.automation.testBase.TestBase;

import java.util.Iterator;
import java.util.Set;

public class loginSignup extends TestBase {
    public static final Logger log = Logger.getLogger(loginSignup.class.getName());

    @FindBy(xpath = "/html/body/app-root/app-header/div/div/nav/div[1]/div[2]/a[2]")

    WebElement loginSignupButton;
    @FindBy(linkText = "Do not have an account? Sign Up")
    WebElement signupLink;
    @FindBy(xpath = "//*[@id=\"mat-radio-6\"]/label/div[1]/div[2]")
    WebElement expectingLifestage;
    @FindBy(xpath = "//*[@id=\"mat-radio-5\"]/label/div[1]/div[2]")
    WebElement kidLifestage;
    @FindBy(xpath = "/html/body/app-root/div[3]/app-user-registration/div/div[2]/div/app-personal-info/div/div[2]/form/div[2]/mat-form-field[1]/div/div[1]/div/mat-select/div/div[1]")
    WebElement dobDay;
    @FindBy(xpath = "/html/body/app-root/div[3]/app-user-registration/div/div[2]/div/app-personal-info/div/div[2]/form/div[2]/mat-form-field[2]/div/div[1]/div/mat-select/div/div[1]")
    WebElement dobmonth;
    @FindBy(xpath = "/html/body/app-root/div[3]/app-user-registration/div/div[2]/div/app-personal-info/div/div[2]/form/div[2]/mat-form-field[3]/div/div[1]/div/mat-select/div/div[1]")
    WebElement dobYear;
    @FindBy(id = "mat-input-6")
    WebElement dobEmail;
    @FindBy(id = "mat-input-7")
    WebElement dobPassword;
    @FindBy(xpath = "/html/body/app-root/div[3]/app-user-registration/div/div[2]/div/app-personal-info/div/div[2]/form/div[6]/button/span")
    WebElement dobRegister;
    @FindBy(xpath = "/html/body/app-root/app-header/div/nav/div[1]/a/img")
    WebElement BDLogo;
    @FindBy(linkText = "Already have an account? Sign In")
    WebElement signinLink;
    @FindBy(xpath = "/html/body/app-root/app-header/div/div/nav/div[1]/div[2]/div[2]/a")
    WebElement logoutIcon;
    @FindBy(xpath = "/html/body/app-root/app-header/div/div/nav/div[1]/div[2]/div[2]/div")
    WebElement logoutButton;
    @FindBy(name = "email")
    WebElement loginEmail;
    @FindBy(name = "password")
    WebElement loginPass;
    @FindBy(xpath = "/html/body/app-root/div[3]/app-login/div[1]/div[2]/div/button")
    WebElement FBloginButton;
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement FBEmail;
    @FindBy(xpath = "//*[@id=\"pass\"]")
    WebElement FBPass;
    @FindBy(xpath = "//*[@id=\"u_0_0\"]")
    WebElement FBSigninButton;
    @FindBy(xpath = "/html/body/app-root/div[3]/app-login/div/div[2]/div/app-personal-info/div/div[2]/form/div[3]/button")

    WebElement signInButton;


    public loginSignup(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginSignupHeader() throws InterruptedException {
waitForElement(driver,loginSignupButton,60);
        loginSignupButton.click();
    }

    public void loginSignupLink() throws InterruptedException {
        signupLink.click();
        signinLink.click();
        signupLink.click();
        pause2();
    }
       //uncomment just 3 below lines
//
//        signupLink.click();
//        expectingLifestage.click();
//        kidLifestage.click();
//         dobDay.click();
//         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/mat-option[3]/span")).click();
//         dobmonth.click();
//         driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/mat-option[4]/span")).click();
//         dobYear.click();
//         driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/mat-option[5]/span")).click();pause();
//         dobEmail.clear();
//         dobEmail.sendKeys("submit1@gmaiil.com");
//         dobPassword.sendKeys("123456");
//         dobRegister.click();pause();


    public void loginSignupDuplicate() throws InterruptedException {
        waitForElement(driver,loginEmail,60);
        loginEmail.sendKeys("b@bd.com");
        loginPass.sendKeys("    ");
        pause1();
        signInButton.click();
        pause();
    }

    public void login() throws InterruptedException {
        waitForElement(driver,FBloginButton,60);
//        loginEmail.sendKeys("submit1234@gmail.com");
//        loginPass.sendKeys("123456");
//        pause1();
//        signInButton.click();
//        pause();
        FBloginButton.click();
        pause2();
        String parent_window=driver.getWindowHandle();
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();
        while(i1.hasNext())
        {
            String child_window=i1.next();
            if(!parent_window.equalsIgnoreCase(child_window))
            {
                pause1();
                driver.switchTo().window(child_window);
                pause1();
                FBEmail.sendKeys("anujtiwari05@gmail.com");
                FBPass.sendKeys("anuj@passwordd");
                FBSigninButton.click();
                pause3();
                driver.switchTo().window(parent_window);
//                driver.close();
//                scroll("scroll(0,100)");
            }
       }
   }

    public void signUp() throws InterruptedException {
        dobDay.click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/mat-option[3]/span")).click();
        dobmonth.click();
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/mat-option[4]/span")).click();
        dobYear.click();
        driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/mat-option[5]/span")).click();
        pause1();
        dobEmail.sendKeys("submit1211@gmail.com");
        pause1();
        dobPassword.sendKeys("123456");
        pause1();
        dobRegister.click();
        pause3();
    }
    public void logOut() throws InterruptedException
    {
        driver.navigate().refresh();
        pause2();
        waitForElement(driver,logoutIcon,60);
        logoutIcon.click();
        waitForElement(driver,logoutButton,60);
        logoutButton.click();
    }

}