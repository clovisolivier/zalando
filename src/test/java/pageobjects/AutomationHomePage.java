package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutomationHomePage extends BaseClass{

	public AutomationHomePage(WebDriver driver){
		super(driver);
	}    
	
	@FindBy(how=How.XPATH, using="//div[2]/a/span[2]")
	public static WebElement menu_basket;

	@FindBy(how=How.LINK_TEXT, using="HOMBRE")
	public static WebElement menu_men;
	
	@FindBy(how=How.LINK_TEXT, using="Zapatos")
	public static WebElement menu_zapatos;
	

	@FindBy(how=How.LINK_TEXT, using="Complementos")
	public static WebElement menu_complements;
	
	
	@FindBy(how=How.XPATH, using="(//a[contains(text(),'Gafas de sol')])[2]")
	public static WebElement sub_menu_sunglass;
	
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div[2]/div/div/z-grid/z-grid-item/header/div/nav/div[3]/div/div/div[3]/div/a/div")
	public static WebElement popup_Shooping_backet;
	
	
	@FindBy(how=How.NAME, using="q")
	public static WebElement search;

	@FindBy(how=How.XPATH, using="//input[@name='q']")
	public static WebElement searchButton;

	
}


















