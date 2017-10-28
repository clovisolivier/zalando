package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Log;
import pageobjects.AutomationHomePage;
import pageobjects.ProductsCatalogPage;

public class ListProductBySubMenuNavigationAction {

	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		AutomationHomePage.menu_men.click();
		AutomationHomePage.menu_complements.click();
		AutomationHomePage.sub_menu_sunglass.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ProductsCatalogPage.first_product));
		
		Log.info("WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(ProductDetailPage.add_backet_button));");
			
		ProductsCatalogPage.category_name.isDisplayed();
		ProductsCatalogPage.first_product.isDisplayed();
		
		}
}
