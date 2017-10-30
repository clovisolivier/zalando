package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.ProductDetailPage;
import pageobjects.ProductsCatalogPage;


public class SelectProductAction {
	
	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{

		WebDriverWait wait = new WebDriverWait(driver, 10);
			
		WebElement firstElement = ProductsCatalogPage.clickable_product(0);
		
		wait.until(ExpectedConditions.elementToBeClickable(firstElement));
		
		firstElement.click();
		
		ProductDetailPage.main_element.isDisplayed();
			
		}
}
