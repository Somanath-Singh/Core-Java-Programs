package Assignment;

import java.util.Scanner;

public class Assignment6g {

	public static void main(String[] args) {

		int n,m,r = 0,r1,r2,r3,r4,sum;
		sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two four digit no :");
		n=sc.nextInt();
		m=sc.nextInt();
		
		r=n%10;
		r1=(r%2==0)?r:1;
		n=n/10;
		
		r=n%10;
		r2=(r%2==0)?r:1;
		n=n/10;

	}

}
