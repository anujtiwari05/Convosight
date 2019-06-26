package com.babydestination.automation.testBase;

import com.babydestination.automation.customListner.WebEventListener;
import com.babydestination.automation.excelReader.Excel_Reader;
import com.babydestination.automation.notificationHelper.SendEmail;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import javax.mail.MessagingException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;


/**
 * 
 * @author Anuj Tiwari
 *
 */

public class TestBase {

	public static final Logger log = Logger.getLogger(TestBase.class.getName());

	public WebDriver driver;
	Excel_Reader excel;
	JavascriptExecutor jse;
	// public EventFiringWebDriver driver;
	public WebEventListener eventListener;
	public Properties OR = new Properties();
	public static ExtentReports extent;
	public static ExtentTest test;
	public ITestResult result;
	FileInputStream f1;
	@FindBy(xpath = "/html/body/app-root/app-header/div/nav/div[1]/a/img")
	WebElement BDLogo;


	public WebDriver getDriver() {
		return driver;
	}

	static {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh");
		extent = new ExtentReports(System.getProperty("user.dir") + "/src/main/java/com/babydestination/automation/report/test" + formater.format(calendar.getTime()) + ".html", false);
//		extent = new ExtentReports( "https://hooks.slack.com/services/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"+formater.format(calendar.getTime()) + ".html", false);
	}

	public void loadData() throws IOException {
		File file = new File(System.getProperty("user.dir") + "/src/main/java/com/babydestination/automation/config/config.properties");
		FileInputStream f = new FileInputStream(file);
		OR.load(f);

	}

	public void engPropFile() throws IOException {
		File file1 = new File(System.getProperty("user.dir") + "/src/main/java/com/babydestination/automation/config/config.properties");
		Properties pr = new Properties();
		pr.load( new FileInputStream(file1));

		      if("prod_eng".equals(pr.getProperty("env"))){
		File file = new File(System.getProperty("user.dir") + "/src/main/java/com/babydestination/automation/config/eng.properties");
		f1 = new FileInputStream(file);
		OR.load(f1);
		}
		else if("prod_hindi".equals(pr.getProperty("env"))){
			File file = new File(System.getProperty("user.dir") + "/src/main/java/com/babydestination/automation/config/hindi.properties");
			f1 = new FileInputStream(file);
			InputStreamReader in_strm = new InputStreamReader(f1,"UTF-8");
			OR.load(in_strm);

		}else if("prod_tamil".equals(pr.getProperty("env"))){
			File file = new File(System.getProperty("user.dir") + "/src/main/java/com/babydestination/automation/config/tamil.properties");
			f1 = new FileInputStream(file);
			InputStreamReader in_strm = new InputStreamReader(f1,"UTF-8");
			OR.load(in_strm);


		}else if("prod_bangla".equals(pr.getProperty("env"))){
			File file = new File(System.getProperty("user.dir") + "/src/main/java/com/babydestination/automation/config/bangla.properties");
			f1 = new FileInputStream(file);
			InputStreamReader in_strm = new InputStreamReader(f1,"UTF-8");
			OR.load(in_strm);


			  }

	}


	public void setDriver(EventFiringWebDriver driver) {
		this.driver = driver;
	}
	public static String fileName()
	{
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh");
		String file =System.getProperty("user.dir") + "/src/main/java/com/babydestination/automation/report/test" + formater.format(calendar.getTime()) + ".html";
		return file;
	}

	public void init() throws IOException,InterruptedException {
		fileName();
		loadData();
		String log4jConfPath = "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		System.out.println(OR.getProperty("browser"));
		selectBrowser(OR.getProperty("browser"));
		getUrl(OR.getProperty("url"));
	}

	public void selectBrowser(String browser) {
		System.out.println(System.getProperty("os.name"));
		if (System.getProperty("os.name").contains("Window")) {
			if (browser.equals("chrome")) {
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
				driver = new ChromeDriver();
				// driver = new EventFiringWebDriver(dr);
				// eventListener = new WebEventListener();
				// driver.register(eventListener);
			} else if (browser.equals("firefox")) {
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
				// driver = new EventFiringWebDriver(dr);
				eventListener = new WebEventListener();
				// driver.register(eventListener);
				// setDriver(driver);
			}
		} else if (System.getProperty("os.name").contains("Mac")) {
			if (browser.equals("chrome")) {
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
				driver = new ChromeDriver();
				// driver = new EventFiringWebDriver(dr);
				// eventListener = new WebEventListener();
				// driver.register(eventListener);
			} else if (browser.equals("firefox")) {
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir") + "/drivers/geckodriver");
				driver = new FirefoxDriver();
				// driver = new EventFiringWebDriver(dr);
				eventListener = new WebEventListener();
				// driver.register(eventListener);
				// setDriver(driver);
			}
		}
		else if (System.getProperty("os.name").contains("Linux")) {
			if (browser.equals("chrome")) {
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriverlinux");
				driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
//				 driver = new EventFiringWebDriver(dr);
//				 eventListener = new WebEventListener();
//				 driver.register(eventListener);
			} else if (browser.equals("firefox")) {
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir") + "/drivers/geckodriver");
				driver = new FirefoxDriver();
				// driver = new EventFiringWebDriver(dr);
				eventListener = new WebEventListener();
				// driver.register(eventListener);
				// setDriver(driver);
			}
		}
	}

	public void getUrl(String url) throws InterruptedException{
		log.info("navigating to :-" + url);
		pause2();
		driver.manage().window().maximize();
		pause2();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

	}

	public String[][] getData(String excelName, String sheetName) {
		String path = System.getProperty("user.dir") + "/src/main/java/com/babydestination/automation/data/" + excelName;
		excel = new Excel_Reader(path);
		String[][] data = excel.getDataFromSheet(sheetName, excelName);
		return data;
	}

	public void waitForElement(WebDriver driver, int timeOutInSeconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void back() throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	}
	public void pause() throws InterruptedException {
		Thread.sleep(5000);
	}

	public void Home() throws InterruptedException {
		BDLogo.click();
		pause();
	}
	public void pause1() throws InterruptedException {
		Thread.sleep(1000);
	}
	public void pause2() throws InterruptedException {
		Thread.sleep(2000);
	}
	public void pause3() throws InterruptedException {
		Thread.sleep(3000);
	}
	public void scroll(String scr) throws InterruptedException {
		jse = (JavascriptExecutor) driver;
		jse.executeScript(scr);
		Thread.sleep(2000);
	}
	public void newTab() throws InterruptedException {
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		pause();
		driver.close();
		driver.switchTo().window(tabs2.get(0));
	}
	public void currentTitle() {
		driver.getTitle();
	}

	public void forward() {
		driver.navigate().forward();
	}

	public void getScreenShot(String name) {

		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "/src/main/java/com/babydestination/automation/screenshot/";
			File destFile = new File((String) reportDirectory + name + "_" + formater.format(calendar.getTime()) + ".png");
			FileUtils.copyFile(scrFile, destFile);
			// This will help us to link the screen shot in testNG report
			Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void highlightMe(WebDriver driver, WebElement element) throws InterruptedException {
		// Creating JavaScriptExecuter Interface
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Execute javascript
		js.executeScript("arguments[0].style.border='4px solid yellow'", element);
		Thread.sleep(3000);
		js.executeScript("arguments[0].style.border=''", element);
	}

	public Iterator<String> getAllWindows() {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		return itr;
	}

	public void getScreenShot(WebDriver driver, ITestResult result, String folderName) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");

		String methodName = result.getName();

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "/src/main/java/com/babydestination/automation/";
			File destFile = new File((String) reportDirectory + "/" + folderName + "/" + methodName + "_" + formater.format(calendar.getTime()) + ".png");

			FileUtils.copyFile(scrFile, destFile);

			Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void getScreenShotOnSucess(WebDriver driver, ITestResult result) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");

		String methodName = result.getName();

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "/src/main/java/com/babydestination/automation/";
			File destFile = new File((String) reportDirectory + "/failure_screenshots/" + methodName + "_" + formater.format(calendar.getTime()) + ".png");

			FileUtils.copyFile(scrFile, destFile);

			Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String captureScreen(String fileName) {
		if (fileName == "") {
			fileName = "blank";
		}
		File destFile = null;
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "/src/main/java/com/babydestination/automation/screenshot/";
			destFile = new File((String) reportDirectory + fileName + "_" + formater.format(calendar.getTime()) + ".png");
			FileUtils.copyFile(scrFile, destFile);
			// This will help us to link the screen shot in testNG report
			Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return destFile.toString();
	}

	public void log(String data) {
		log.info(data);
		Reporter.log(data);
		test.log(LogStatus.INFO, data);
	}

	public void getresult(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(LogStatus.PASS, result.getName() + " test is pass");
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(LogStatus.SKIP, result.getName() + " test is skipped and skip reason is:-" + result.getThrowable());
		} else if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.ERROR, result.getName() + " test is failed" + result.getThrowable());
			String screen = captureScreen("");
//			String screen =getScreenShot("");
			test.log(LogStatus.FAIL, test.addScreenCapture(screen));
		}
//		else if (result.getStatus() == ITestResult.STARTED) {
//			test.log(LogStatus.INFO, result.getName() + " test is started");
//		}
	}

	@AfterMethod()
	public void afterMethod(ITestResult result) {
		getresult(result);
	}

	@BeforeMethod()
	public void beforeMethod(Method result) {
		test = extent.startTest(result.getName());
		test.log(LogStatus.INFO, result.getName() + " test Started");
	}

	@AfterClass(alwaysRun = false)
	public void endTest() throws MessagingException, InterruptedException {

		closeBrowser();
		Quit();


	}
	@AfterSuite(alwaysRun = true)
	public void endTest_sendMail() throws MessagingException {
		SendEmail se= new SendEmail();
		se.emailSend();
	}

	public void closeBrowser() {
		//driver.quit();
		log.info("browser closed");
		extent.endTest(test);
		extent.flush();
	}
	public void Quit()
	{
		driver.quit();
	}

	public WebElement waitForElement(WebDriver driver, WebElement element, long timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}

	//@Parameters("browser")
	//@BeforeTest
	public void launchapp(String browser) throws IOException,InterruptedException {

		if (System.getProperty("os.name").contains("Mac")) {
			if (browser.equals("chrome")) {
				//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
				System.out.println(" Executing on CHROME");
				DesiredCapabilities cap = DesiredCapabilities.chrome();
				cap.setBrowserName("chrome");
				String Node = "http://localhost:5001/wd/hub";
				driver = new RemoteWebDriver(new URL(Node), cap);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				// Launch website
				loadData();
				getUrl(OR.getProperty("url"));
			} else if (browser.equals("firefox")) {
				//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
				System.out.println(" Executing on FireFox");
				String Node = "http://172.16.123.130:5000/wd/hub";
				DesiredCapabilities cap = DesiredCapabilities.firefox();
				cap.setBrowserName("firefox");
				driver = new RemoteWebDriver(new URL(Node), cap);
				loadData();
				getUrl(OR.getProperty("url"));
			} else if (browser.equalsIgnoreCase("ie")) {
				System.out.println(" Executing on IE");
				DesiredCapabilities cap = DesiredCapabilities.chrome();
				cap.setBrowserName("ie");
				String Node = "http://192.168.0.101:5555/wd/hub";
				driver = new RemoteWebDriver(new URL(Node), cap);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				// Launch website
				loadData();
				getUrl(OR.getProperty("url"));
			} else {
				throw new IllegalArgumentException("The Browser Type is Undefined");
			}
		}
		if (System.getProperty("os.name").contains("Window")) {
			if (browser.equals("chrome")) {
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
				System.out.println(" Executing on CHROME");
				DesiredCapabilities cap = DesiredCapabilities.chrome();
				cap.setBrowserName("chrome");
				String Node = "http://localhost:5555/wd/hub";
				driver = new RemoteWebDriver(new URL(Node), cap);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				// Launch website
				loadData();
				getUrl(OR.getProperty("url"));
			} else if (browser.equals("firefox")) {
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
				System.out.println(" Executing on FireFox");
				String Node = "http://172.16.123.130:5554/wd/hub";
				DesiredCapabilities cap = DesiredCapabilities.firefox();
				cap.setBrowserName("firefox");
				driver = new RemoteWebDriver(new URL(Node), cap);
				loadData();
				getUrl(OR.getProperty("url"));
			} else if (browser.equalsIgnoreCase("ie")) {
				System.out.println(" Executing on IE");
				DesiredCapabilities cap = DesiredCapabilities.chrome();
				cap.setBrowserName("ie");
				String Node = "http://192.168.0.101:5555/wd/hub";
				driver = new RemoteWebDriver(new URL(Node), cap);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				// Launch website
				getUrl(OR.getProperty("url"));
			} else {
				throw new IllegalArgumentException("The Browser Type is Undefined");
			}
		}
	}

}
