package pageFactory;

 

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

 

public class LoginPage {

	

	@FindBy(id = "lemail")

	private WebElement enterEmail;

	

	@FindBy(xpath = "//div[contains(@class,'btn-login-continue')]")

	private WebElement contBTN;

	

	@FindBy(xpath = "//div[contains(@class,'B14_white')]")

	private WebElement submitBTN;

	

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	

	public void login() {

		enterEmail.sendKeys("guchhaitswapnanil@gmail.com");

	}

	

	public void clickOnCont() {

		contBTN.click();

	}

	

	public void clickOnSubmitBTN() throws InterruptedException {

		Thread.sleep(30000);

		submitBTN.click();

	}

 

}