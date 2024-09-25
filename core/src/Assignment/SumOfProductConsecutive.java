package Assignment;

import java.util.Scanner;

public class SumOfProductConsecutive {

	public static void main(String[] args) {

		int num,r1,r2,r3,r4,sum;
		sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a four digit no :");
		num=sc.nextInt();
		
		r1=num%10;
		num=num/10;
		r2=num%10;
		num=num/10;
		sum=sum+r1*r2;
		
		r3=num%10;
		num=num/10;
		sum=sum+r2*r3;
		
		r4=num%10;
		num=num/10;
		sum=sum+r3*r4;
		
		System.out.println("Sum of product of consecutive digits of any 4 digit number is="+sum);
		
		sc.close();
		

	}

}
