package merlin;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.ExcelDataProvider;
public class MerlinDownloadCheck {
	//ExcelDataProvider xl ;
	Actions act;
	WebDriverWait wait;
	RemoteWebDriver driver;
	File file = new File("K:\\testData\\"+generateRandomFolderName());
	HashMap<String, Object> prefs;
	@Test



	public void merlin() throws InterruptedException, IOException	{
		/*options	 = new ChromeOptions();
		prefs = new HashMap<String, Object>();	
		prefs.put("download.default_directory", file.toString()); 
		prefs.put("safebrowsing.enabled", "false"); 
		options.setExperimentalOption("prefs", prefs); 
		options.addArguments("--disable-extensions"); 
		//driver = new ChromeDriver(options); 		
		 */

		String downloadFilepath = "D:\\testData\\"+generateRandomFolderName();
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);

		cap = new DesiredCapabilities(options);
		cap.setBrowserName("chrome");
		cap.setVersion("ANY");
		cap.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(
				new URL("http://localhost:4421/wd/hub"), cap);

		String[] hubDetails = getHostNameAndPort(driver.getSessionId().toString());
		
		for (String hubInfo : hubDetails) {
			System.out.println(hubInfo);
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("http://reference1.mapinfo.com/software/anysite/english_AU/tutorials/Sample-Sales-Data.xlsx");
		Thread.sleep(10000);
		driver.close();
		availabelFiles(file);
	}

	private static String[] getHostNameAndPort(String session) {
		String[] hostAndPort = new String[2];
		String errorMsg = "Failed to acquire remote webdriver node and port info. Root cause: ";

		try {
			HttpHost host = new HttpHost("localhost", 4421);
			DefaultHttpClient client = new DefaultHttpClient();
			URL sessionURL = new URL("http://localhost:4421/grid/api/testsession?session=" + session);
			BasicHttpEntityEnclosingRequest r = new BasicHttpEntityEnclosingRequest("POST", sessionURL.toExternalForm());
			HttpResponse response = client.execute(host, r);
			JSONObject object = extractObject(response);
			URL myURL = new URL(object.getString("proxyId"));
			if ((myURL.getHost() != null) && (myURL.getPort() != -1)) {
				hostAndPort[0] = myURL.getHost();
				hostAndPort[1] = Integer.toString(myURL.getPort());
			}
		} catch (Exception e) {
			e.printStackTrace();
			//logger.log(Level.SEVERE, errorMsg, e);
			throw new RuntimeException(errorMsg, e);
		}
		return hostAndPort;
	}

	private static JSONObject extractObject(HttpResponse resp) throws IOException, JSONException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(resp.getEntity().getContent()));
		StringBuffer s = new StringBuffer();
		String line;
		while ((line = rd.readLine()) != null) {
			s.append(line);
		}
		rd.close();
		JSONObject objToReturn = new JSONObject(s.toString());
		return objToReturn;
	}

	// Verify downloaded data and delete the files along with folder
	public void availabelFiles(File dir) throws IOException {
		//System.out.println(dir.exists());
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

