package Assignment2;

import java.util.Scanner;

public class Ass_1_i {

	public static void main(String[] args) {
	
		int n,r,sum;
		sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		
		n=sc.nextInt();
		
		while(n!=0) {
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("sum of all no:"+sum);
		sc.close();
	}

}
