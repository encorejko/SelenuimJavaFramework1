package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.ITest;

public class TestNGListeners implements ITestListener, ISuiteListener {

	public void onFinish(ITestContext context) {
		System.out.println("****** Tests Completed : " + context.getName());
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("****** Test failed : " + result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("****** Test Skipped : " + result.getName());
		
	}

	public void onTestStart(ITestResult result) {
		System.out.println("****** Test Started : " + result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("****** Test is Sucessful : " + result.getName());
		
	}

	public void onFinish(ISuite arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub
		
	}

}
