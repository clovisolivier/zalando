package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Log;
import pageobjects.ProductDetailPage;


public class AddProductToShoppingBacketAction {

	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
		
		
		WebElement add_backet_button = ProductDetailPage.add_backet_button();
		add_backet_button.isDisplayed();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(add_backet_button));

		WebElement product_label = ProductDetailPage.product_label();
		product_label.isDisplayed();
		
		Log.info("Label : " + product_label.getText());
		
		WebElement product_price = ProductDetailPage.product_price();
		product_price.isDisplayed();
		
		Log.info("Price : " + product_price.getText());
		
		clickableElement.click();	
		

	}
}
