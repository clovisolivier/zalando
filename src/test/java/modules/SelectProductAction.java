package modules;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import helpers.DataHelper;
import helpers.Log;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.AutomationHomePage;
import pageobjects.ProductDetailPage;
import pageobjects.ZapatosCatalogPage;


public class SelectProductAction {
	
	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
		
		
		ZapatosCatalogPage.first_product.click();
		
		ProductDetailPage.add_backet_button.isDisplayed();
			
		}
}
