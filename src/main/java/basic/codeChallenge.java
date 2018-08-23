package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class codeChallenge {

	@Test
	public void main() throws InterruptedException {

		// launch the browser
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();

		// Mouse Over on Men
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElementByLinkText("Men")).perform();
		
		Thread.sleep(2000);

		// Click on Jackets
		driver.findElementByXPath("//a[text()='Jackets']").click();

		Thread.sleep(4000);


		// Click on Jackets and confirm the count is same
		driver.findElementByXPath("//label[text()='Jackets']").click();

		// Wait for some time
		Thread.sleep(5000);

		// Find the count of Jackets
		String leftCount = 
				driver.findElementByXPath("//input[@value='Jackets']/following-sibling::span")
				.getText()
				.replaceAll("\\D", "");
		System.out.println("Left count: "+leftCount);

		// Check the count
		String rightCount = 
				driver.findElementByXPath("//h1[text()='Mens Jackets']/following-sibling::span")
				.getText()
				.replaceAll("\\D", "");
		System.out.println("Right count: "+rightCount);

		// If both count matches, say success
		if(leftCount.equals(rightCount)) {
			System.out.println("The count matches on either case");
		}else {
			System.err.println("The count does not match");
		}

		// Click on Offers
		driver.findElementByXPath("//h4[text()='Offers']").click();
		
		Thread.sleep(2000);

		// Find the costliest Jacket
		List<WebElement> productsPrice = driver.findElementsByXPath("//span[@class='product-discountedPrice']");
		List<String> onlyPrice = new ArrayList<String>();

		for (WebElement productPrice : productsPrice) {
			onlyPrice.add(productPrice.getText().replaceAll("\\D", ""));
		}

		// Sort them 
		String max = Collections.max(onlyPrice);

		// Find the top one
		System.out.println("Maximum value: "+max);
		
		

		// Print Only Allen Solly Brand Minimum Price
		driver.findElementByXPath("//input[@value='Allen Solly']/following-sibling::div").click();
		
		Thread.sleep(2000);

		// Find the costliest Jacket
		List<WebElement> allenSollyPrices = driver.findElementsByXPath("//span[@class='product-discountedPrice']");

		onlyPrice = new ArrayList<String>();

		for (WebElement productPrice : allenSollyPrices) {
			onlyPrice.add(productPrice.getText().replaceAll("\\D", ""));
		}

		// Get the minimum Price 
		String min = Collections.min(onlyPrice);

		// Find the lowest priced Allen Solly
		System.out.println("Allen Solly minimum price: "+min);

		driver.close();
	}

}