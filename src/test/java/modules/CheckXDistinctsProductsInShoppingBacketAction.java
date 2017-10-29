package modules;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
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
		int size =ShoppingBacketPage.shopping_basket_products.size();
		
		//Count the number of products registered
		Log.info("Nb Product(s) in shopping backet : "+ShoppingBacketPage.shopping_basket_products.size());
		assertEquals(nbProducts, ShoppingBacketPage.shopping_basket_products.size());
		
		for(int i = 0; i < size; i++) {
			WebElement product = ShoppingBacketPage.shopping_basket_products.get(i);
			Log.info("product : "+product);
			WebElement libel = product.findElement(By.xpath("//z-grid[1]/z-grid-item[2]/div/div[1]"));
			Log.info("libel recherche");
			Log.info("Libel : "+libel.getText());
			Log.info("product : "+product);
			WebElement price = product.findElement(By.xpath("//z-grid[1]/z-grid-item[2]/div/div[4]/div/span"));
			Log.info("Price : "+price.getText());
		}
	}
}
