package modules;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.AutomationHomePage;
import pageobjects.ProductsCatalogPage;


public class ListProductByNavigationAction {
	
	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		AutomationHomePage.menu_men.click();
		AutomationHomePage.menu_complements.click();
		//ProductsCatalogPage.menu_gorros.click();
		
		ProductsCatalogPage.category_name.isDisplayed();
		ProductsCatalogPage.first_product.isDisplayed();
		
		}
}
