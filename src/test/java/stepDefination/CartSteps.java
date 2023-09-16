package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CartSteps extends Driver {
	@Given("a user is in the LandingPage on Firstcry")
	public void a_user_is_in_the_landing_page_on_firstcry() {
		
	    
	}

	@When("he login")
	public void he_login() throws InterruptedException{
		landingpage.goToLoginPage();
		Thread.sleep(10000);
		loginpage.login();
		loginpage.clickOnCont();
		loginpage.clickOnSubmitBTN();
		    
	}
	
	@When("he search for Watches")
	public void he_search_for_watches() {
		
		landingpage.searchItem("toy cars");
	    
	}

	@When("he clicks on first result")
	public void he_clicks_on_first_result() {
		productpage.getTitleOfFirstItem();
	}

	@When("he clicks on Add to Cart option")
	public void he_clicks_on_add_to_cart_option() throws InterruptedException {
		
		
		//addtocartpage.AddToCart();
	    
	}

	@When("he clicks on Cart option")
	public void he_clicks_on_cart_option() {
		
		cartpage.Cart();
		   
	}

	@When("he click on Remove option")
	public void he_click_on_remove_option() throws InterruptedException {
		
		cartpage.Remove();
	   
	}


	@SuppressWarnings("deprecation")
	@Then("he must be able to see empty cart")
	public void he_must_be_able_to_see_empty_cart() throws InterruptedException {
		String actual = "Hey! No items in your cart";
		String expected = cartpage.getMassege();
		Assert.assertEquals(actual, expected);
	    
	}

}
