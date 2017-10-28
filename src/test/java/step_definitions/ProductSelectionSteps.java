package step_definitions;

import pageobjects.AutomationHomePage;
import pageobjects.ProductDetailPage;
import pageobjects.ShoppingBasketPage;
import pageobjects.ZapatosCatalogPage;

import java.util.HashMap;
import java.util.List;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.DataHelper;
import modules.AddProductToShoppingBacketAction;
import modules.ListProductByNavigationAction;
import modules.SelectProductAction;


public class ProductSelectionSteps {
	public WebDriver driver;
	public List<HashMap<String,String>> datamap;


	public ProductSelectionSteps()
	{
		driver = Hooks.driver;
		datamap = DataHelper.data();
	}

	@When("^I open zalando website$")
	public void i_open_zalando_website() throws Throwable {
		driver.get("http://zalando.es");
	}

	@When("^I search shoes for men by navigation$")
	public void i_search_shoes_for_men_by_navigation() throws Throwable {
		PageFactory.initElements(driver, AutomationHomePage.class);
		PageFactory.initElements(driver, ZapatosCatalogPage.class);


		ListProductByNavigationAction.Execute(driver,datamap);
	}

	@When("^I select a product in the list$")
	public void i_select_a_product_in_the_list() throws Throwable {
		PageFactory.initElements(driver, ZapatosCatalogPage.class);

		PageFactory.initElements(driver, ProductDetailPage.class);

		SelectProductAction.Execute(driver,datamap);
	}

	@When("^I add this product to the shopping basket$")
	public void i_add_this_product_to_the_shopping_basket() throws Throwable {
		PageFactory.initElements(driver, ProductDetailPage.class);

		PageFactory.initElements(driver, ShoppingBasketPage.class);

		AddProductToShoppingBacketAction.Execute(driver,datamap);
	}

	@Then("^I search for a dress by research$")
	public void i_search_for_a_dress_by_research() throws Throwable {
		PageFactory.initElements(driver, AutomationHomePage.class);
		PageFactory.initElements(driver, ZapatosCatalogPage.class);


		ListProductByNavigationAction.Execute(driver,datamap);
	}



}
