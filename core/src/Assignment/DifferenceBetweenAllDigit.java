package Assignment;

import java.util.Scanner;

public class DifferenceBetweenAllDigit {

	public static void main(String[] args) {

		int n,r,r1,r2,c1,c2,sum1,sum2,avg1,avg2,diff;
		sum1=0;
		sum2=0;
		c1=0;
		c2=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a four digit no :");
		n=sc.nextInt();
		
		r=n%10;
		r1=(r%2==0)?((r%4==0)?0:((c1<++c1)?r:0)):0;
		r2=(r%2==0)?0:((r%3==0)?0:((c2<++c2)?r:0));
		n=n/10;
		sum1=sum1+r1;
		sum2=sum2+r2;
		
		
		r=n%10;
		r1=(r%2==0)?((r%4==0)?0:((c1<++c1)?r:0)):0;
		r2=(r%2==0)?0:((r%3==0)?0:((c2<++c2)?r:0));
		n=n/10;
		sum1=sum1+r1;
		sum2=sum2+r2;
		
		r=n%10;
		r1=(r%2==0)?((r%4==0)?0:((c1<++c1)?r:0)):0;
		r2=(r%2==0)?0:((r%3==0)?0:((c2<++c2)?r:0));
		n=n/10;
		sum1=sum1+r1;
		sum2=sum2+r2;
		
		r=n%10;
		r1=(r%2==0)?((r%4==0)?0:((c1<++c1)?r:0)):0;
		r2=(r%2==0)?0:((r%3==0)?0:((c2<++c2)?r:0));
		n=n/10;
		sum1=sum1+r1;
		sum2=sum2+r2;
		
		System.out.println("Sum of even no = "+sum1);
		System.out.println("Sum of odd no  = "+sum2);
		
		System.out.println(c1);
		System.out.println(c2);
		
		avg1=sum1/c1;
		avg2=sum2/c2;
		
		System.out.println(avg1);
		System.out.println(avg2);
		
		diff=avg1-avg2;
		diff=(diff<0)?-diff:diff;
		
		
		System.out.println("Difference between two average = "+diff);
		
		sc.close();
	}

}
