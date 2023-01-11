package CIMSThrusdayLab;

import java.util.Scanner;

import CollectionFramework.AnudipFoundationMenu;
public class AnudipFoundationOperations {
	
	public static void coursePanel()
   {
	    int choice;
		Scanner sc = new Scanner (System.in);
		System.out.println("Please select the course you wish to enroll for:");
		System.out.println(" ");
		
		do
		{
			System.out.println("Enter 1. For Java Full Stack Developer Course\n" + "Enter 2. For AWS course\n"
		                     + "Enter 3. To go back to the main menu\n");

			System.out.println("=======================================================================================");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			System.out.println(" ");
			System.out.println("=======================================================================================");
			
			

			switch (choice) {

			case 1: System.out.println("Welcome, please fill in the necessary details: ");
			System.out.println(" ");	//AnudipFoundationService.studentDets();
			
			try
			{
				AnudipFoundationService.studentDets();
			}
			catch (GlobalExceptionAnudip e)
			{
				System.out.println(e.getMessage());
			}
			break;
				
			case 2:	System.out.println("Welcome, please fill in the necessary details: ");
			System.out.println(" ");
			//AnudipFoundationService.studentDets();
			try
			{
				AnudipFoundationService.studentDets();
			}
			catch (GlobalExceptionAnudip e)
			{
				System.out.println(e.getMessage());
			}
			break;
			
			case 3: AnudipFoundationMenu.menu();
			
			default:
				System.out.println("Please enter a correct choice from the menu!  ");
				
			}
		}
		while(choice!=3);
 }
	public static void otherPanel()
	{
		 int choice;
			Scanner sc = new Scanner (System.in);
			System.out.println("Please select the course you wish to enroll for:");
			System.out.println(" ");
			
			do
			{
				System.out.println("Enter 1. For enrolling in a course\n"+ "Enter 2. To update student details using Id\n"
			                      +"Enter 3. To create a batch\n"+"Enter 4. To assign students in the batch\n"
			                      +"Enter 5. To check student details batchwise\n"
			                      +"Enter 6. Show all student details\n"
						          +"Enter 7. To go back to the main menu\n");

				System.out.println("=======================================================================================");
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				System.out.println(" ");
				System.out.println("=======================================================================================");
				
				

				switch (choice) {

				case 1:	
					AnudipFoundationService.feeConfirmation();
					System.out.println("=======================================================================================");
					break;

				case 2: 
				System.out.println("Enter Id to update: ");
				int Id = sc.nextInt();
				try	
				{
					AnudipFoundationService.updateDetailsById (Id);
				}
				catch (GlobalExceptionAnudip e)
				{
					System.out.println(e.getMessage());
				}
				
				case 3:	
					AnudipFoundationService.createBatch();
					System.out.println("=======================================================================================");
					break;
					
				case 4:	
					try	
					{
						AnudipFoundationService.assignStudents();
					}
					catch (GlobalExceptionAnudip e)
					{
						System.out.println(e.getMessage());
					}
					System.out.println("=======================================================================================");
					break;
					
				case 5:	
					AnudipFoundationService.checkBatchWiseStudentsDetails();
					System.out.println("=======================================================================================");
					break;	
					
					
				case 6:	
					AnudipFoundationService. showAllStudentDetails();
					System.out.println("=======================================================================================");
					break;		
				
			    case 7: AnudipFoundationMenu.menu();
			    System.out.println("=======================================================================================");
			    break;
				
				default:
					System.out.println("Please enter a correct choice from the menu!  ");
					
				}
			}
			while(choice!=7);
	}
	
}
 