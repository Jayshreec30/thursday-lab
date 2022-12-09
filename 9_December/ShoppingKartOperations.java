package shoppingKartusingarray;

import java.util.Scanner;

public class ShoppingKartOperations {
static void Allmenus() 
{
	int choice;
	Scanner sc=new Scanner(System.in);
	//ProductService productService=new ProductService();
	while(true) 
	{
		System.out.println("==========================================");
		System.out.println("Enter 1. for Admin Panel\n"
				+"Enter 2. For USerPanel\n"
				+"Enter 3.For Quit");
		System.out.println("==========================================");
		choice=sc.nextInt();
		System.out.println("===========================================");
		switch(choice) 
		{
		case 1:
			 AdminPanel.adminOperation();
			 System.out.println("=======================================");
			 break;
		case 2:
			UserPanel .UserOperation();
			System.out.println("=========================================");
			break;
		case 3:System.exit(0);
		}
	}
	 
}

	}

