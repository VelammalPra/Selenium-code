package week8.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//to create physical html report
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./ExtentReports/result.html");
		//to maintain history
		reporter.setAppendExisting(true);
		//to get actual report
		ExtentReports extent = new ExtentReports();
		//to integrate physical file to actual report
		extent.attachReporter(reporter);
		//to create test case with test case details
		ExtentTest testcase1 = extent.createTest("LoginAndLogout" , "LeafTaps Login and Logout");
		testcase1.assignAuthor("Hari");
		testcase1.assignCategory("SmokeTest");
		
		//step level status
		testcase1.pass("Username demosalesmanager entered successfully", MediaEntityBuilder.createScreenCaptureFromPath(".././snapshot/leafgroundopenhomepage.png").build());
		testcase1.pass("Password crmsfa entered successfully", MediaEntityBuilder.createScreenCaptureFromPath(".././snapshot/leafgroundopenhomepage.png").build());
		
		//to have all the information in the report
		extent.flush();
	}

		
	}


