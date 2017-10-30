package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobjects.AutomationHomePage;
import pageobjects.ProductsCatalogPage;


public class ListProductByNavigationAction {
	
	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
		
		
		WebElement menu_men = AutomationHomePage.menu_men();
		menu_men.click();
		
		WebElement menu_complements = AutomationHomePage.menu_complements();
		menu_complements.click();
		
		WebElement category_name = ProductsCatalogPage.category_name();
		category_name.isDisplayed();
		
		ProductsCatalogPage.list_product_index(0).isDisplayed();
		
		
		}
}
