package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.Log;

public class AutomationHomePage extends BaseClass{

	private static WebElement element = null;

	public AutomationHomePage(WebDriver driver){
		super(driver);
	}    


	public static WebElement menu_men() throws Exception{
		try{ 
			element = driver.findElement(By.linkText("HOMBRE"));
			Log.info("My menu complements is found on the Home Page");
		}catch (Exception e){
			Log.error("My menu complements is not found on the Home Page");
			throw(e);
		}
		return element;
	}

	public static WebElement menu_complements() throws Exception{
		try{ 
			element = driver.findElement(By.linkText("Complementos"));
			Log.info("My menu complements is found on the Home Page");
		}catch (Exception e){
			Log.error("My menu complements is not found on the Home Page");
			throw(e);
		}
		return element;
	}
	
	public static WebElement sub_menu_sunglass() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("(//a[contains(text(),'Gafas de sol')])[2]"));
			Log.info("My menu sunglasses is found on the Home Page");
		}catch (Exception e){
			Log.error("My menu sunglasses is not found on the Home Page");
			throw(e);
		}
		return element;
	}
	

	public static WebElement input_search() throws Exception{
		try{ 
			element = driver.findElement(By.name("q"));
			Log.info("My search input is found on the Home Page");
		}catch (Exception e){
			Log.error("My search input is not found on the Home Page");
			throw(e);
		}
		return element;
	}
	
	public static WebElement menu_popup_shooping_backet() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/z-grid/z-grid-item/header/div/nav/div[3]/div/div/div[3]/div/a/div"));
			Log.info("My shooping backet link is found on the Home Page");
		}catch (Exception e){
			Log.error("My shooping backet link is not found on the Home Page");
			throw(e);
		}

		return element;

	}
}


















