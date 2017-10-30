package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.AutomationHomePage;
import pageobjects.ProductsCatalogPage;

public class ListProductBySubMenuNavigationAction {

	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
		
		WebDriverWait wait = new WebDriverWait(driver,10);	
		
		WebElement menu_men = AutomationHomePage.menu_men();
		menu_men.click();
		
		WebElement menu_complements = AutomationHomePage.menu_complements();
		menu_complements.click();
		

		WebElement sub_menu_sunglass = AutomationHomePage.sub_menu_sunglass();
		sub_menu_sunglass.click();
		
		WebElement first_product = ProductsCatalogPage.list_product_index(0);
		wait.until(ExpectedConditions.elementToBeClickable(first_product));
		
		WebElement category_name = ProductsCatalogPage.category_name();
		category_name.isDisplayed();
		
		first_product.isDisplayed();
		
		}
}
