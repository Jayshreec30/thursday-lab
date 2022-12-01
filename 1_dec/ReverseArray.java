package arrayexamples;

import java.util.Scanner;

public class ReverseArray 
{

	public static void main(String args[]) {
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
    for(i=0;i<size;i++) {
    	System.out.print(arr[i]+" ");
    }
    System.out.println("\n   ");
    System.out.print("Disply reverse array: ");
    for(i=arr.length-1;i>=0;i--) {
    	System.out.print(arr[i]+" ");
    }
    
}
}