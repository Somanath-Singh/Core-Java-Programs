package Assignment2;

import java.util.Scanner;

public class Ans_4_i {

	public static void main(String[] args) {

		//1-x2/2! + x3/3!-x4/4!+------+xn/n!
		
		int x,n;
		double sum=1;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x::");
		x=sc.nextInt();
		System.out.println("Enter value of n::");
		n=sc.nextInt();
		
		for(int i=2;i<=n;i++) {
			
			int fact=1;

			if(i%2==0) {
				
				for(int j=i;j>=1;j--) {
					fact=fact*j;
				}
				sum=(double)(sum-((Math.pow(x, i))/fact));
			}
			else {
				
				for(int j=i;j>1;j--) {
					fact=fact*j;
				}
				sum=(double)(sum+((Math.pow(x, i))/fact));
			}
	
		}
		System.out.println("1-x2/2! + x3/3!-x4/4!+------+xn/n!  :  "+ ""+sum);
		sc.close();
	}

}
