package modules;


import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.AutomationHomePage;
import pageobjects.ShoppingBacketPage;



public class ShoppingBacketAction {
	
	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
	

		WebDriverWait wait = new WebDriverWait(driver,10);

		WebElement menu_popup_shooping_backet = AutomationHomePage.menu_popup_shooping_backet();
		
		wait.until(ExpectedConditions.elementToBeClickable(menu_popup_shooping_backet));
		
		menu_popup_shooping_backet.click();
		
		ShoppingBacketPage.main_element.isDisplayed();
		
		
		}
}
