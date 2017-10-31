package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobjects.AutomationHomePage;


public class ListProductByNavigationAction {
	
	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
		
		
		WebElement menu_men = AutomationHomePage.menu_men();
		menu_men.click();
		
		WebElement menu_complements = AutomationHomePage.menu_complements();
		menu_complements.click();
		
	
		
		}
}
