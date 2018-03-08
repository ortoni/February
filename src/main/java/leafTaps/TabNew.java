package leafTaps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TabNew {
	@Test
	public void newtab() throws AWTException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://google.com");
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_T);
		Set<String> allWinHandles = driver.getWindowHandles();
		List<String> allWin = new ArrayList<String>();
		allWin.addAll(allWinHandles);
		String win = allWin.get(1);		
		driver.switchTo().window(win);		
		driver.get("https://google.com");

	}	

}
