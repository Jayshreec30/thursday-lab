package arrayexamples;

import java.util.Scanner;

public class NegativeNumberInArrays {
	public static void main(String args[])
	{
		int arr[],size,i;
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
	    size=sc.nextInt();
	     arr=new int[size];
	    System.out.println("enter the array number: ");
	    for(i=0;i<size;i++) 
	    {
	    	  arr[i]=sc.nextInt();
	    }
	    System.out.print("Disply Array: ");
	    for(i=0;i<size;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
	    System.out.print("\n Negative Number in array:");
	    for(i = 0;i<size; i++)
	    {
	 
	      if(arr[i] <=0)
	       
	        System.out.print(arr[i]+" ");
	      }
	
	    }
}
