package Assignment;

import java.util.Scanner;

public class Biodata {

	public static void main(String[] args) {

		String name;
		String gen;
		int age;
		String home;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name :");
		name=sc.nextLine();
		System.out.println("Enter your gender :");
		gen=sc.next();
		System.out.println("Enter your age :");
		age=sc.nextInt();
		System.out.println("Enter your home town :");
		home=sc.next();
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Gender="+gen);
		System.out.println("Home town="+home);
		
		//close the stream
		sc.close();

	}

}
