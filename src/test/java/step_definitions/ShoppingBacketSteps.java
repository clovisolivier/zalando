package step_definitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import helpers.DataHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;

public class ShoppingBacketSteps {

    public WebDriver driver;
    public List<HashMap<String,String>> datamap;


    public ShoppingBacketSteps()
    {
        driver = Hooks.driver;
        datamap = DataHelper.data();
    }

	@Then("^I go in my shopping basket$")
	public void i_go_in_my_shopping_basket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I check that I have (\\d+) products in my shopping basket$")
	public void i_check_that_I_have_products_in_my_shopping_basket(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
