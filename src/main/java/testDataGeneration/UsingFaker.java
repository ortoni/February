package testDataGeneration;

import java.util.Locale;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import wdMethods.ProjectMethods;

public class UsingFaker extends ProjectMethods {
	Faker faker ;
	String companyName;
	String firstName;
	String lastName;
	//@BeforeMethod
	@BeforeMethod
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
	
	@Test(invocationCount = 2)
	public void test() {
		generateTestData();
		type(locateElement("createLeadForm_companyName"), companyName);
		type(locateElement("createLeadForm_firstName"), firstName);
		type(locateElement("createLeadForm_lastName"), lastName);
		click(locateElement("class", "smallSubmit"));

	}

}
