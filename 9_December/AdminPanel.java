package shoppingKartusingarray;

import java.util.Scanner;

public class AdminPanel {
	//this class is for all admin operations
 

	static	Scanner sc=new Scanner(System.in);

	//all admin operations listed here
		static void adminOperation()
		{
			while(true) {
				 System.out.println("Enter 1. for Add Product\n"+
		                  "Enter 2. for Update product\n"
					      + "Enter 3. for delete product\n"
					      +"Enter 4 for show all products\n"
					      +"Enter 5.for show product by Id\n"
					+"Enter 6 for show all orders\n"
					      +"Enter 7. for go back to the main menu");
		 System.out.println("============================================");
		 System.out.println("Enter your choice");
		int choice=sc.nextInt();
		 System.out.println("============================================");
			
	       switch(choice)
	        {
	       case 1:
	    	      ProductService.createProduct();
	             System.out.println("============================================");
	             break;
	             
	       case 2:ProductService.updateProductById();
	   	       System.out.println("============================================");
	   	       break;
	   	
	       case 3:ProductService.deleteProductById();
		  	       System.out.println("============================================");
		  	       break;
		  	
	       case 4:
		         ProductService.getAllProduct();
	            System.out.println("============================================");
	            break;
	           
	       case 5:ProductService.getProductById();
	             System.out.println("============================================");
	              break;

	       case 6:ProductService.showAllOrder();
	   	System.out.println("============================================");
	   	break;
	 	           
	   	case 7:ShoppingKartOperations.Allmenus();
	     }
		 }
		 
			
		}
	}

