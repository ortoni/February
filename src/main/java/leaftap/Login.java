package leaftap;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown =  new Select(src);
		
		List<WebElement> options = dropdown.getOptions();
		int size = options.size();
		System.out.println(size);
		//dropdown.selectByVisibleText("Conference");
		//dropdown.selectByValue("LEAD_DIRECTMAIL");
	dropdown.selectByIndex(size -1);
	
	//driver.f
	
		

	}

}
