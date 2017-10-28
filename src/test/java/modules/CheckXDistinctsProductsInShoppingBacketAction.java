package modules;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Log;
import pageobjects.ProductsCatalogPage;
import pageobjects.ShoppingBacketPage;

public class CheckXDistinctsProductsInShoppingBacketAction {
	public static void Execute(WebDriver driver,List<HashMap<String,String>> map, int nbProducts) throws Exception{

		WebDriverWait wait = new WebDriverWait(driver,10);

		
		//Count the number of products registered
		Log.info("Nb Product(s) in shopping backet : "+ShoppingBacketPage.shopping_basket_products.size());
		assertEquals(nbProducts, ShoppingBacketPage.shopping_basket_products.size());
		
	}
}
