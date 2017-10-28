package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;

import helpers.Log;
import pageobjects.ProductDetailPage;
import pageobjects.ShoppingBasketPage;


public class AddProductToShoppingBacketAction {

	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
		Log.startTestCase("AddProductToShoppingBacket");

		Log.info("AddProductToShoppingBacket is performed");
		//ProductDetailPage.size_drop_down.isDisplayed();
		//ProductDetailPage.size_drop_down.click();

		ProductDetailPage.add_backet_button.click();

		ShoppingBasketPage.shopping_basket_header.isDisplayed();

	}
}
