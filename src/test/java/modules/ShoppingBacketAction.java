package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Log;
import pageobjects.AutomationHomePage;
import pageobjects.ShoppingBacketPage;


public class ShoppingBacketAction {
	
	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
		
		Log.info("Access to menu_basket");
		System.out.println("*********************************************** Access to menu_basket ***********************************************");

		WebDriverWait wait = new WebDriverWait(driver,10);

		Log.info("Access to menu_basket");
		AutomationHomePage.menu_basket.click();
		Log.info("In shopping backet ");
		//ShoppingBacketPage.shopping_basket_header.isDisplayed();
		
		}
}
