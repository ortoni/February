package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFrame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		String name = "koushik";
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(name);
		alert.accept();
		String domName = driver.findElementById("demo").getText();
		if(domName.contains(name)) {
			System.out.println("Test case passed");
		}else {
			System.err.println("Test case failed");
		}
		driver.quit();
	}

}
