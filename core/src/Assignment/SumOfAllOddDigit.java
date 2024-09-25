package Assignment;

import java.util.Scanner;

public class SumOfAllOddDigit {

	public static void main(String[] args) {

		int n,r,sum;
		sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Entera a four digit no :");
		n=sc.nextInt();
		
		r=n%10;
		r=(r%2==0)?0:r;
		n=n/10;
		sum=sum+r;
		
		r=n%10;
		r=(r%2==0)?0:r;
		n=n/10;
		sum=sum+r;
		
		r=n%10;
		r=(r%2==0)?0:r;
		n=n/10;
		sum=sum+r;
		
		r=n%10;
		r=(r%2==0)?0:r;
		n=n/10;
		sum=sum+r;
		
		System.out.println("sum of all odd no :"+sum);
	}

}
