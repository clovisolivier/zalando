package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Log;
import pageobjects.ShoppingBacketPage;

public class CheckXproductsInShoppingBacketAction {
	public static void Execute(WebDriver driver,List<HashMap<String,String>> map, int nbProducts) throws Exception{

		WebDriverWait wait = new WebDriverWait(driver,10);
		//Count the number of products registered

		Log.info(""+ShoppingBacketPage.shopping_basket_products.size());

	}
}
