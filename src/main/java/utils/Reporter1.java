package utils;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentXReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;


public abstract class Reporter1 {
	//public ExtentXReporter extentxReporter = new ExtentXReporter("");

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public ExtentTest test;
	public String testCaseName, testDescription, category, authors;


	public abstract long takeSnap();

	public ExtentReports startResult(){
		htmlReporter = new ExtentHtmlReporter(new File("./reports/result.html"));
		htmlReporter.setAppendExisting(true);
		extent = new ExtentReports ();
	//	extentxReporter.setAppendExisting(true);
		extent.attachReporter(htmlReporter);
		// Optional - Instead of using method config using hardcore values
		htmlReporter.config().setDocumentTitle("LeafgTap");
		htmlReporter.config().setReportName("First Test");
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
		extent.setSystemInfo("Host Name", "TetLeaf");
		extent.setSystemInfo("Environment", "Extent Report #3");
		extent.setSystemInfo("User Name", "Koushik Chatterjee");

		return extent;
	}

	// Method declared but not used 

	public void config(String title, String reportName, String theme, String chartLocation){
		htmlReporter.config().setDocumentTitle(title);
		htmlReporter.config().setReportName(reportName);
		if(chartLocation.equalsIgnoreCase("top")){			
			htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		}if(chartLocation.equalsIgnoreCase("bottom")){			
			htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
		}
		if(theme.equalsIgnoreCase("dark")){			
			htmlReporter.config().setTheme(Theme.DARK);
		}if(theme.equalsIgnoreCase("standard")){			
			htmlReporter.config().setTheme(Theme.STANDARD);
		}

	}

	public void reportStep(String desc, String status, boolean bSnap){
		{

			if(bSnap && !status.equalsIgnoreCase("INFO")){

				long snapNumber = 100000l;

				try {
					snapNumber= takeSnap();
				} catch (Exception e) {
					e.printStackTrace();
				}

				if(status.equalsIgnoreCase("PASS")){
					try {
						test.pass(desc).addScreencastFromPath("./../reports/images/"+snapNumber+".mp4");
					} catch (IOException e1) {
					}
				}if(status.equalsIgnoreCase("FAIL")){
					try {
						test.pass(desc).addScreencastFromPath("./../reports/images/"+snapNumber+".mp4");

					} catch (IOException e1) {
					}	

				}if(status.equalsIgnoreCase("WARNING")){
			try {
					test.pass(desc).addScreencastFromPath("./../reports/images/"+snapNumber+".mp4");

					} catch (IOException e1) {
					}
				}if(status.equalsIgnoreCase("INFO")){
					try {
						test.info(desc, MediaEntityBuilder.createScreenCaptureFromPath
								("./../reports/images/"+snapNumber+".mp4").build());
					} catch (IOException e1) {
					}								
				}
			}
		}

	}
	public void reportStep(String desc, String status){
		reportStep(desc, status, true);
	}

	public ExtentTest startTestCase(String testCaseName, String testDescription){
		test = extent.createTest(testCaseName, testDescription);
		return test;
	}

	public void entTestCase(){
		extent.removeTest(test);		
	}

	public void endResult(){		
		extent.flush();
	}

}

