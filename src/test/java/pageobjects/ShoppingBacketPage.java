package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import helpers.Log;

public class ShoppingBacketPage extends BaseClass {
	

	private static WebElement element = null;

	private static List<WebElement> elements = null;
	
	public ShoppingBacketPage(WebDriver driver){
		super(driver);
	}  
	
	
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div[3]/div/div")
	public static WebElement main_element;
	

	@FindBy(how=How.XPATH, using="/html/body/div[2]/div[3]/div/div/z-grid/z-grid-item[1]/h4")
	public static WebElement shopping_basket_header;
	
	
	public static List<WebElement> shopping_basket_products() throws Exception{
		try{ 
			elements = driver.findElements(By.xpath("/html/body/div[2]/div[3]/div/div/z-grid/z-grid-item/div/div/div"));
			Log.info("My shopping_basket_products is found on the page, " + elements.size() + " elements found");
		}catch (Exception e){
			Log.error("My shopping_basket_products is not found on the page");
			throw(e);
		}
		return elements;
	}
	
	public static WebElement shopping_basket_product_index(int index) throws Exception{
		try{ 
			elements = shopping_basket_products();
			element = elements.get(index);
			Log.info("My shopping_basket_products product "+index+" is found on the page");
		}catch (Exception e){
			Log.error("My shopping_basket_products product "+index+" is not found on the page");
			throw(e);
		}
		return element;
	}
	
	public static WebElement shopping_basket_product_index_libel(int index) throws Exception{
		try{ 
			element = shopping_basket_product_index(index).findElement(By.xpath(".//z-grid[1]/z-grid-item[2]/div/div[1]"));	
			Log.info("Price for product "+index+" is found on the page");
		}catch (Exception e){
			Log.error("Price for product "+index+" is not found on the page");
			throw(e);
		}
		return element;
	}
	
	public static WebElement shopping_basket_product_index_price(int index) throws Exception{
		try{ 
			element = shopping_basket_product_index(index).findElement(By.xpath(".//z-grid[1]/z-grid-item[2]/div/div[4]/div/span"));	
			Log.info("Price for product "+index+" is found on the page");
		}catch (Exception e){
			Log.error("Price for product "+index+" is not found on the page");
			throw(e);
		}
		return element;
	}
	
	public static WebElement shopping_basket_product_index_selector(int index) throws Exception{
		try{ 
			element = shopping_basket_product_index(index).findElement(By.xpath(".//z-grid[1]/z-grid-item[2]/div/div[3]/select"));	
			Log.info("Selector for product "+index+" is found on the page");
		}catch (Exception e){
			Log.error("Selector for product "+index+" is not found on the page");
			throw(e);
		}
		return element;
	}
	
	public static String shopping_basket_product_index_selected(int index) throws Exception{
		String selected ="";
		try{ 
			WebElement select = ShoppingBacketPage.shopping_basket_product_index_selector(index);
			Select dropDown = new Select(select);
			selected = dropDown.getFirstSelectedOption().getText();
			
			Log.info("Selected value for product "+index+" is found on the page");
		}catch (Exception e){
			Log.error("Selected value for product "+index+" is not found on the page");
			throw(e);
		}
		return selected;
	}
	
	public static int shopping_basket_product_count() throws Exception{
		int count = 0 ;
		try{ 

			List<WebElement> shopping_basket_products = ShoppingBacketPage.shopping_basket_products();
			
			int size = shopping_basket_products.size();
			for (int i =0; i < size; i++){
				count += Integer.parseInt(ShoppingBacketPage.shopping_basket_product_index_selected(i));
			}
			
			Log.info(count+" products found on the page");
		}catch (Exception e){
			Log.error("No product found on the page");
			throw(e);
		}
		return count;
	}
	
	public static int shopping_basket_distinct_product_count() throws Exception{
		int count = 0 ;
		try{ 
			List<WebElement> shopping_basket_products = ShoppingBacketPage.shopping_basket_products();
			count = shopping_basket_products.size();
			
			Log.info(count+" products found on the page");
		}catch (Exception e){
			Log.error("No product found on the page");
			throw(e);
		}
		return count;
	}
	
	public static WebElement shopping_basket_total() throws Exception{
		try{ 
			element = main_element.findElement(By.xpath(".//div[2]/div/z-grid[1]/z-grid-item[2]/div/z-grid[2]/z-grid-item[2]/div/div/span"));	
			Log.info("Element Total is found on the page");
		}catch (Exception e){
			Log.error("Element Total is not found on the page");
			throw(e);
		}
		return element;
	}
		

}