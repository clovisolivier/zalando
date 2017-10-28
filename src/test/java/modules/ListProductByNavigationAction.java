package modules;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.AutomationHomePage;
import pageobjects.ZapatosCatalogPage;


public class ListProductByNavigationAction {
	
	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
		
		//Needs
		// AutomationHomePage, ZapatosCatalogPage 
		WebDriverWait wait = new WebDriverWait(driver,10);
		AutomationHomePage.menu_men.click();
		AutomationHomePage.menu_zapatos.click();
		
		ZapatosCatalogPage.category_name.isDisplayed();
		assertEquals("Calzado De Hombre", ZapatosCatalogPage.category_name.getText());
		ZapatosCatalogPage.first_product.isDisplayed();

		
		}
}
