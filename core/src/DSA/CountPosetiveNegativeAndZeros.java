package DSA;

import java.util.Scanner;

public class CountPosetiveNegativeAndZeros {

	public static void main(String[] args) {

		long num,rem,plus=0,minus=0,zero=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		num=sc.nextLong();
		
		while(num!=0) {
			
			rem=num%10;
			
			if(rem<0) {
				minus++;
			}
			else if(rem>0) {
				plus++;
			}
			else {
				zero++;
			}
			num=num/10;
			
		}
		
		System.out.println("Posetive no count is::"+plus);
		System.out.println("Negative no count is::"+minus);
		System.out.println("Zero count is::"+zero);
		
		

	}

}
