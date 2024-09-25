package Assignment;

import java.util.Scanner;

public class SumOfAllEvenDigit {

	public static void main(String[] args) {

		int n,r,sum;
		sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a four digit no :");
		n=sc.nextInt();
		
		r=n%10;
		r=(r%2==0)?r:0;
		n=n/10;
		sum=sum+r;
		
		r=n%10;
		r=(r%2==0)?r:0;
		n=n/10;
		sum=sum+r;
		
		r=n%10;
		r=(r%2==0)?r:0;
		n=n/10;
		sum=sum+r;
		
		r=n%10;
		r=(r%2==0)?r:0;
		n=n/10;
		sum=sum+r;
		
		System.out.println("sum of all even no :"+sum);
	}

}
