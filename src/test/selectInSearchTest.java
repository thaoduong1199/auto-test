package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import factory.selectFactory;

public class selectInSearchTest extends selectFactory {
	@Test(priority = 2)
	public void all() throws Exception {
		objService.waitForElementToClickable(objSearchPage.getListElements());
		Thread.sleep(3000);
		objSearchPage.clickSelectCountry();
		objService.slSelectTest(objSearchPage.getListElements(), objSearchPage.getAllCountry());
		Thread.sleep(3000);
		objSearchPage.inputValue();
		Thread.sleep(3000);
		assertEquals(objSearchPage.getAllCountry().isSelected(), true);
		assertURL(2);
	}

	@Test(priority = 1)
	public void vietnam() throws Exception {
		objService.waitForElementToClickable(objSearchPage.getListElements());
		Thread.sleep(3000);
		objSearchPage.clickSelectCountry();
		objService.slSelectTest(objSearchPage.getListElements(), objSearchPage.getVietNam());
		Thread.sleep(3000);
		objSearchPage.inputValue();
		Thread.sleep(3000);
		assertEquals(objSearchPage.getVietNam().isSelected(), true);
		assertURL(1);
	}

	@Test(priority = 3)
	public void japan() throws Exception {
		objService.waitForElementToClickable(objSearchPage.getListElements());
		Thread.sleep(3000);
		objSearchPage.clickSelectCountry();
		objService.slSelectTest(objSearchPage.getListElements(), objSearchPage.getJapan());
		Thread.sleep(3000);
		objSearchPage.inputValue();
		Thread.sleep(3000);
		assertEquals(objSearchPage.getJapan().isSelected(), true);
		assertURL(3);
	}

	@Test(priority = 4)
	public void china() throws Exception {
		objService.waitForElementToClickable(objSearchPage.getListElements());
		Thread.sleep(3000);
		objSearchPage.clickSelectCountry();
		objService.slSelectTest(objSearchPage.getListElements(), objSearchPage.getChina());
		Thread.sleep(3000);
		objSearchPage.inputValue();
		Thread.sleep(3000);
		assertEquals(objSearchPage.getChina().isSelected(), true);
		assertURL(4);
	}

	@Test(priority = 5)
	public void usa() throws Exception {
		objService.waitForElementToClickable(objSearchPage.getListElements());
		Thread.sleep(3000);
		objSearchPage.clickSelectCountry();
		objService.slSelectTest(objSearchPage.getListElements(), objSearchPage.getUSA());
		Thread.sleep(3000);
		objSearchPage.inputValue();
		Thread.sleep(3000);
		assertEquals(objSearchPage.getUSA().isSelected(), true);
		assertURL(8);
	}

	@Test(priority = 6)
	public void korea() throws Exception {
		objService.waitForElementToClickable(objSearchPage.getListElements());
		Thread.sleep(3000);
		objSearchPage.clickSelectCountry();
		objService.slSelectTest(objSearchPage.getListElements(), objSearchPage.getKorea());
		Thread.sleep(3000);
		objSearchPage.inputValue();
		Thread.sleep(3000);
		assertEquals(objSearchPage.getKorea().isSelected(), true);
		assertURL(5);
	}

	@Test(priority = 7)
	public void thailand() throws Exception {
		objService.waitForElementToClickable(objSearchPage.getListElements());
		Thread.sleep(3000);
		objSearchPage.clickSelectCountry();
		objService.slSelectTest(objSearchPage.getListElements(), objSearchPage.getThailand());
		Thread.sleep(3000);
		objSearchPage.inputValue();
		Thread.sleep(3000);
		assertEquals(objSearchPage.getThailand().isSelected(), true);
		assertURL(6);
	}

	@Test(priority = 8)
	public void hongkong() throws Exception {
		objService.waitForElementToClickable(objSearchPage.getListElements());
		Thread.sleep(3000);
		objSearchPage.clickSelectCountry();
		objService.slSelectTest(objSearchPage.getListElements(), objSearchPage.getHongKong());
		Thread.sleep(3000);
		objSearchPage.inputValue();
		Thread.sleep(3000);
		assertEquals(objSearchPage.getHongKong().isSelected(), true);
		assertURL(9);
	}

	@Test(priority = 9)
	public void india() throws Exception {
		objService.waitForElementToClickable(objSearchPage.getListElements());
		Thread.sleep(3000);
		objSearchPage.clickSelectCountry();
		objService.slSelectTest(objSearchPage.getListElements(), objSearchPage.getIndia());
		Thread.sleep(3000);
		objSearchPage.inputValue();
		Thread.sleep(3000);
		assertEquals(objSearchPage.getIndia().isSelected(), true);
		assertURL(7);
	}

	@Test(priority = 10)
	public void other() throws Exception {
		objService.waitForElementPresented(objSearchPage.getListElements());
		Thread.sleep(3000);
		objSearchPage.clickSelectCountry();
		objService.slSelectTest(objSearchPage.getListElements(), objSearchPage.getOthers());
		Thread.sleep(3000);
		objSearchPage.inputValue();
		Thread.sleep(3000);
		assertEquals(objSearchPage.getOthers().isSelected(), true);
		assertURL(10);
	}

}
