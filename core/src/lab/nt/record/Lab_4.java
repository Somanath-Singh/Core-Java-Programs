package lab.nt.record;

import java.util.Scanner;

public class Lab_4 {

	public static void main(String[] args) {

		int n1,n2,r1,r2,sum;
		sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two no of any digit :");
	n1=sc.nextInt();
	n2=sc.nextInt();
	
	//even sum
	while(n1!=0) {	
		r1=n1%10;
		n1=n1/10;	
		r2=n1%10;
		if(((r1%2  == 0)&&(r1!=0)&&(r1!=6))&&((r2%2  == 0)&&(r2!=0)&&(r2!=6)))
		{
			sum=sum+r1*r2;
		}		
	}
	System.out.println("Sum of product of even no of any digit is "+sum);
	
	//reinitialize
	sum=0;
	r1=0;
	r2=0;
	
	//odd sum
	while(n2!=0) {	
		r1=n2%10;
		n2=n2/10;	
		r2=n2%10;
		if(((r1%2  != 0)&&(r1!=1)&&(r1!=5))&&((r2%2  != 0)&&(r2!=1)&&(r2!=5)))
		{
			sum=sum+r1*r2;
		}		
	}
	System.out.println("Sum of product of odd no of any digit is "+sum);
	}
}