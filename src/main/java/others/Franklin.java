package others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;


public class Franklin {

	public static void main(String[] args) throws InterruptedException {
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.franklintempleton.com/");
		Thread.sleep(3000);
		driver.findElementByXPath("(//input[@class='form-control'])[3]").sendKeys("FTDZX",Keys.TAB);
		Thread.sleep(3000);
		driver.findElementByXPath("(//span[@class='input-group-btn'])[2]/button").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("Portfolio").click();
		Thread.sleep(3000);
		String text = driver.findElementByXPath("//table[@class='table table-text table-squeeze table-no-bottom-margin']/tbody/tr").getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.findElementByLinkText("Performance").click();
		Thread.sleep(3000);
		String background = driver.findElementByXPath("//a[text()='Month End']").getCssValue("background-color");
		String colour = driver.findElementByXPath("//a[text()='Month End']").getCssValue("color");
		System.out.println(background + colour);
		driver.findElementByLinkText("Distributions").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("View historical data").click();
		Thread.sleep(2000);
		Select year = new Select(driver.findElementById("historical-yr"));
		year.selectByVisibleText("2018");
		Thread.sleep(2000);
		driver.findElementByXPath("(//button[text()='Close']/span)[3]").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("Documents").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//span[text()='Add to Cart']").click();
		Thread.sleep(3000);
		driver.close();


	}

}