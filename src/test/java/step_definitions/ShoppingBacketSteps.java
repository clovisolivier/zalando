package step_definitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.DataHelper;
import helpers.Log;
import models.Product;
import modules.CheckIsEmptyShoppingBacketAction;
import modules.CheckXDistinctsProductsInShoppingBacketAction;
import modules.ShoppingBacketAction;
import pageobjects.AutomationHomePage;
import pageobjects.ShoppingBacketPage; 

public class ShoppingBacketSteps {

    public WebDriver driver;
    public List<HashMap<String,String>> datamap;

	public ArrayList<Product> list_products ;

    public ShoppingBacketSteps()
    {
        driver = Hooks.driver;
        datamap = DataHelper.data();
		list_products = Hooks.list_products;
    }

	@When("^I go in my shopping backet$")
	public void i_go_in_my_shopping_backet() throws Throwable {
		PageFactory.initElements(driver, AutomationHomePage.class);
		PageFactory.initElements(driver, ShoppingBacketPage.class);
		
		ShoppingBacketAction.Execute(driver, datamap);
	}
	
	@When("^I check my shopping backet is empty$")
	public void i_check_my_shopping_backet_is_empty() throws Throwable {
		PageFactory.initElements(driver, ShoppingBacketPage.class); 
		
		CheckIsEmptyShoppingBacketAction.Execute(driver, datamap);
	}
	
	
	@Then("^I check that I have (\\d+) products in my shopping backet$")
	public void i_check_that_I_have_products_in_my_shopping_backet(int arg1) throws Throwable {
	    Log.info("I check that I have "+arg1+" products in my shopping backet");
	    PageFactory.initElements(driver, ShoppingBacketPage.class);
		
		CheckXDistinctsProductsInShoppingBacketAction.Execute(driver, datamap, list_products);
	}	
}
