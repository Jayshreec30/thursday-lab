package string;

import java.util.Scanner;

public class SearchChrInString {
	
	
	public static void main(String[] args) {
	    String input;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		input=sc.nextLine();
		System.out.println("Enter the char in  String: ");
	    ch=sc.next().charAt(0);
	    for(int i=0;i<input.length();i++) {
	    	if(input.charAt(i)==ch) 
	    	{
	    		System.out.println(ch+"is present in"+input);
	    	}
	    	 break;
	    }
	    System.out.println(ch+"is not present in"+input);
	}
}
