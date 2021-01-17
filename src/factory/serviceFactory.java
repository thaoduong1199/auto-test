package factory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class serviceFactory {
	WebDriver driver;
	//webdriver
	public serviceFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//element
	public void waitForElementPresented(WebElement elements) {
		WebDriverWait wait = new WebDriverWait(this.driver,100);
		wait.until(ExpectedConditions.visibilityOf(elements));
	}
	//clickable
	public void waitForElementToClickable(WebElement elements) {
		WebDriverWait wait = new WebDriverWait(this.driver,100);
		wait.until(ExpectedConditions.elementToBeClickable(elements));
	}
	
	//Select element
	public void slSelectTest(WebElement listElements, WebElement elementName) {
		Select lE = new Select(listElements);
		List<WebElement> childElements = listElements.findElements(By.tagName("option"));
		String eleN = elementName.getAttribute("Value");
		for (int i = 0; i < childElements.size(); i++) {
			if (childElements.get(i).getAttribute("Value").equals(eleN)) {
				if (!lE.getFirstSelectedOption().getAttribute("Value").equals(eleN)) {
					lE.selectByIndex(i);
				} 

			}

		}

	}

}
