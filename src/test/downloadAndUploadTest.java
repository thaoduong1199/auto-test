package test;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import factory.ExcelUtils;
import factory.downloadAndUploadFactory;

public class downloadAndUploadTest extends downloadAndUploadFactory {

	public final String UPLOADFILEPATH = "D:\\uploadAndDownloadDemo\\bg1.jpg";
	public final String DOWNLOADPATH = "D:\\uploadAndDownloadDemo\\DownloadFile\\";

	public final int RESULT_COL = 8;

	@Test(priority = 1)
	public void upload() throws Exception {
		objservice.waitForElementToClickable(objdAU.getDownLoadSelect());
		Actions builder = new Actions(driver);
		builder.moveToElement(objdAU.getUploadElement()).click().build().perform();
		uploadfile(UPLOADFILEPATH);
		Thread.sleep(2000);
		objdAU.clickReplace();
		objdAU.clickUploadButton();

		assertTrue(objdAU.getArlert().isDisplayed());
		if (objdAU.getArlert().isDisplayed()) {
			ExcelUtils.setCellData(1, RESULT_COL, "Success");
			ExcelUtils.closeandsaveFile(EXCELPATH);
		} else {
			ExcelUtils.setCellData(1, RESULT_COL, "failed");
			ExcelUtils.closeandsaveFile(EXCELPATH);
		}

	}

	@Test(priority = 2)
	public void downloadItem1() throws Exception {

		objservice.waitForElementPresented(objdAU.getDownLoadSelect());
		objservice.slSelectTest(objdAU.getDownLoadSelect(), objdAU.getItem1());
		String item = objdAU.getItem1().getText();
		objdAU.clickDownloadButton();
		downloadFile(DOWNLOADPATH + item);

		Thread.sleep(5000);
		File f = new File(DOWNLOADPATH + item);
		Assert.assertEquals(f.exists(), true);
		if (f.exists()) {
			ExcelUtils.setCellData(2, RESULT_COL, "Success");
			ExcelUtils.closeandsaveFile(EXCELPATH);
		} else {
			ExcelUtils.setCellData(2, RESULT_COL, "failed");
			ExcelUtils.closeandsaveFile(EXCELPATH);
		}
	}

	@Test(priority = 3)
	public void downloadItem2() throws Exception {

		objservice.waitForElementPresented(objdAU.getDownLoadSelect());
		objservice.slSelectTest(objdAU.getDownLoadSelect(), objdAU.getItem2());
		String item = objdAU.getItem2().getText();
		objdAU.clickDownloadButton();
		downloadFile(DOWNLOADPATH + item);

		Thread.sleep(5000);
		File f = new File(DOWNLOADPATH + item);
		Assert.assertEquals(f.exists(), true);if (f.exists()) {
			ExcelUtils.setCellData(3, RESULT_COL, "Success");
			ExcelUtils.closeandsaveFile(EXCELPATH);
		}else {
			ExcelUtils.setCellData(3, RESULT_COL, "failed");
			ExcelUtils.closeandsaveFile(EXCELPATH);
		}
	}

	@Test(priority = 4)
	public void downloadItem3() throws Exception {

		objservice.waitForElementPresented(objdAU.getDownLoadSelect());
		objservice.slSelectTest(objdAU.getDownLoadSelect(), objdAU.getItem3());
		String item = objdAU.getItem3().getText();
		objdAU.clickDownloadButton();
		downloadFile(DOWNLOADPATH + item);

		Thread.sleep(5000);
		File f = new File(DOWNLOADPATH + item);
		Assert.assertEquals(f.exists(), true);if (f.exists()) {
			ExcelUtils.setCellData(4, RESULT_COL, "Success");
			ExcelUtils.closeandsaveFile(EXCELPATH);
		}else {
			ExcelUtils.setCellData(4, RESULT_COL, "failed");
			ExcelUtils.closeandsaveFile(EXCELPATH);
		}
	}

	@Test(priority = 5)
	public void downloadItem4() throws Exception {

		objservice.waitForElementPresented(objdAU.getDownLoadSelect());
		objservice.slSelectTest(objdAU.getDownLoadSelect(), objdAU.getItem4());
		String item = objdAU.getItem4().getText();
		objdAU.clickDownloadButton();
		downloadFile(DOWNLOADPATH + item);

		Thread.sleep(5000);
		File f = new File(DOWNLOADPATH + item);
		Assert.assertEquals(f.exists(), true);
		if (f.exists()) {
			ExcelUtils.setCellData(5, RESULT_COL, "Success");
			ExcelUtils.closeandsaveFile(EXCELPATH);
		} else {
			ExcelUtils.setCellData(5, RESULT_COL, "failed");
			ExcelUtils.closeandsaveFile(EXCELPATH);
		}
	}

	@Test(priority = 6)
	public void downloadItem5() throws Exception {

		objservice.waitForElementPresented(objdAU.getDownLoadSelect());
		objservice.slSelectTest(objdAU.getDownLoadSelect(), objdAU.getItem5());
		String item = objdAU.getItem5().getText();
		objdAU.clickDownloadButton();
		downloadFile(DOWNLOADPATH + item);

		Thread.sleep(5000);
		File f = new File(DOWNLOADPATH + item);
		Assert.assertEquals(f.exists(), true);if (f.exists()) {
			ExcelUtils.setCellData(6, RESULT_COL, "Success");
			ExcelUtils.closeandsaveFile(EXCELPATH);
		}else {
			ExcelUtils.setCellData(6, RESULT_COL, "failed");
			ExcelUtils.closeandsaveFile(EXCELPATH);
		}
	}
}
