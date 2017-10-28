package modules;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import jdk.internal.jline.internal.Log;
import pageobjects.AutomationHomePage;
import pageobjects.ZapatosCatalogPage;


public class ListProductByNavigationAction {
	
	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
		
		//Needs
		// AutomationHomePage, ZapatosCatalogPage 
		WebDriverWait wait = new WebDriverWait(driver,10);
		AutomationHomePage.menu_men.click();
		AutomationHomePage.menu_complements.click();
		
		ZapatosCatalogPage.category_name.isDisplayed();
		//Log.info("category_name "+ZapatosCatalogPage.category_name.getText());
		ZapatosCatalogPage.first_product.isDisplayed();

		
		}
}
