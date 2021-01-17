package factory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pageFactory.downloadAndUploadPage;

public class downloadAndUploadFactory {
	public final String EXCELPATH = "D:\\FptVN.xlsx";
	public final String SHEET = "DAU";
	protected WebDriver driver;
	protected serviceFactory objservice = new serviceFactory(driver);
	protected downloadAndUploadPage objdAU = new downloadAndUploadPage(driver);

	@BeforeClass
	public void settup() throws Exception {
		ExcelUtils.setExcelFile(EXCELPATH, SHEET);
		ChromeOptions options = new ChromeOptions();
		Map<String, Boolean> chromePrefs = new HashMap<String, Boolean>();
		chromePrefs.put("download.prompt_for_download", true);
		options.setExperimentalOption("prefs", chromePrefs);
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.tutdepot.com/demos/php_file_upload.php");
	}

	@BeforeMethod()
	public void settupobj() {
		objservice = new serviceFactory(driver);
		objdAU = new downloadAndUploadPage(driver);
	}


	public static void uploadfile(final String fileName) throws AWTException, InterruptedException {
		final StringSelection ss = new StringSelection(fileName);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		final Robot rb = new Robot();
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.delay(500);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void downloadFile(final String fileName) throws AWTException, InterruptedException {
		final StringSelection ss = new StringSelection(fileName);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		final Robot rb = new Robot();
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.delay(500);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_LEFT);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_LEFT);
		
	}
	@AfterClass
	public void quit() {
		driver.quit();
	}
}
