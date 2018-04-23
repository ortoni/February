package projectDayTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MonsterSendMail {
	RemoteWebDriver driver ;
	@Test
	public void sendMail() throws InterruptedException {
		/*System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		driver = new FirefoxDriver();*/
	//	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://recruiter.monsterindia.com/");

		driver.manage().addCookie(new Cookie("C", "AseVloSWbeP86G7Ee0cMWbpLGNDHxzCZ730818fb9a02beeefc4531dac636ed1e"));
		driver.get("http://recruiter.monsterindia.com/v2/foldermanagement/index.html?folderID=22141480&prev=1&n=1");

	//	for (int i = 1; i <=51; i++) {
		//try {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='chksmall chkicon'])[1]"))).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Send Email"))).click();
		WebElement element = driver.findElement(By.xpath("//div[@class='dropdown_smaller_wrapper  open_singleselect']"));
		/*JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);*/
		driver.executeScript("arguments[1].click();", element);
		/*driver.findElementById("frmfromemail").clear();
		driver.findElementById("frmfromemail").sendKeys("maria@testleaf.com");
		driver.findElementById("frmsubemail").clear();
		driver.findElementById("frmsubemail").sendKeys("Most Demanding Selenium Courses starting this weekend. Rush !!");
		driver.findElementById("frmmailbody").clear();
		driver.findElementById("frmmailbody").sendKeys("Here is the golden opportunity to upskill Selenium, Cucumber, Webservices and change your career with the best salary. We have successful assisted more than 4000+ participants to achieve this feat. Are you ready to experience the success with loads of technical learning with fun?Come, Learn and Celebrate with TestLeaf.What is so special about TestLeaf?1300+ google reviews from across the globe.Extra Ordinary coaches, mentors and trainers at one place.Great human touch on each learning.Awesome post training support.Looking forward to begin larger success stories in web services with you.Best Regards,TestLeaf Team.");
		
		driver.findElementByXPath("//input[@value='Send']").click();
		Thread.sleep(5000);*/
		//} catch (WebDriverException e) {

		//	}
		//}


	}






}
