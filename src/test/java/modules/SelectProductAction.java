package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.ProductDetailPage;
import pageobjects.ProductsCatalogPage;


public class SelectProductAction {
	
	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{

		WebDriverWait wait = new WebDriverWait(driver, 10);
	
		List<WebElement> list_product = ProductsCatalogPage.list_product();
		WebElement first_element = list_product.get(0);
		
		wait.until(ExpectedConditions.elementToBeClickable(first_element));

		
		WebElement clickable = first_element.findElement(By.xpath("div/a"));
		wait.until(ExpectedConditions.elementToBeClickable(clickable));
		
		clickable.click();
		
		ProductDetailPage.main_element.isDisplayed();
			
		}
}
