package factory;

import org.testng.annotations.BeforeMethod;

import pageFactory.loginPage;

public class loginFactory extends baseFactory {
	protected loginPage objLogin = new loginPage(driver);
	protected serviceFactory objService = new serviceFactory(driver);
	
	
	@BeforeMethod
	public void setUpDriver() {
		objLogin = new loginPage(driver);
		objService = new serviceFactory(driver);
	}
	
}
