package modules;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Log;
import pageobjects.ShoppingBacketPage;

public class CheckXDistinctsProductsInShoppingBacketAction {
	public static void Execute(WebDriver driver,List<HashMap<String,String>> map, int nbProducts) throws Exception{

		WebDriverWait wait = new WebDriverWait(driver,10);
		List<WebElement> shopping_basket_products = ShoppingBacketPage.shopping_basket_products();
		int size = shopping_basket_products.size();

		//Count the number of products registered
		Log.info("Nb Product(s) in shopping backet : "+size);
		assertEquals(nbProducts, size); 
		for (int i = 0;i < size; i++){
			Log.info("Interqtor : "+i);
			WebElement libel = ShoppingBacketPage.shopping_basket_product_index_libel(i);
			Log.info("Libel : "+libel.getText());

			WebElement price = ShoppingBacketPage.shopping_basket_product_index_price(i);
			Log.info("Price : "+price.getText());
		}

	}
}
