package others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TheRoxyCinemas {
	@Test
	public void dev() throws InterruptedException {	
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;
		import org.testng.annotations.Test;
		import wdMethods.ProjectMethods;

		public class RoxyCinemas extends ProjectMethods {
			
			@Test
			public void roxycinemas() throws InterruptedException {
				
				
				WebElement movie1 = locateElement("xpath", "(//section[@class='rc-moviethumb'])[1]");
				
				Actions builder = new Actions(driver);
				
				Thread.sleep(3000);
				
				builder.moveToElement(movie1).perform();
			
				
				WebDriverWait wait = new WebDriverWait(driver, 20);
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[@class='btn-movie-icon'])[1]")));
				
				Thread.sleep(3000);
				
				WebElement booknow = locateElement("xpath","(//i[@class='btn-movie-icon'])[1]" );
				
				builder.click(booknow).perform();
		


	}
}
