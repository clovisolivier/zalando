package modules;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Log;
import models.Product;
import pageobjects.ShoppingBacketPage; 


public class CheckXDistinctsProductsInShoppingBacketAction {
	public static void Execute(WebDriver driver,List<HashMap<String,String>> map, ArrayList<Product> list_products) throws Exception{

		WebDriverWait wait = new WebDriverWait(driver,10);
		List<WebElement> shopping_basket_products = ShoppingBacketPage.shopping_basket_products();
		int size = shopping_basket_products.size();

		int nbProducts =  list_products.size();
		 
		//Count the number of products registered
		Log.info("Nb Product(s) in shopping backet : "+size);
		assertEquals(nbProducts, size); 
		for (int i = 0;i < size; i++){
			WebElement libel = ShoppingBacketPage.shopping_basket_product_index_libel(i);
			WebElement price = ShoppingBacketPage.shopping_basket_product_index_price(i);
			Product product = new Product(libel.getText(),price.getText());
			assert(list_products.contains(product));
		}

	}
}
