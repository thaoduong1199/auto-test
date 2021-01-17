package pageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectInSearchPage {
	WebDriver driver;
	//Clickable elements
	@FindBy(xpath = "//i[@id='search']")
	WebElement searchIcon;
	
	//input elements
	@FindBy(xpath = "//input[@id='search-key-input']")
	WebElement searchInputField;
	
	// list Elements
	@FindBy(xpath = "//div[@class='select filter-1']/select")
	WebElement selectCountry;
	
	
	//Element select 1
	@FindBy(xpath="//div[@class='select filter-1']/select/option[@value='all']")
	WebElement allCountry;
	@FindBy(xpath="//div[@class='select filter-1']/select/option[@value='Vietnam']")
	WebElement Vietnam;
	@FindBy(xpath="//div[@class='select filter-1']/select/option[@value='Japan']")
	WebElement Japan;
	@FindBy(xpath="//div[@class='select filter-1']/select/option[@value='China']")
	WebElement China;
	@FindBy(xpath="//div[@class='select filter-1']/select/option[@value='USA']")
	WebElement USA;
	@FindBy(xpath="//div[@class='select filter-1']/select/option[@value='Korea']")
	WebElement Korea;
	@FindBy(xpath="//div[@class='select filter-1']/select/option[@value='Thailand']")
	WebElement Thailand;
	@FindBy(xpath="//div[@class='select filter-1']/select/option[@value='HongKong']")
	WebElement HongKong;
	@FindBy(xpath="//div[@class='select filter-1']/select/option[@value='India']")
	WebElement India;
	@FindBy(xpath="//div[@class='select filter-1']/select/option[@value='Others']")
	WebElement Others;
	
	
	public selectInSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//click elements
	public void clickIconSearch() {
		this.searchIcon.click();
	}
	public void clickSelectCountry() {
		this.selectCountry.click();
	}
	
	
	//getElements
	public WebElement getSearchField() {
		return this.searchInputField;
	}
	public WebElement getAllCountry() {
		return this.allCountry;
	}
	public WebElement getVietNam() {
		return this.Vietnam;
	}
	public WebElement getJapan() {
		return this.Japan;
	}
	public WebElement getChina() {
		return this.China;
	}
	public WebElement getUSA() {
		return this.USA;
	}
	public WebElement getKorea() {
		return this.Korea;
	}
	public WebElement getHongKong() {
		return this.HongKong;
	}
	public WebElement getIndia() {
		return this.India;
	}
	public WebElement getThailand() {
		return this.Thailand;
	}
	public WebElement getOthers() {
		return this.Others;
	}
	public WebElement getListElements() {
		return this.selectCountry;
	}
	
	
	
	public void inputValue() {
		this.searchInputField.clear();
		this.searchInputField.sendKeys("Cú đấm");
	}
}
