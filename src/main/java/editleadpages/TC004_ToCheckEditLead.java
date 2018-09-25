/*package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_ToCheckEditLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="TC004_ToCheckEditLead";
		testDescription="login to LeafTaps And EditLead";
		testNodes="Leads";
		category="Smoke";
		authors="RajeshKumar";
		browserName="chrome";
		dataSheetName="TC004";
	}




	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String CompanyName,String FirstName,String LastName,String updateLeadForm_companyName) {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickcrmSfaLink()
		.clickLeadsLink()
		.clickFindLeadsLink()
		.clickfindsLeadsButton()
		.clickfirstLeadId()
	}




}
*/