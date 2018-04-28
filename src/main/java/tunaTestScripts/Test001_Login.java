package tunaTestScripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import tunaPages.Tuna;
import tunaPages.WelcomePage;
import wdMethods.ProjectMethods;

public class Test001_Login extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001TunaLogin";
		testDescription="Loggin to Tuna";
		testNodes="login";
		category="Smoke";
		authors="koushik";
		browserName="chrome";
		//dataSheetName="TC001";
	}
	@Test//(dataProvider="fetchData")
	public void login() {
		new Tuna()
		.enterEmail("admin@tunatap.com")
		.enterPassword("admin")
		.clickSignIn()
		.clickEnviroment();
		
			
	}

}
