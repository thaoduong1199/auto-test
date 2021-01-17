package factory;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pageFactory.selectInSearchPage;

public abstract class selectFactory {
	protected WebDriver driver;
	protected serviceFactory objService = new serviceFactory(driver);
	protected selectInSearchPage objSearchPage = new selectInSearchPage(driver);

	public final String FILEPATH = "D:\\FptVN.xlsx";
	public final String SHEET = "SelectTest";

	public final int EXPECTED_COL = 6;
	public final int RESULT_COL = 8;
	@BeforeClass
	public void setUpDriver() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://fptplay.vn/dang-nhap?reqPage=%2F");
		objSearchPage = new selectInSearchPage(driver);
		objService = new serviceFactory(driver);

		ExcelUtils.setExcelFile(FILEPATH, SHEET);

		objSearchPage.clickIconSearch();
		objService.waitForElementToClickable(objSearchPage.getSearchField());
		objSearchPage.inputValue();

	}

	@AfterClass
	public void quitDriver() {
		driver.quit();
	}

	public void assertURL(int i) throws Exception {

		
		if (driver.getCurrentUrl().equals(ExcelUtils.getCellData(i, EXPECTED_COL))) {
			ExcelUtils.setCellData(i, RESULT_COL, "Success");
			ExcelUtils.closeandsaveFile(FILEPATH);
		}
		else {
			ExcelUtils.setCellData(i, RESULT_COL, "Failed");
			ExcelUtils.closeandsaveFile(FILEPATH);
		}
		assertEquals(driver.getCurrentUrl(), ExcelUtils.getCellData(i, EXPECTED_COL));
	}

}
