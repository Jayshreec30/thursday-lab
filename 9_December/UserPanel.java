package shoppingKartusingarray;

import java.util.Scanner;

public class UserPanel 
{
	//this class is for user menus
 
		static	Scanner sc=new Scanner(System.in);

		//this method is listed all user menu
		static void UserOperation()
		{
			System.out.println("============================================");
			
			while(true) {
	        System.out.println("press 1. for book products\n"
		+ "Enter 2. for cancel product\n"
	       +"Enter 3 for go back to the main menu");

	     System.out.println("============================================");
	     System.out.println("Enter your choice");
	      int choice=sc.nextInt();
	     System.out.println("============================================");
	 
	    switch(choice)
	     {
	     
	     case 1:
	    	 ProductService.bookProduct();
	 	     System.out.println("============================================");
	 	     break;
	     case 2:ProductService.cancelOrder();
	 	    System.out.println("============================================");
	 	   break;
	   	case 3:	ShoppingKartOperations.Allmenus();    	
	 	
	     }
	 }
	 
		}
	}
	

