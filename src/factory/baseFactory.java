package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class baseFactory {
	protected WebDriver driver;
	
	
	@BeforeClass
	//Setup môi trường cho từng class
	public void beforeClass() {
//		homePage objHome = new homePage(driver);
//		
//		serviceFactory objService = new serviceFactory(driver);
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://fptplay.vn/dang-nhap?reqPage=%2F");
	}
	@AfterClass
	//Táº¯t browser vÃ  driváº» sau khi hoÃ n thÃ nh class
	public void afterClass() {
		// TODO Auto-generated method stub
		driver.quit();
	}

}
