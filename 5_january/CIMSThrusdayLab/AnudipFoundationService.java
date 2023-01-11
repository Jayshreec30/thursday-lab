package CIMSThrusdayLab;

import java.util.Scanner;
import java.util.Set;

import CollectionFramework.AnudipFoundationMenu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.*;
public class AnudipFoundationService {
	
	static ArrayList <StudentDetailsAnudip>  student = new ArrayList<StudentDetailsAnudip>();
	static Scanner sc = new Scanner (System.in);
	static int batchId = 1000;
	static ArrayList<Batch> batches = new ArrayList<Batch>();
	static Set<StudentDetailsAnudip> StudentDetails = new HashSet<StudentDetailsAnudip>();
	
	
	static void studentDets() throws GlobalExceptionAnudip 
	{
		 String course;
	     String name;
	     String email;
		 long phone;
		 int id;
		 
		 /*int limit = 3;
		 
		 if(student.size()<limit)
		 {*/
		 
		 System.out.println("Enter your course: ");
		 course = sc.nextLine();
		 
		 if (course.equalsIgnoreCase("Java")||(course.equalsIgnoreCase("Java full stack developer"))||(course.equalsIgnoreCase("Java full stack "))||
				 (course.equalsIgnoreCase("AWS"))||(course.equalsIgnoreCase("Amazon Web Services")))
		 {
		 
		 id = AnudipFoundationService.createStudentId();
		 System.out.println("Your assigned Id is: "+id);
		     
		 System.out.println("Enter your name: ");
		 name =  sc.nextLine();
		 
		 System.out.println("Enter your email: ");
		 email = sc.nextLine();
		 
		 System.out.println("Enter your phone no: ");
		 phone = sc.nextLong();
		 
		 student.add(new StudentDetailsAnudip(id,course,name,email,phone));
		 
		 sc.nextLine();
		 
		 System.out.println(" ");
		 System.out.println("Registration has been done sucessfully!");
		 System.out.println("=======================================================================================");
		 }
		 
		 else 
			 throw new GlobalExceptionAnudip("Error! No other courses are available.");
		 System.out.println(" ");
		 System.out.println("---------------------------------------------------------------------------------------");
		 
	}
		/* else 
			 System.out.println("Limit is 3");*/
		 
		
	 static int studentId = 1;
	 static int createStudentId()
	 {
		 return studentId++;
	 }
	
	static void feeConfirmation()
	{
		int confirmation;
		System.out.println("Please update your fee details here: ");
		
		System.out.println(" ");
		
		System.out.println("Enter 1. For confirming,fee status as sucessful.\n" + "Enter 2. For going back to the main menu\n");
		
		Scanner sc = new Scanner(System.in);
		confirmation = sc.nextInt();
		
		if (confirmation == 1)
		{
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println("Congratulations ! You have sucessfully enrolled in the course.");
            System.out.println(" ");
			//System.out.println("Your batch code is: "+AnudipFoundationService.batchCodeGeneration());
			System.out.println(" ");
			System.out.println("Course details are as follows: ");
			System.out.println("---------------------------------------------------------------------------------------");
	
			
			for(int i=0;i<student.size();i++)
			{
				//System.out.println("Assigned Student Id : "+AnudipFoundationService.createStudentId()); 
				System.out.println("Assigned Student Id: "+student.get(i).getId());
				System.out.println("Enrolled Cousre: "+student.get(i).getCourse());
				System.out.println("Student's Name: "+student.get(i).getName());
				System.out.println("Student's Email Id: "+student.get(i).getEmail());
				System.out.println("Student's Phone no: "+student.get(i).getPhone());
				System.out.println("---------------------------------------------------------------------------------------");
			}
		}
		else if (confirmation == 2)
		{
			AnudipFoundationMenu.menu();
		}
		else
			System.out.println("Please put in the correct choice!");
	}
	
	
	//Update details using Id
	
	static void updateDetailsById (int Id) throws GlobalExceptionAnudip
	{
	 boolean status = false;
	 
	 for(int i=0;i<student.size();i++)
	 {
		if (Id == student.get(i).getId())
		{
			 System.out.println("Enter new Id: ");
			 int id = sc.nextInt();
			 sc.nextLine();
			 
			 System.out.println("Enter new course name: ");
			 String course = sc.nextLine();
			 
			 System.out.println("Enter your new name: ");
			 String  name =  sc.nextLine();
			 
			 System.out.println("Enter your new email: ");
			 String email = sc.nextLine();
			 
			 System.out.println("Enter your new phone no: ");
			 long phone = sc.nextLong();
			 
			 student.set(i, new StudentDetailsAnudip(id,course,name,email,phone));
			 
			 System.out.println("Student's detail has been updated sucessfully!");
			 status = true;
		}
	 }
	 if (status == false)
	 {
		 throw new GlobalExceptionAnudip("No Student's details bearing such Id can be found");
	 }
	 
	}
	

	
	static String batchCodeGeneration()
	{
	String s=String.valueOf(batchId);
	String batch = "ANP-C"+ s;
	batchId++;

	return batch;
	}
	
	
	static void createBatch()
	{
		String batchCode;
		String duration;
		LocalDate startDate;
		LocalDate endDate;
		
		batchCode = AnudipFoundationService.batchCodeGeneration();
		//System.out.println(batchCode);
		
		System.out.println("enter batch duration:");
		duration=sc.nextLine();
		System.out.println("enter batch start Date:");//2016-08-31
		startDate=LocalDate.parse(sc.nextLine());
		System.out.println("enter batch End Date:");
		endDate=LocalDate.parse(sc.nextLine());
		batches.add(new Batch(batchCode, duration, startDate, endDate));
		sc.nextLine();
		System.out.println("Batch created sucessfully.");
		System.out.println("Batch code is: "+batchCode);
		
		
		
	}
	
	static void showAllStudentDetails()
	{
		for(int i=0;i<student.size();i++)
		{
			//System.out.println("Assigned Student Id : "+AnudipFoundationService.createStudentId()); 
			System.out.println("Assigned Student Id: "+student.get(i).getId());
			System.out.println("Enrolled Cousre: "+student.get(i).getCourse());
			System.out.println("Student's Name: "+student.get(i).getName());
			System.out.println("Student's Email Id: "+student.get(i).getEmail());
			System.out.println("Student's Phone no: "+student.get(i).getPhone());
			System.out.println("---------------------------------------------------------------------------------------");
		}
	}
	
	
	static void assignStudentToBatch(Batch b)throws GlobalExceptionAnudip
	{
		boolean status=false;
		System.out.println("Enter Student Id:");
	int sId=sc.nextInt();
		for(int j=0;j<student.size();j++)
		{
			if(sId==student.get(j).getId())
			{
			StudentDetails.add(student.get(j));
//			if(b.getStudents().size()<=50) {
			b.setStudents(StudentDetails);
			status=true;
			break;
			}
//			}
//			else
//				System.out.println("Limits exceed!!no more students are allowed in this batch");
//			}
			
		}
		if(status==false)
		{
			throw new GlobalExceptionAnudip("Sorry Student id not found!");
		}
	}
	
	static void assignStudents() throws GlobalExceptionAnudip 
	{
		sc.nextLine();
		System.out.println("Enter Batch Code:");
		String batchCode=sc.nextLine();
		
		
		for(int i=0;i<batches.size();i++)
		{
			if(batchCode.equalsIgnoreCase(batches.get(i).getBatchId()))
			{
				Batch batch=batches.get(i);
				assignStudentToBatch(batch);
			}
		}
	}
	
	
	static void checkBatchWiseStudentsDetails()
	{
		sc.nextLine();
		System.out.println("Enter Batch Code:");
		String batchCode=sc.nextLine();
		for(int i=0;i<batches.size();i++)
		{
			if(batchCode.equalsIgnoreCase(batches.get(i).getBatchId()))
			{
				
			    //fetching all student details of specific batch
				Set<StudentDetailsAnudip> allStudents=batches.get(i).
						getStudents();
				//for students list
				Iterator itr=allStudents.iterator();
				while(itr.hasNext())
				{
					StudentDetailsAnudip sd=(StudentDetailsAnudip) itr.next();
					System.out.println("Student id: "+ sd.getId());
					System.out.println("Student Name: "+ sd.getName());
					System.out.println("Student Email id: "+ sd.getEmail());
					System.out.println("Student Contact No: "+ sd.getPhone());
					System.out.println("Enrolled Course: "+ sd.getCourse());
				}
			}
	}
		}
}
 