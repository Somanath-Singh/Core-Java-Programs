package Assignment2;

import java.util.Scanner;

public class Ans_4_iv {

	public static void main(String[] args) {
	
		//x-x3/3! + x5/5!-x7/7!+x11/11!------+xn/n!
		int x,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x::");
		x=sc.nextInt();
		System.out.println("Enter value of n::");
		n=sc.nextInt();
		double sum=x;
		int temp=1;
		
		for(int i=2,j=3;i<=n;i++,j=j+2){
			int fact=1;
			
			if(i%2==0)
			{
				for(int k=j;k>=1;k--) {
					   fact=fact*k;
					  }	
					sum=(double)(sum-((Math.pow(x, j))/fact));
					temp++;
					System.out.println(fact);
					System.out.println(Math.pow(x, j));
					System.out.println(j);
			}
			else
			{
				for(int k=j;k>=1;k--) {
					   fact=fact*k;
					  }
					sum=(double)(sum+((Math.pow(x, j))/fact));
					temp++;
					System.out.println(fact);
					System.out.println(Math.pow(x, j));
					System.out.println(j);
			}	
			
			if(temp==4) {
				j=j+2;
				temp=1;
			}
		}		
		System.out.println("x-x3/3! + x5/5!-x7/7!+------+xn/n!  :  "+ ""+sum);
	}

}
