package mi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Redmi {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://event.mi.com/in/mi4anniversary2018/mi-4-you");
		WebDriverWait wait = new WebDriverWait(driver, 500000);
		// ((//div[@id='J_listGroup']//img)[4]/following::div//a)[1]
		
		WebElement phone = driver.findElementByXPath("(((//div[@id='J_listGroup']//img))[5]/following::div//a)[1]");
		driver.executeScript("scroll(0,"+phone.getLocation().getY()+")");
		
		Thread.sleep(2000);
		
		for (int i = 0; i < 3; i++) {
			driver.findElementByXPath("(//div[@class ='next'])[1]").click();
			Thread.sleep(2000);
		}
		phone.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	
	
	}
}
