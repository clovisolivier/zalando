package models;


public class Product{
	public String libel;
	public String price;
	
	public Product(String libel, String price){
		this.libel = libel;
		this.price = price;
	}
	
	public boolean equals(Object product){
		return (this.libel.equals(((Product)product).libel) && (this.price.equals(((Product)product).price)));
	}
	
	public String toString(){
		return "libel : " + this.libel + " ,price : " + this.price;
	}
}