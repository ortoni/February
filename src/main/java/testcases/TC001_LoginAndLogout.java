package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_LoginAndLogout extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_LoginAndLogout";
		testDescription="login to LeafTaps And Logout1";
		testNodes="Leads";
		category="Smoke";
		authors="Gopi";
		browserName="chrome";
		dataSheetName="TC001";
	}
	//@Test(dataProvider="fetchData")
	@Test
	public void loginAndLogout(/*String uName,String pwd,String vName*/) {
		
		new LoginPage(driver, test)
		.enterUserName("DemoSalesManager")
		.enterPassword("crmsfa")
		.clickLogIn()
		.verifyLoggedName("")
		.clickLogOut();			
	}

}
