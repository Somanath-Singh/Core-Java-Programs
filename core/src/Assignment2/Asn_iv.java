package Assignment2;

import java.util.Scanner;

public class Asn_iv {
	
		public static void main(String[] args) {
			
			int n,r,sum;
			sum=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a no:");
			
			n=sc.nextInt();
			
			while(n!=0) {
				r=n%10;
				int temp=1;
				for(int i=2;i<=r;i++) {
					if(r%i==0) {
						temp++;
					}
				}

				if(temp==2) {
					sum=sum+r;
				}
				n=n/10;
			}
			System.out.println("sum of all prime no:"+sum);
			sc.close();
		}

	}

