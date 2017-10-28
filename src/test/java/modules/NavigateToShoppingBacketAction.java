package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.AutomationHomePage;
import pageobjects.ShoppingBasketPage;


public class NavigateToShoppingBacketAction {
	
	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
		
		//Needs
		// AutomationHomePage, ZapatosCatalogPage 
		WebDriverWait wait = new WebDriverWait(driver,10);
		AutomationHomePage.menu_basket.click();
		
		ShoppingBasketPage.shopping_basket_header.isDisplayed();
		
		}
}
