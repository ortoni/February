package alert;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		WebElement xpa = driver.findElementByXPath("//button[text()='Try it']");

		String name = "koushik";
/*		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().sendKeys(name);
		driver.switchTo().alert().accept();
*/		
		
		
		
		
		
		
		// Switch to alert
		Alert alert = driver.switchTo().alert();
		// Get Alert Text
		alert.getText();
		// Send text
		alert.sendKeys(name);
		// Accept alert
		alert.accept();
		// Verification
		String actualText = driver.findElementById("demo").getText();
		Select sel = new Select(xpa);
		
		
	}
}








