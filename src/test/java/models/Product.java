package models;


public class Product{
	public String libel;
	public String price;
	
	public Product(String libel, String price){
		this.libel = libel;
		this.price = price;
		

	}
	
	public boolean equals(Product product){
		   return ((this.libel.equals(product.libel)) && (this.price.equals(product.price)));
	}
}