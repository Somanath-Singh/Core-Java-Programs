package lab.nt.record;

import java.util.Scanner;

public class Lab_2 {

	public static void main(String[] args) {
	
		int n,r,se = 0,so = 0,diff,f;
		f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		n=sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			r=n%10;
			if(r%2==0) {
				se=se+r;
			}
			else{
				so=so+r;
			}
			n=n/10;
		}
		//difference
		diff=((se-so)<0)?-(se-so):(se-so);
		//factorial
		for(int i=diff; i>=1; i--) {
			f=f*i;
		}
		
		System.out.println(se+" "+so);
		System.out.println(diff);
		System.out.println("Factorial of no is "+f);
	}

}
