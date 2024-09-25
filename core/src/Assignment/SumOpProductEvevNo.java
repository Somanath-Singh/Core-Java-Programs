package Assignment;

import java.util.Scanner;

public class SumOpProductEvevNo {

	public static void main(String[] args) {

		int n,r = 0,r1,r2,r3,r4,sum;
		sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a four digit no :");
		n=sc.nextInt();
		
		r=n%10;
		r1=(r%2==0)?r:1;
		n=n/10;
		
		r=n%10;
		r2=(r%2==0)?r:1;
		n=n/10;
		
		sum=((r1%2==0)&&(r2%2==0))?(sum+r1*r2):sum ;
		
		r=n%10;
		r3=(r%2==0)?r:1;
		n=n/10;
		
		sum=((r2%2==0)&&(r3%2==0))?(sum+r2*r3):sum ;

		r=n%10;
		r4=(r%2==0)?r:1;
		n=n/10;
	
		sum=((r3%2==0)&&(r4%2==0))?(sum+r3*r4):sum ;
		
		System.out.println("sum of consecutive no is="+sum);
		
		sc.close();

	}

}
