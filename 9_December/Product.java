package shoppingKartusingarray;

import java.util.Scanner;

public class Product {
	int id;
	String name,brand;
	double price;
	int quantity;
	public Product(int id, String name, String brand, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}
	
public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}



 

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Product [id=");
	builder.append(id);
	builder.append(", name=");
	builder.append(name);
	builder.append(", brand=");
	builder.append(brand);
	builder.append(", price=");
	builder.append(price);
	builder.append(", quantity=");
	builder.append(quantity);
	builder.append("]");
	return builder.toString();
}

public Product Addproduct() 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the product id: ");
	int id=sc.nextInt();
	sc.nextLine();
	System.out.println("enter the name of product: ");
	String name=sc.nextLine();
	System.out.println("enter the band of product: ");
	String brand=sc.nextLine();
	System.out.println("enter the price of product: ");
	double price=sc.nextDouble();
	System.out.println("enter the quantity of product: ");
	int quantity=sc.nextInt();
	Product product=new Product(id,name,brand,price,quantity);
	return product;
	}
}
