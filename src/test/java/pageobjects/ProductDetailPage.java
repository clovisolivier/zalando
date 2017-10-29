package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductDetailPage extends BaseClass {
	
	public ProductDetailPage(WebDriver driver){
		super(driver);
	}  
		
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div[4]/div/div/div/z-grid[1]/z-grid-item[2]/div[4]/button")
	public static WebElement add_backet_button;
	
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div[4]/div/div/div/z-grid[1]/z-grid-item[2]/div[3]/div/div")
	public static WebElement size_drop_down;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"zvui-size-select-dropdown-17429-value-item\"]/div/div/div/span")
	public static WebElement selected_size_drop_down;
	
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div[4]/div/div/div/z-grid[1]/z-grid-item[2]/div[1]/div/div[1]/h1/span")
	public static WebElement product_label;
	
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div[4]/div/div/div/z-grid[1]/z-grid-item[2]/div[1]/div/div[2]/div/span[2]")
	public static WebElement product_price;
	
}
