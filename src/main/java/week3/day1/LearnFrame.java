package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/selectable/");
		
		//switching context into the frame
		//WebElement frame = driver.findElementByXPath("//iframe[@class='demo-frame']");
		driver.switchTo().frame(2);
		driver.findElementByXPath("(//ol/li)[1]").click();
		
		//Switching context from frame to default webpage
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Download").click();
		
		
		//switching context to previous frame
		driver.switchTo().parentFrame();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
