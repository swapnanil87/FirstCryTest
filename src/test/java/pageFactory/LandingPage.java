package pageFactory;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;


public class LandingPage {

	
	@FindBy(xpath = "//li[contains(@class,'logreg')]")

	private WebElement goToLogIn;

	
	@FindBy(xpath = "//input[contains(@id,'search_box')]")

	private WebElement searchBox;

	

	@FindBy(xpath = "//span[contains(@class,'search-button')]")

	private WebElement searchBTN;

	

	//@FindBy(xpath = "//li[contains(@class,'logreg')]")

	//private WebElement goToLogIn;

	

	public LandingPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
	
	
	public void goToLoginPage() {

		goToLogIn.click();

	}

	

	public void searchItem(String tshirt) {

		searchBox.click();

		searchBox.sendKeys("toy cars");

		searchBTN.click();

	}

	

	//public void goToLoginPage() {

	//	goToLogIn.click();

}



	 
		
