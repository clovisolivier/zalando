package models;


public class Product{
	public String libel;
	public double price;
	
	public Product(String libel, double price){
		this.libel = libel;
		this.price = price;
	}
	
	public Product(String libel, String price){
		this.libel = libel;
		this.price = convertToDouble(price);
	}
	
	public boolean equals(Object product){
		return this.libel.equals(((Product)product).libel);
	}
	
	public String toString(){
		return "libel : " + this.libel + " ,price : " + this.price;
	}
	
	public static double convertToDouble(String price){
		price = price.substring(0,price.length()-1).trim().replace(",", ".");	
		return Double.parseDouble(price);
	}
	
	
}