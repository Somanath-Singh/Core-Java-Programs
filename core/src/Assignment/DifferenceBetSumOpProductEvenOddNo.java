package Assignment;

import java.util.Scanner;

public class DifferenceBetSumOpProductEvenOddNo {

	public static void main(String[] args) {

		int n,m,r = 0,r1,r2,r3,r4,sum1,sum2,diff;
		sum1=0;
		sum2=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a four digit no :");
		n=sc.nextInt();
		m=n;
		
		r=n%10;
		r1=(r%2==0)?(((r%2!=0)&&(r%6!=0))?r:1):1;
		n=n/10;
		
		r=n%10;
		r2=(r%2==0)?(((r%2!=0)&&(r%6!=0))?r:1):1;
		n=n/10;
		
		sum1=((r1%2==0)&&(r2%2==0))?(sum1+r1*r2):sum1 ;
		
		r=n%10;
		r3=(r%2==0)?(((r!=2)&&(r!=6))?r:1):1;
		n=n/10;
		
		sum1=((r2%2==0)&&(r3%2==0))?(sum1+r2*r3):sum1 ;

		r=n%10;
		r4=(r%2==0)?(((r!=2)&&(r!=6))?r:1):1;
		n=n/10;
	
		sum1=((r3%2==0)&&(r4%2==0))?(sum1+r3*r4):sum1 ;
		
		System.out.println("sum of consecutive even no is="+sum1);
		
		r=m%10;
		r1=(r%2==0)?0:((r!=3)&&(r!=7))?r:0;
		m=m/10;
		
		r=m%10;
		r2=(r%2==0)?0:((r!=3)&&(r!=7))?r:0;
		m=m/10;
		
		sum2=((r1%2==0)&&(r2%2==0))?sum2:(sum2+r1*r2) ;
		
		r=m%10;
		r3=(r%2==0)?0:((r!=3)&&(r!=7))?r:0;
		m=m/10;
		
		sum2=((r2%2==0)&&(r3%2==0))?sum2:(sum2+r2*r3) ;

		r=m%10;
		r4=(r%2==0)?0:((r!=3)&&(r!=7))?r:0;
		m=m/10;
	
		sum2=((r3%2==0)&&(r4%2==0))?sum2:(sum2+r3*r4) ;
		
		System.out.println("sum of consecutive odd no is="+sum2);
		
		diff=sum1-sum2;
		diff=(diff<0)?-diff:diff;
		
		System.out.println("Difference between Sum of product of consecutive even digits and Sum of product of consecutive odd digits="+diff);
		sc.close();

	}

}
