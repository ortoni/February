package leafTaps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricket {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://www.google.co.in");
		d.findElementById("lst-ib").sendKeys("cricket", Keys.ENTER);
		Thread.sleep(5000);
		String cr = d.getPageSource();
		System.out.println(cr);

		String pattern = "\\w+";

		// Compile the pattern
		Pattern p = Pattern.compile(pattern);

		// Get the matcher
		Matcher match = p.matcher(cr);		

		// if multiple matches
		if (match.find()) {
				System.out.println(match.group().contains("cricket"));
			System.out.println(match.group());            
		}
		/*// Make a URL to the web page
		URL url = new URL("http://stackoverflow.com/questions/6159118/using-java-to-pull-data-from-a-webpage"); 
		// Get the input stream through URL Connection
		URLConnection con = url.openConnection();
		InputStream is =con.getInputStream(); 
		// Once you have the Input Stream, it's just plain old Java IO stuff.
		// For this case, since you are interested in getting plain-text web page
		// I'll use a reader and output the text content to System.out.
		// For binary content, it's better to directly read the bytes from stream and write
		// to the target file.
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String line = null; 
		// read each line and write to System.out
		while ((line = br.readLine()) != null) {
			System.out.println(line); }*/
	}	



}
