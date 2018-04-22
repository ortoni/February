package merlin;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MerlinLoginUsingAutoIt {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://Madmin:Micr0.com@merlin.rheincs.net");
		//Runtime.getRuntime().exec("./resources/Auth.exe");
		
		
		

	}
}