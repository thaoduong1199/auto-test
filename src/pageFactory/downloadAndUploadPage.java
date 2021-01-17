package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class downloadAndUploadPage {
	WebDriver driver;
	//khai bao element
	@FindBy(xpath ="//input[@name='upload']" )
	WebElement uploadEle;
	@FindBy(xpath = "//div[@class='alert alert-warning']")
	WebElement uploadSuccessArlet;
	@FindBy(xpath = "//button[@id='Submit']")
	WebElement uploadButton;
	@FindBy(xpath = "//select[@id='file_in_folder']")
	WebElement downloadSelect;
	@FindBy(xpath = "//button[@id='download']")
	WebElement downloadButton;
	@FindBy(xpath = "//input[@id='replace']")
	WebElement relaceCheckBox;
	
	//khai bao item download
	@FindBy(xpath = "//option[@value='bg1.jpg']")
	WebElement item1;
	@FindBy(xpath = "//option[@value='93eYyzoW.jpg']")
	WebElement item2;
	@FindBy(xpath = "//option[@value='icon-ai-advantage.png']")
	WebElement item3;
	@FindBy(xpath = "//option[@value='images.png']")
	WebElement item4;
	@FindBy(xpath = "//option[@value='1-1513742700477.jpg']")
	WebElement item5;
	
	
	public downloadAndUploadPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getUploadArletText() {
		return this.uploadSuccessArlet.getText();
	}
	public void clickUploadButton() {
		this.uploadButton.click();
	}
	public void clickUpload() {
		this.uploadEle.click();
	}
	public void clickDownloadSelect() {
		this.downloadSelect.click();
	}
	public void clickDownloadButton() {
		this.downloadButton.click();
	}
	public void clickReplace() {
		this.relaceCheckBox.click();
	}
	public WebElement getItem1() {
		return this.item1;
	}
	public WebElement getItem2() {
		return this.item2;
	}
	public WebElement getItem3() {
		return this.item3;
	}
	public WebElement getItem4() {
		return this.item4;
	}
	public WebElement getItem5() {
		return this.item5;
	}
	public WebElement getDownLoadSelect() {
		return this.downloadSelect;
	}
	public WebElement getUploadElement() {
		return this.uploadEle;
	}
	public WebElement getArlert() {
		return this.uploadSuccessArlet;
	}
	public WebElement getDownloadButton(){
		return this.downloadButton;
	}
	
}
