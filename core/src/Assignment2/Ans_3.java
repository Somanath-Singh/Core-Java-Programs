package Assignment2;

import java.util.Scanner;

public class Ans_3 {

	public static void main(String[] args) {

		int n1,n2,r1,r2,sum;
		sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two no of same length::");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		while((n1!=0)&&(n2!=0)) {
			r1=n1%10;
			r2=n2%10;
			if((r1%2==0)&&(r2%2!=0)) {
				sum=sum+r1*r2;
			}
			n1=n1/10;
			n2=n2/10;
		}
		System.out.println("sum of product of two no is :"+sum);
	}
	
}
