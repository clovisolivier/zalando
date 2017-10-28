package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;

import pageobjects.ProductDetailPage;
import pageobjects.ZapatosCatalogPage;


public class SelectProductAction {
	
	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
		
		
		ZapatosCatalogPage.first_product.click();
		
		ProductDetailPage.add_backet_button.isDisplayed();
			
		}
}
