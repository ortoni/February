package interviewPre;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LearnPropertyFile {
	public static void main(String[] args) throws IOException, IOException {
	Properties prop = new Properties();
	prop.load(new FileInputStream("./French.properties"));
    String uname = prop.getProperty("LoginPage.username.id");
	System.out.println(uname);
	
	
	}

}







