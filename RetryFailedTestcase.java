package week6.day1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestcase implements IRetryAnalyzer {
		
		int maxCount = 3;//max retry count
		
		int retryCount = 0;//initiating the count as 0 initially

		
		public boolean retry(ITestResult result) {
			
			if(!result.isSuccess() && retryCount < maxCount) {
				
				retryCount++;
				return true;
			}
			
			return false;
		}


}
