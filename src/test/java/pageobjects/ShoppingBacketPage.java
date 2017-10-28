package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingBacketPage extends BaseClass {
	
	public ShoppingBacketPage(WebDriver driver){
		super(driver);
	}  
		
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div[3]/div/div/z-grid/z-grid-item[1]/h4")
	public static WebElement shopping_basket_header;
	
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div[3]/div/div/z-grid/z-grid-item/div/div/div")
	public static List<WebElement> shopping_basket_products;
	

}