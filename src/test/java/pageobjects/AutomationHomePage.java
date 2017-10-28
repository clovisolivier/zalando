package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutomationHomePage extends BaseClass{

	public AutomationHomePage(WebDriver driver){
		super(driver);
	}    
	
	@FindBy(how=How.LINK_TEXT, using="Cesta")
	public static WebElement menu_basket;

	@FindBy(how=How.LINK_TEXT, using="HOMBRE")
	public static WebElement menu_men;
	
	@FindBy(how=How.LINK_TEXT, using="Zapatos")
	public static WebElement menu_zapatos;
	

	@FindBy(how=How.LINK_TEXT, using="Complementos")
	public static WebElement menu_complements;
	
	@FindBy(how=How.NAME, using="q")
	public static WebElement search;

	@FindBy(how=How.XPATH, using="//input[@name='q']")
	public static WebElement searchButton;

	
}


















