package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import helpers.Log;

public class ProductDetailPage extends BaseClass {
	

	private static WebElement element = null;
	
	public ProductDetailPage(WebDriver driver){
		super(driver);
	}  
	
	
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div[4]/div/div/div/z-grid[1]")
	public static WebElement main_element;
	
	public static WebElement product_label() throws Exception{
		try{ 
			element = main_element.findElement(By.xpath(".//z-grid-item[2]/div[1]/div/div[1]/h1/span"));
			Log.info("My product_label is found on the page");
		}catch (Exception e){
			Log.error("My product_label is not found on the page");
			throw(e);
		}
		return element;
	}
	
	public static WebElement product_price() throws Exception{
		try{ 
			element = main_element.findElement(By.xpath(".//z-grid-item[2]/div[1]/div/div[2]/div/span[2]"));
			Log.info("My product_price is found on the page");
		}catch (Exception e){
			Log.error("My product_price is not found on the page");
			throw(e);
		}
		return element;
	}
	
	public static WebElement add_backet_button() throws Exception{
		try{
			element = main_element.findElement(By.xpath(".//div[3]/button"));
			Log.info("My add to shooping button is found on the page");
		}catch (Exception ex){
			try{ 
				element = main_element.findElement(By.xpath(".//div[4]/button"));
				Log.info("My add to shooping button is found on the page");
			}catch (Exception e){
				Log.error("My add to shooping button is not found on the page");
				throw(e);
			}
		}
		return element;
	}

}
