package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;

import pageobjects.ProductDetailPage;
import pageobjects.ShoppingBasketPage;


public class AddProductToShoppingBacket {

	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{

		ProductDetailPage.size_drop_down.isDisplayed();
		ProductDetailPage.size_drop_down.click();

		ProductDetailPage.add_backet_button.click();

		ShoppingBasketPage.shopping_basket_header.isDisplayed();

	}
}
