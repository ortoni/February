package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Alert.html");
		//finding the button and clicking
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		//Switching context to alert and getting the text
		Alert alert = driver.switchTo().alert();
		// getting text of the alert
		String text = alert.getText();
		System.out.println(text);
		//Accepting Alert
		alert.accept();
			
	}

}
