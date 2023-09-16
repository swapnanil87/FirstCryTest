package stepDefination;

import org.openqa.selenium.chrome.ChromeDriver;

import pageFactory.CartPage;
import pageFactory.LandingPage;
import pageFactory.LoginPage;
import pageFactory.ProductPage;

 

public class Driver extends Tools {

	protected static LandingPage landingpage;
	protected static LoginPage loginpage;
	protected static ProductPage productpage;
	//protected static AddToCartPage addtocartpage;
	protected static CartPage cartpage;
	
	
	

	public static void init() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","H:\\Selenium2_PE\\CucumberTestDemo\\Driver\\ChromeDriver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.firstcry.com/");
		  landingpage  = new LandingPage(driver);
		  loginpage = new LoginPage(driver);
		  productpage = new ProductPage(driver);
		 // addtocartpage = new AddToCartPage(driver);
		  cartpage = new CartPage(driver);

	}
}