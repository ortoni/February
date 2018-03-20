package others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Cinepolis {
	@Test
	public void dev() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions cp = new ChromeOptions();
		cp.addArguments("--ash-touch-hud");
		ChromeDriver driver = new ChromeDriver(cp);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.cinepolisindia.com/");
		WebElement location = driver.findElementById("ddlCinemasGeo");
		new Select(location).selectByVisibleText("Cinépolis Ahmedabad One Mall");
		driver.findElementByXPath("//*[@class='btn btn--submit']").click();
		WebElement changeCinema = driver.findElementById("ddlCinemaFront");
		new Select(changeCinema).selectByVisibleText("CinemaStar High Street Mall  Thane");
		
	}
}
