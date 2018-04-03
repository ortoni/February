package utils;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;


public abstract class ExtReportThree2Markup {

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public ExtentTest test;
	public String testCaseName, testDescription, category, authors;


	public abstract long takeSnap();

	public ExtentReports startResult(){

		htmlReporter = new ExtentHtmlReporter("./reports/result.html");
		htmlReporter.setAppendExisting(true);
		extent = new ExtentReports ();
		extent.attachReporter(htmlReporter);
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);

		return extent;
	}

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
						test.log(Status.PASS, MarkupHelper.createLabel
								(desc+test.addScreenCaptureFromPath
										("./../reports/images/"+snapNumber+".jpg"), ExtentColor.GREEN));

					} catch (IOException e1) {
					}
				}if(status.equalsIgnoreCase("FAIL")){
					try {
						test.log(Status.FAIL, MarkupHelper.createLabel
								(desc+test.addScreenCaptureFromPath
										("./../reports/images/"+snapNumber+".jpg"), ExtentColor.RED));
					} catch (IOException e1) {
					}	

				}if(status.equalsIgnoreCase("WARNING")){
					try {
						test.log(Status.WARNING, MarkupHelper.createLabel
								(desc+test.addScreenCaptureFromPath
										("./../reports/images/"+snapNumber+".jpg"), ExtentColor.PURPLE));
					} catch (IOException e1) {
					}
				}if(status.equalsIgnoreCase("INFO")){
					try {
						test.log(Status.PASS, MarkupHelper.createLabel
								(desc+test.addScreenCaptureFromPath
										("./../reports/images/"+snapNumber+".jpg"), ExtentColor.TEAL));
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

