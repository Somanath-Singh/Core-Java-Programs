package lab.nt.record;

import java.util.Scanner;

public class Lab_5 {

	public static void main(String[] args) {
		
		int n,c1,c2,c3,r,avg1 ,avg2,avg3,se,so,sp,diff,fact;
		se=0;
		so=0;
		sp=0;
		avg1=0;
		avg2=0;
		avg3=0;
		fact=1;
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a no of any digit :");
	n=sc.nextInt();
	c1=0;c2=0;c3=0;

	while(n!=0) {	
		r=n%10;
		if(r%2  == 0)
		{
			se=se+r;
			c1++;
		}	
		else
		{
			so=so+r;
			c2++;
		}	
		int temp=0;
		for(int i=1; i<=r; i++) {
				if(r%i==0) {
					temp++;					
				}
			}
			if(temp==2) {
				sp=sp+r;
				c3++;
			}
		
		n=n/10;
	}
	if(c1!=0) {
		avg1 = se/c1;
	}
	if(c2!=0) {
		avg2 = so/c2;
	}
	if(c3!=0) {
		avg3 = sp/c3;
	}
	
	diff = avg1+avg2-avg3;
	
	//factorial
	for(int i=diff;i>=1;i--) {
		fact=fact*i;
	}
	
	System.out.println("Factorial of no is :"+fact);
	}
}