package allureReports;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;

public class AllureRe {
    @Test
    @Epic("Smoke")
    @Description("Some detailed test description")
    public void testSomething2() throws Exception {
       System.out.println("Description");
    }

}

