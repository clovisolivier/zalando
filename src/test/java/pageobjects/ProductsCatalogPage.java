package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import helpers.Log;

public class ProductsCatalogPage extends BaseClass {
	

	private static WebElement element = null;

	private static List<WebElement> elements = null;
	
	public ProductsCatalogPage(WebDriver driver){
		super(driver);
	}  
	
	@FindBy(how=How.XPATH, using="//*[@id=\"z-nvg-cognac-root\"]/z-grid/z-grid-item[2]/div")
	public static WebElement main_element;
		
	
	public static WebElement category_name() throws Exception{
		try{ 
			element = main_element.findElement(By.xpath(".//div[1]/h1/span"));
			Log.info("My category_name is found on the page " );
		}catch (Exception e){
			Log.error("My category_name is not found on the page");
			throw(e);
		}
		return element;
	}
	

	public static WebElement clickable_product(int index) throws Exception{
		try{ 
		 element = list_product().get(index).findElement(By.xpath("div/a"));
			Log.info("My clickable_product is found on the page " );
		}catch (Exception e){
			Log.error("My clickable_product is not found on the page");
			throw(e);
		}
		return element;
	}
	
	public static List<WebElement> list_product() throws Exception{
		try{ 
			elements = main_element.findElements(By.xpath(".//z-grid[3]/z-grid-item"));
			Log.info("My list_product is found on the page " );
		}catch (Exception e){
			Log.error("My list_product is not found on the page");
			throw(e);
		}
		return elements;
	}
	
	
	public static WebElement list_product_index(int index) throws Exception{
		try{ 
			elements = list_product();
			element = elements.get(index);
			Log.info("My list_product_index product "+index+" is found on the page");
		}catch (Exception e){
			Log.error("My list_product_index product "+index+" is not found on the page");
			throw(e);
		}
		return element;
	}
	

}
