package modules;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;

import jdk.internal.jline.internal.Log;
import pageobjects.ShoppingBacketPage;

public class CheckIsEmptyShoppingBacketAction {

	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
		Log.info(ShoppingBacketPage.shopping_basket_header.getText());
		assertEquals("CESTA", ShoppingBacketPage.shopping_basket_header.getText());
	}
}
