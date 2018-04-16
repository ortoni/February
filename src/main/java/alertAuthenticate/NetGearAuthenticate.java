package alertAuthenticate;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class NetGearAuthenticate {
	public static void main(String[] args) throws IOException {

		InternetExplorerOptions op = new InternetExplorerOptions();
		//op.setUnhandledPromptBehaviour(true);
		InternetExplorerDriver driver = new InternetExplorerDriver(op);
		//	driver.get("http://madmin:Micr0.com@merlin.rheincs.net");		
		driver.get("http://admin:password@192.168.1.1");


		//driver.get("http://seleniumhq.org/");
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snap/i.jpg");
		FileUtils.copyFile(src, des);


	}
}