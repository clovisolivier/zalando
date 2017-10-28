package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Log;
import pageobjects.ProductDetailPage;
import pageobjects.ProductsCatalogPage;


public class SelectProductAction {
	
	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{

		WebDriverWait wait = new WebDriverWait(driver, 10);
	
		WebElement first_element = ProductsCatalogPage.list_product.get(0);
		
		wait.until(ExpectedConditions.elementToBeClickable(first_element));

		Log.info("ProductsCatalogPage.first_product.isDisplayed();");
		WebElement clickable = first_element.findElement(By.xpath("div/a"));
		wait.until(ExpectedConditions.elementToBeClickable(clickable));
		Log.info("wait.until(ExpectedConditions.elementToBeClickable(clickable));");
		clickable.click();
			
		}
}
