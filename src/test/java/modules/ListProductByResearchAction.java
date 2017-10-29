package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.AutomationHomePage;
import pageobjects.ProductsCatalogPage;

public class ListProductByResearchAction {

	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement input_search = AutomationHomePage.input_search();
		input_search.sendKeys("Bolsas de aseo");
		input_search.sendKeys(Keys.ENTER);
		
		WebElement category_name = ProductsCatalogPage.category_name();
		category_name.isDisplayed();

		ProductsCatalogPage.list_product_index(0).isDisplayed();
			
		}
}
 