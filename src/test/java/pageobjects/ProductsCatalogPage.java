package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductsCatalogPage extends BaseClass {
	
	public ProductsCatalogPage(WebDriver driver){
		super(driver);
	}  
		
	@FindBy(how=How.XPATH, using="//*[@id=\"z-nvg-cognac-root\"]/z-grid/z-grid-item[2]/div/div[1]/h1/span")
	public static WebElement category_name;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"z-nvg-cognac-root\"]/z-grid/z-grid-item[2]/div/z-grid[3]/z-grid-item[1]/div/a")
	public static WebElement first_product;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"z-nvg-cognac-root\"]/z-grid/z-grid-item[1]/div/div/div/div[3]/div/div[1]")
	public static WebElement menu_gorros;

}
