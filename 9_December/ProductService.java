package shoppingKartusingarray;
import java.util.Scanner;
public class ProductService {
	
	static Product product[]=new Product[10];
	static OrderDetails order[]=new OrderDetails[10];
	static Scanner sc=new Scanner(System.in);
	static int index=0;
	static int orderIndex=0;
	static int orderId=1;
	//this method is responsible to add product in the array
	 static void createProduct()
	{
		System.out.println("Enter Product Id");
	    int id=sc.nextInt();
	    
	    sc.nextLine();//it will consume the \n character
	    
	    System.out.println("Enter Product Name");
	    String name=sc.nextLine();
	    
	    System.out.println("Enter Product Brand");
	    String brand=sc.nextLine();
	    
	    System.out.println("Enter Product price");
	    double price=sc.nextInt();
	    
	    System.out.println("Enter Stock");
	    int quantity=sc.nextInt();
	    
	    //will insert in an array
	    product[index]=new Product(id, name, brand, price, quantity);
	    index++;//2
	    System.out.println("Product added successfully!!");
	}

	//this method is responsible to retrieve all product details
	 static void getAllProduct()
	{
		for(int i=0;i<index;i++)
		{
			System.out.println("Product id: "+product[i].getId());
			System.out.println("Product Name: "+product[i].getName());
			System.out.println("Product Brand: "+product[i].getBrand());
			System.out.println("Product price: "+product[i].getPrice());
			System.out.println("Product Stock: "+product[i].getQuantity());
			System.out.println("============================================");
		}
	}

	//this method is responsible to retrieve product details by id
	  static void getProductById()
	{
		boolean f=false;
		System.out.println("Enter id To search Product:");
		int id=sc.nextInt();
		System.out.println("============================================");
		for(int i=0;i<index;i++)
		{
			if(product[i].getId()==id)
			{
				System.out.println("Product id: "+product[i].getId());
				System.out.println("Product Name: "+product[i].getName());
				System.out.println("Product Brand: "+product[i].getBrand());
				System.out.println("Product price: "+product[i].getPrice());
				System.out.println("Product Stock: "+product[i].getQuantity());
				System.out.println("============================================");
				f=true;
				break;
			}
		}
		if(f==false)
		{
			System.out.println("Product Id not found!!!");
			System.out.println("============================================");
		}
	}

	//this method is responsible to order product
	static void bookProduct()
	{
	     boolean f=false;
		sc.nextLine();
		System.out.println("Enter product name:");
		String name=sc.nextLine();
		System.out.println("============================================");
		for(int i=0;i<index;i++)
		{
			if(product[i].getName().equalsIgnoreCase(name))
			{
				System.out.println("Product id: "+product[i].getId());
				System.out.println("Product Name: "+product[i].getName());
				System.out.println("Product Brand: "+product[i].getBrand());
				System.out.println("Product price: "+product[i].getPrice());
				System.out.println("Product Stock: "+product[i].getQuantity());
				System.out.println("============================================");
				f=true;
			}
		}
		if(f==true)
		{
			System.out.println("for booking, Enter Id:");
			int id=sc.nextInt();
			
			for(int i=0;i<index;i++)
			{
			if(product[i].getId()==id)
			{
				System.out.println("Enter quantity:");
				int quantity=sc.nextInt();
				
				if(product[i].getQuantity()>quantity) //10>1
				{
					System.out.println("Your Booking has done successfully!!");
					double total=quantity*product[i].getPrice();
					System.out.println("Booking Details: ");
					System.out.println("Product Name: "+ product[i].getName());
					System.out.println("Product Brand: "+ product[i].getBrand());
					System.out.println("Product Quatity: "+ quantity);
					System.out.println("Total amount: "+ total);
			        
					//updating stock after booking product-after order
				    product[i].setQuantity(product[i].getQuantity()-quantity);
					order[orderIndex]=new OrderDetails(orderId,product[i].getId(),name, product[i].getBrand(), 
							quantity, total);
				    orderIndex++;
				    orderId++;
				    break;
				}
				else
					System.out.println("stock is not avaible in shopping kart!!");
			}
			}
		}
		else
			System.out.println("No such product available in shopping kart!!");
	}

	//this method is responsible to display all order details
	static void showAllOrder()
	{
		System.out.println("Order History!!");
		for(int i=0;i<orderIndex;i++)
	{
		System.out.println("Order Id: "+order[i].getOrderId());
		System.out.println("Produc tName: "+order[i].getProductname());
		System.out.println("Product Brand: "+order[i].getBrand());
		System.out.println("Order Quantity: "+order[i].getQuntity());
		System.out.println("order Amount: "+order[i].getTotalamount());
		System.out.println("============================================");
	}
		
		}

	//this method is responsible to update product details by product id
	static void updateProductById()
	{
		boolean status=false;
		System.out.println("Enter product id to update product details");
		int id=sc.nextInt();
		for(int i=0;i<index;i++)
		{
			if(id==product[i].getId())
			{
				System.out.println("Enter new Product Id:");
				int pid=sc.nextInt();
				
				sc.nextLine();//it will consume the \n character
			    
			    System.out.println("Enter new Product Name");
			    String name=sc.nextLine();
			    
			    System.out.println("Enter new Product Brand");
			    String brand=sc.nextLine();
			    
			    System.out.println("Enter new Product price");
			    double price=sc.nextInt();
			    
			    System.out.println("Enter new Stock");
			    int quantity=sc.nextInt();
			    product[i]=new Product(pid, name, brand, price, quantity);
			    System.out.println("Product has been updated successfully!!!");
			    status=true;
			}
		}
		if(status==false)
		{
			System.out.println("Product Id not found!!!");
			System.out.println("============================================");
		}
	}

	//this method is responsible to delete product by product id
	static void deleteProductById()
	{
		boolean status=false;
		System.out.println("Enter product id to delete product details");
		int id=sc.nextInt();
		for(int i=0;i<index;i++)
		{
			if(id==product[i].getId())
			{
				for(int j=i;j<index-1;j++) {
					product[j]=product[j+1];
				}
				index--;
				System.out.println("Product Item deleted Successfully!!!");
				status=true;
				break;
			}
			
		}
		if(status==false)
		{
			System.out.println("Product Id not found!!!");
			System.out.println("============================================");
		}
	}

	//this method is responsible to cancel order
	static void cancelOrder()
	{
		boolean status=false;
		System.out.println("Enter Order id to cancel the  product");
		int OId=sc.nextInt(); //1
		for(int i=0;i<orderIndex;i++)
		{
			if(OId==order[i].getOrderId()) //1==order[0]1
			{
				//loop for increasing product stock
				for(int k=0;k<index;k++) //loop for product
				{
					if(product[k].getId()==order[i].getOrderId())
					{
						//increasing the stock in product array
						product[k].setQuantity(product[k].getQuantity()+
								order[i].getQuntity());
					}
				}
				
				//loop to delete order details from an array
				for(int j=i;j<orderIndex-1;j++) {
					order[j]=order[j+1];
				}
				orderIndex--;
				System.out.println("Order cancelled Successfully!!!");
				status=true;
				break;
			}
			
		}
		if(status==false)
		{
			System.out.println("Order Id not found!!!");
			System.out.println("============================================");
		}
	}
	}
	

