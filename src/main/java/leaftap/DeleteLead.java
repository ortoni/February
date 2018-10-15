package leaftap;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DeleteLead extends ProjectSpecificMethods{
	@Test()
	public void delete() {
		driver.findElementByLinkText("Create Lead").click();

		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown = new Select(src);

		List<WebElement> options = dropdown.getOptions();

		int size = options.size();
		System.out.println(size);
		
	}

}
