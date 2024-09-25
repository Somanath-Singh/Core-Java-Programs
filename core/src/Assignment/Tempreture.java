package Assignment;

import java.util.Scanner;

public class Tempreture {

	public static void main(String[] args) {

		float cel,far;
		System.out.println("Enter tempreture in celcius:");
		Scanner sc=new Scanner(System.in);
		cel=sc.nextFloat();
		
		far=(float) ((cel*1.8)+32);
		System.out.println("Tempreture in fahrenheit:"+far);
		cel=0;
		far=0;
		
		System.out.println("Enter tempreture in fahrenheit:");
		far=sc.nextFloat();
		
		cel=(float) ((far-32)/1.8);
		
		System.out.println("Tempreture incelcius:"+cel);

		sc.close();
	}

}
