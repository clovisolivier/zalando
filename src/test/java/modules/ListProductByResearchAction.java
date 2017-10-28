package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.AutomationHomePage;
import pageobjects.ProductsCatalogPage;

public class ListProductByResearchAction {

	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		AutomationHomePage.search.sendKeys("Bolsas de aseo");
		AutomationHomePage.search.sendKeys(Keys.ENTER);
		
		ProductsCatalogPage.category_name.isDisplayed();
		ProductsCatalogPage.first_product.isDisplayed();
			
		}
}
