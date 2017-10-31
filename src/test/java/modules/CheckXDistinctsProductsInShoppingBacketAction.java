package modules;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.Log;
import models.Product;
import pageobjects.ShoppingBacketPage; 


public class CheckXDistinctsProductsInShoppingBacketAction {
	public static void Execute(WebDriver driver,List<HashMap<String,String>> map, ArrayList<Product> listProducts) throws Exception{


		int nbProductsAddedToBacket = ShoppingBacketPage.shopping_basket_product_count();
		int nbDistinctsProducts = ShoppingBacketPage.shopping_basket_distinct_product_count();
		int nbProducts =  listProducts.size();

		//Count the number of products registered
		int nbProductInBacket =0;
		double backetPrice = 0;

		assertEquals(nbProducts, nbProductsAddedToBacket); 

		for (int i = 0;i < nbDistinctsProducts; i++){
			double cumulPrice = 0;

			WebElement libel = ShoppingBacketPage.shopping_basket_product_index_libel(i);
			WebElement price = ShoppingBacketPage.shopping_basket_product_index_price(i);
			Product product = new Product(libel.getText(),price.getText());

			int selected =Integer.parseInt(ShoppingBacketPage.shopping_basket_product_index_selected(i));

			//Count of products in shopping backet
			nbProductInBacket = nbProductInBacket + selected;

			//Check product has been added
			assert(listProducts.contains(product));

			Product stored = listProducts.get(listProducts.lastIndexOf(product));
			
			//If the same product has been added in the shopping backet more than one time
			if( selected > 1 ){
				
				cumulPrice = stored.price * selected;
				
			}else{
				cumulPrice = stored.price;
			}
			
			//Add total price of this product
			backetPrice = backetPrice +cumulPrice;
			
			//Check amount for this product
			assert(product.price == cumulPrice);
		}

		//Check that the number of products in shopping backet is the consistent 
		assertEquals(nbProductInBacket, nbProductsAddedToBacket);

		//Check the shopping backet total amount
		WebElement totalPrice = ShoppingBacketPage.shopping_basket_total();
		
		assert(Product.convertToDouble(totalPrice.getText()) == backetPrice);

	}
}
