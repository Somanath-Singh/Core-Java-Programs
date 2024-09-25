package Assignment2;

import java.util.Scanner;

public class Ass_1_ii_iii{

	public static void main(String[] args) {
			
			int n,r,sume,sumo;
			sume=0;
			sumo=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a no:");
			
			n=sc.nextInt();
			
			while(n!=0) {
				r=n%10;
			  if(r%2==0) {
				sume=sume+r;
			  }
			  else {
				  sumo=sumo+r;
			  }
				n=n/10;
			}
			System.out.println("sum of all even no:"+sume);
			System.out.println("sum of all odd no:"+sumo);
			sc.close();
		}
	}
