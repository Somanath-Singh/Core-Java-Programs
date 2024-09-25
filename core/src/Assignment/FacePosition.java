package Assignment;

import java.util.Scanner;

public class FacePosition {

	public static void main(String[] args) {

		int num,r1,r2,r3,r4;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entera a four digit no :");
		num=sc.nextInt();
		
		r4=num%10;
		num=num/10;
		r3=num%10;
		num=num/10;
		r2=num%10;
		num=num/10;
		r1=num%10;
		num=num/10;
		
		System.out.println("Value "+r1+" is present at 1st place .");
		System.out.println("Value "+r2+" is present at 10th place .");
		System.out.println("Value "+r3+" is present at hundred place .");
		System.out.println("Value "+r4+" is present at thousand place .");
		
		sc.close();
	}

}
