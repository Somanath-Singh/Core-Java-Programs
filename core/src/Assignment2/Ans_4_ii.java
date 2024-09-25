package Assignment2;

import java.util.Scanner;

public class Ans_4_ii {

	public static void main(String[] args) {

		int x,n;
	    //x-x3/3! + x5/5!-x7/7!+------+xn/n!
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x::");
		x=sc.nextInt();
		System.out.println("Enter value of n::");
		n=sc.nextInt();
		double sum=x;
		
		for(int i=2,j=3;i<=n;i++,j=j+2){
			int fact=1;
			
			if(i%2==0)
			{
				for(int k=j;k>=1;k--) {
					   fact=fact*k;
					  }	
					sum=(double)(sum-((Math.pow(x, j))/fact));
					System.out.println(fact);
					System.out.println(Math.pow(x, j));
			}
			else
			{
				for(int k=j;k>=1;k--) {
					   fact=fact*k;
					  }
					sum=(double)(sum+((Math.pow(x, j))/fact));
					System.out.println(fact);
					System.out.println(Math.pow(x, j));
			}	
		}		
		System.out.println("x-x3/3! + x5/5!-x7/7!+------+xn/n!  :  "+ ""+sum);

	}

}
