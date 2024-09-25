package Assignment2;

import java.util.Scanner;

public class Ans_4_iii {

	public static void main(String[] args) {

		//1+x2/2! + x4/4!+x6/6!+------+xn/n!
		int x,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x::");
		x=sc.nextInt();
		System.out.println("Enter value of n::");
		n=sc.nextInt();
		double sum=1;
		
		for(int i=2,j=2;i<=n;i++,j=j+2){
			    int fact=1;
			
				for(int k=j;k>=1;k--) {
					   fact=fact*k;
					  }	
					sum=(double)(sum+((Math.pow(x, j))/fact));
		}		
		System.out.println("1+x2/2! + x4/4!+x6/6!+------+xn/n!  :  "+ ""+sum);

	}

}
