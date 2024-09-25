package Assignment;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {

		float p,r,t,si;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle amount :");
		p=sc.nextFloat();
		System.out.println("Enter rate of intrest :");
		r=sc.nextFloat();
		System.out.println("Enter time limit :");
		t=sc.nextFloat();
		
		si=(p*r*t)/100;
		
		System.out.println("Simple intrest is ="+si);

		//close the stream
		sc.close();
	}

}
