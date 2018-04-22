package others;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import utils.ExcelDataProvider;

public class DownloadFiles {
	RemoteWebDriver driver;
	
	DesiredCapabilities cap;
	File file = new File("K:\\testData\\"+generateRandomFolderName());
	HashMap<String, Object> prefs;
	@Test
	public void downloadFiles() throws InterruptedException, IOException	{
		/*options.addArguments("--disable-extensions"); //to disable window browser
		prefs = new HashMap<String, Object>();	// put preferences using "prefs" (KeyWord)
		prefs.put("download.default_directory", file.toString()); //To set path
	//	prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("safebrowsing.enabled", "false"); // To disable security check (keep or Cancel)
	//	prefs.put("--disable-extensions", 0);
		//	options.addArguments("plugins.plugins_disabled", "Chrome PDF Viewer"); //to download PDF
		options.setExperimentalOption("prefs", prefs); // Adding preferences to ChromeOptions
		//driver = new ChromeDriver(options);
		*/
		ChromeOptions options =  new ChromeOptions();
		HashMap<String, Object> setPath = new HashMap<String, Object>();	
		setPath.put("download.default_directory", file.toString()); //To set path
		setPath.put("safebrowsing.enabled", "false"); // To disable security check

		HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
		options.setExperimentalOption("prefs", setPath);
		options.addArguments("--disable-extensions"); //to disable browser extension popup
		
		cap = DesiredCapabilities.chrome(); //Adding capabilities
		cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
		cap.setCapability(ChromeOptions.CAPABILITY, options);

		cap.setVersion("ANY");
		cap.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(
				new URL("http://localhost:4421/wd/hub"), cap);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("http://reference1.mapinfo.com/software/anysite/english_AU/tutorials/Sample-Sales-Data.xlsx");
		Thread.sleep(10000);
		availabelFiles(file);
	}


	public void availabelFiles(File dir) throws IOException {
	//	fos = new FileOutputStream(dir);
		//System.out.println(dir.exists());
		//dir.set
		dir.setExecutable(true);
		dir.setReadable(true);
		dir.setWritable(true);
		System.out.println("execute ? "+dir.canExecute()+" Read ? " +dir.canRead()+"Write ?"+ dir.canWrite());

		File[] files = dir.listFiles();

		System.out.println("Total no.of Files "+files.length+" in the directory: "
				+dir.getAbsolutePath());
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
