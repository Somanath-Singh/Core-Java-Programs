package Assignment;

import java.util.Scanner;

public class SumOfCorrespondingDigits {

	public static void main(String[] args) {
	
		int n1,n2,r1,r2,sum;
		sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two four digit no :");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		int r = n1%10;
		r1=(r%2==0)?r:0;
		n1=n1/10;
		r=n2%10;
		r2=(r%2==0)?0:r;
		n2=n2/10;
		sum=sum+r1*r2;
		
		r = n1%10;
		r1=(r%2==0)?r:0;
		n1=n1/10;
		r=n2%10;
		r2=(r%2==0)?0:r;
		n2=n2/10;
		sum=sum+r1*r2;
		
		r = n1%10;
		r1=(r%2==0)?r:0;
		n1=n1/10;
		r=n2%10;
		r2=(r%2==0)?0:r;
		n2=n2/10;
		sum=sum+r1*r2;
		
		r = n1%10;
		r1=(r%2==0)?r:0;
		n1=n1/10;
		r=n2%10;
		r2=(r%2==0)?0:r;
		n2=n2/10;
		sum=sum+r1*r2;
		
		System.out.println("sum of product of corresponding digits of two any 4 digit number is="+sum);
		
		sc.close();

	}

}
