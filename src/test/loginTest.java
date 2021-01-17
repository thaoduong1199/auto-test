package test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.testng.annotations.Test;

import factory.ExcelUtils;
import factory.baseFactory;
import factory.loginFactory;
import factory.serviceFactory;
import pageFactory.loginPage;

public class loginTest extends loginFactory {

	public final String FILEPATH = "D:\\Test11\\FptVN.xlsx";
	public final String SHEET = "LoginTest";

	// Row và col trong EXEL
	public final int ROW = 11;
	public final int COL = 9;
	public final int RESULT_COL = 8;
	public final int EXPECTED_COL = 6;
	public final int PHONE_COL = 3;
	public final int PASSWORD_COL = 4;
	public final int SUCCESS_DATA_ROW = 9;

	// Url
	public final String homeURL = "https://fptplay.vn/";
	public final String loginURL = "https://fptplay.vn/dang-nhap?reqPage=%2F";

	// Khai báo
	public String phone;
	public String password;

	@Test(priority = 2)
	public void verifyLog() throws Exception {

		// Set file Excel
		ExcelUtils.setExcelFile(FILEPATH, SHEET);

		// Thực hiện các bước theo manual
		objService.waitForElementToClickable(objLogin.getLoginLinkText());
		objLogin.goLogin();

		objService.waitForElementToClickable(objLogin.getBtnLogin());
		// Lấy dữ liệu exel
		phone = ExcelUtils.getCellData(SUCCESS_DATA_ROW, PHONE_COL);
		password = ExcelUtils.getCellData(SUCCESS_DATA_ROW, PASSWORD_COL);
		// Đăng nhập
		objLogin.login(phone, password);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(5000);

	}

	@Test(priority = 1)
	public void verifyLoginFailed1() throws Exception {

		// Set Excel File
		ExcelUtils.setExcelFile(FILEPATH, SHEET);
		ExcelUtils.setrowcolumn(ROW, COL);
		// Di chuyển trang đăng nhập
		objService.waitForElementToClickable(objLogin.getLoginLinkText());
		objLogin.goLogin();

		for (int i = 1; i < ExcelUtils.getrow() - 2; i++) {
			// Truyền dữ liệu đăng nhập
			phone = ExcelUtils.getCellData(i, PHONE_COL);
//			phone = "0375043862";
//			password = "012345";
			password = ExcelUtils.getCellData(i, PASSWORD_COL);
			objService.waitForElementToClickable(objLogin.getBtnLogin());
			objLogin.login(phone, password);

			objService.waitForElementToClickable(objLogin.getBtnRetry());

		}

	}
}
