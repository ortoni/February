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

import wdMethods.ProjectMethods;

public class UsingFaker extends ProjectMethods {
	Faker faker ;
	String companyName;
	String firstName;
	String lastName;
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
		//faker.internet().emailAddress();


		/*for (int i = 0; i <10; i++) {
			GameOfThrones gameOfThrones = faker.gameOfThrones();
			String character = gameOfThrones.character();
			System.out.println(character);
		}*/
	}

	@Test(invocationCount = 3)
	public void test() {
		generateTestData();
		type(locateElement("createLeadForm_companyName"), companyName);
		type(locateElement("createLeadForm_firstName"), firstName);
		type(locateElement("createLeadForm_lastName"), lastName);
		click(locateElement("class", "smallSubmit"));

	}

}
