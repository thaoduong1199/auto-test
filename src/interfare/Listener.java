package interfare;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Name of failure test: "+result.getName());
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Name of skipped test: "+result.getName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Name of success test: "+result.getName());
	}
}
