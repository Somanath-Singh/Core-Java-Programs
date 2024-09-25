package Assignment;

import java.util.Scanner;

public class SumOfFourNo {

	public static void main(String[] args) {

		int num,sum,r;
		sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a four digit no :");
		num=sc.nextInt();
		
		r=num%10;
		sum=sum+r;;
		num=num/10;

		r=num%10;
		sum=sum+r;
		num=num/10;
		
		r=num%10;
		sum=sum+r;
		num=num/10;
		
		r=num%10;
		sum=sum+r;
		num=num/10;
		
		System.out.println("Sum of all 4 digit no is ="+sum);
		
		sc.close();

	}

}
