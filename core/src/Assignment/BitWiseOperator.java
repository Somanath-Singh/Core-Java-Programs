package Assignment;

import java.util.Scanner;

public class BitWiseOperator {

	public static void main(String[] args) {
		
		int n,r4,r2,AND,OR,XOR;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a four digit no :");
		n=sc.nextInt();
		
		r4=n%10;
		n=n/10;
		n=n/10;
		r2=n%10;
		
		AND=r4&r2;
		OR=r4|r2;
		XOR=r4^r2;
		
		System.out.println("AND="+AND+"\nOR="+OR+"\nXOR="+XOR);
	}

}
