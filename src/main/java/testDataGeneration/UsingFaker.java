package testDataGeneration;

import java.util.Locale;
/*<dependency>
<groupId>com.github.javafaker</groupId>
<artifactId>javafaker</artifactId>
<version>0.14</version>
</dependency>*/

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import wdMethods.ProjectMethods;

public class UsingFaker extends ProjectMethods {
	Faker faker ;
	String companyName;
	String firstName;
	String lastName;
	@BeforeMethod(/*description = "This is a test for Allure"*/)
	public void beforeMethod(){
		test = startTestCase("test");
		test.assignCategory("faker");
		test.assignAuthor("koushik");
		startApp("chrome", "http://leaftaps.com/opentaps/control/main");
		type(locateElement("username"), "DemoSalesManager");
		type(locateElement("password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link", "CRM/SFA"));
		click(locateElement("link", "Create Lead"));
	}
	public void generateTestData(){
		faker = new Faker(new Locale("en-IND"));
		companyName = faker.company().industry();
		firstName = faker.name().firstName();
		lastName = faker.name().lastName();
		
	}

	@Test(invocationCount = 3)
	@Epic("Allure examples")
	@Feature("Junit 4 support")
	@Description("Faker using Allure reports")
	public void test() {
		generateTestData();
		type(locateElement("createLeadForm_companyName"), companyName);
		type(locateElement("createLeadForm_firstName"), firstName);
		type(locateElement("createLeadForm_lastName"), lastName);
		click(locateElement("class", "smallSubmit"));

	}

}
