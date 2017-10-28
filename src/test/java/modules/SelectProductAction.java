package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;

import pageobjects.ProductDetailPage;
import pageobjects.ProductsCatalogPage;


public class SelectProductAction {
	
	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
		
		
		ProductsCatalogPage.first_product.click();
		
		ProductDetailPage.add_backet_button.isDisplayed();
			
		}
}
