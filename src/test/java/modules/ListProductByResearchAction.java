package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobjects.AutomationHomePage;

public class ListProductByResearchAction {

	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
		
		
		WebElement input_search = AutomationHomePage.input_search();
		input_search.sendKeys("Bolsas de aseo");
		input_search.sendKeys(Keys.ENTER);
		
		
		}
}
 