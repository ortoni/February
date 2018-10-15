package projectDayTestCases;

public class C {

	public static void main(String[] args) {
		String a = " ? 552";
		String replaceAll = a.replaceAll("\\D", "");
		System.out.println(replaceAll);
	}
	/*
	 * ChromeDriver driver = new ChromeDriver();
	 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 * driver.manage().window().maximize();
	 * driver.get("http://leafground.com/pages/Link.html"); List<WebElement>
	 * allLinks = driver.findElementsByTagName("a");
	 * System.out.println(allLinks.size());
	 * 
	 * for (WebElement link : allLinks) { System.out.println(link.getText()); } }
	 */

}

/*
 * String a = " ? 552"; System.out.println(a.replaceAll("\\D", ""));
 */