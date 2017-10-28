package modules;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Log;
import pageobjects.AutomationHomePage;
import pageobjects.ShoppingBacketPage;


public class ShoppingBacketAction {
	
	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
		
		Log.info("ShoppingBacketAction");

		WebDriverWait wait = new WebDriverWait(driver,10);

		AutomationHomePage.menu_basket.click();
		
		//assertTrue(ShoppingBacketPage.shopping_basket_header.isDisplayed());
		
		}
}
