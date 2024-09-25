package Assignment2;

import java.util.Scanner;

public class Asn_v {

	public static void main(String[] args) {
		
		int n,r,sume,sumo,count1,count2;
		double avg1,avg2,diff;
		sume=0;
		sumo=0;
		count1=0;
		count2=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		n=sc.nextInt();
		
		while(n!=0) {
			r=n%10;
			
			if(r%2==0) {
				if(!(r%4==0)) {
					sume=sume+r;
					count1++;
				}
			}
			else {
				if(!(r%3==0)) {
					sumo=sumo+r;
					count2++;
				}
			}
		n=n/10;
		}
		System.out.println(sume);
		System.out.println(sumo);
		System.out.println(count1);
		System.out.println(count2);
		diff=(double)((sume/count1)-(sumo/count2));
		System.out.println("Difference between average :"+diff);
	}

}
