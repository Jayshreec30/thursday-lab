package oopsconcept;

import java.util.Scanner;

public class bank {
	public static void main(String[] args) {
		int amount,wd,d;
		Scanner cs=new Scanner(System.in);
	System.out.println("enter balance in your account");
	amount=cs.nextInt();
		System.out.println("enter ammount want you widraw");
		wd=cs.nextInt();
		if (wd<=amount) {
			System.out.println("succsefully widrawal");
		}
		else {
			System.out.println("enter lessor number ");
		}
		int av=amount-wd;
		System.out.println("current bal "+av);
		System.out.println("enter the deposite number ");
		d=cs.nextInt();
		System.out.println("deposite succsesfully ");
		System.out.println("now avalable balance is "+(av+d));
	}
}
