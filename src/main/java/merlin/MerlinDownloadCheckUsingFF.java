package merlin;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.ExcelDataProvider;
public class MerlinDownloadCheckUsingFF {
	Actions act;
	WebDriverWait wait;
	RemoteWebDriver driver;
	ChromeOptions options;
	File file = new File("K:\\testData\\"+generateRandomFolderName());
	@Test
	public void merlin() throws InterruptedException, IOException	{
		//file.createNewFile();
		FirefoxProfile profile = new FirefoxProfile();		
		profile.setPreference("browser.download.dir",file.toString());
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.manager.skipWinSecurityPolicyChecks", false);
		profile.setPreference("browser.download.manager.useWindow", false);
		profile.setPreference("browser.download.hide_plugins_without_extensions", true);
		profile.setPreference("pdfjs.disabled", true);
		profile.setPreference("pdfjs.enableWebGL", false);
		profile.setPreference("pdfjs.enabIedCache.initialized", true);
		profile.setPreference("pdfjs.enabIedCache.state", false);	
		profile.setPreference("pdfjs.previousHandler.alwaysAskBeforeHandling", true);
		profile.setPreference("pdfjs.renderer", false);
		profile.setPreference("pdfjs.enabledCache.initialized", true);
		profile.setPreference("pdfjs.enabledCache.state", false);		
		profile.setPreference("browser.download.useToolkitUI",false);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain,application/octet-stream,application/pdf,"
				+ "application/x-pdf,application/vnd.pdf,"
				+ "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, "
				+ "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		profile.setPreference("browser.helperApps.neverAsk.openFile","text/plain,application/octet-stream,application/pdf,application/x-pdf,application/vnd.pdf,"
				+ "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, "
				+ "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
		profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		// System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		FirefoxOptions profile1 = options.setProfile(profile);
		FirefoxDriver driver = new FirefoxDriver(profile1);	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://reference1.mapinfo.com/software/anysite/english_AU/tutorials/Sample-Sales-Data.xlsx");
		Thread.sleep(3000);
		driver.close();
		availabelFiles(file);
	}
	
	// Verify downloaded data and delete the files along with folder
	public void availabelFiles(File dir) throws IOException {
		File[] files = dir.listFiles();
		System.out.println("Total no.of Files "+files.length+" in the directory: "+dir.getAbsolutePath());
		String[] list = dir.list();
		for (String fileNames : list) {
			if (fileNames.endsWith(".xlsx") /*|| fileNames.endsWith(".xls")*/) {
				System.out.println("Reading files from file: "+fileNames);
				ExcelDataProvider.getData(file.toString()+"/"+fileNames);
			}	
			for (File file : files) {
				System.out.println("Deleting File ... : "+file.toString());
				file.delete();
				System.out.println("Is "+fileNames+" exists ? "+file.exists());
			}
		}System.out.println("The directory name is: "+dir.getName() + 
				"and the location is "+dir.getAbsolutePath()+
				"and after verifying value dir is deleted");
		dir.delete();



		// To check sub folders - not required for this scenario
		/*for (File file : files) {
			if (file.isDirectory()) {
				System.out.println("directory:" + file.getAbsolutePath());
				availabelFiles(file);
			} else {
				System.out.println("\t file:" + file.getName());
			}
		 */
	}

	// To generate a Random folder name (number)
	public String generateRandomFolderName() {
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L; 
		String folderName = Long.toString(number);
		return  folderName;
	}


}

