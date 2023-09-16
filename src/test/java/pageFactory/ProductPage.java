package pageFactory;

 

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

 

public class ProductPage {

	

	@FindBy(xpath = "//div[contains(@class,'lblock lft')]")

	private WebElement firstItem;

	

	public ProductPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	

	public String getTitleOfFirstItem() {

		return firstItem.getText();
		//driver.getWindowHandles();

	}

	

 

}