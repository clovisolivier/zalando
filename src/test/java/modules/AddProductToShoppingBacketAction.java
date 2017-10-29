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
		
		Log.info("ProductDetailPage.add_backet_button.isDisplayed();");
		ProductDetailPage.add_backet_button.isDisplayed();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(ProductDetailPage.add_backet_button));

		ProductDetailPage.product_label.isDisplayed();
		
		Log.info("Label : " + ProductDetailPage.product_label.getText());
		
		ProductDetailPage.product_price.isDisplayed();
		
		Log.info("Price : " + ProductDetailPage.product_price.getText());
		
		Log.info("WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(ProductDetailPage.add_backet_button));");
		clickableElement.click();	
		
		Log.info("ProductDetailPage.add_backet_button.click();");

	}
}
