package lab.nt.record;

import java.util.Scanner;

public class Lab_6 {

	public static void main(String[] args) {
		
		int c,cpp,java,pyt,total;
		char gc,gcpp,gjava,gp;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mark of c:");
		c=sc.nextInt();
		System.out.println("Enter mark of cpp:");
		cpp=sc.nextInt();
		System.out.println("Enter mark of java:");
		java=sc.nextInt();
		System.out.println("Enter mark of pyt:");
		pyt=sc.nextInt();
		
		if(c>=90&&c<=99) {
			gc='O';
		}
		else if(c>=80&&c<=89) {
			gc='E';
		}
		else if(c>=70&&c<=79) {
			gc='A';
		}
		else if(c>=60&&c<=69) {
			gc='B';
		}
		else if(c>=50&&c<=59) {
			gc='C';
		}
		else if(c>=40&&c<=49) {
			gc='D';
		}
		else {
			gc='F';
		}
		//cpp
		if(cpp>=90&&cpp<=99) {
			gcpp='O';
		}
		else if(cpp>=80&&cpp<=89) {
			gcpp='E';
		}
		else if(c>=70&&cpp<=79) {
			gcpp='A';
		}
		else if(cpp>=60&&cpp<=69) {
			gcpp='B';
		}
		else if(cpp>=50&&cpp<=59) {
			gcpp='C';
		}
		else if(cpp>=40&&cpp<=49) {
			gcpp='D';
		}
		else {
			gcpp='F';
		}
		//java
		if(java>=90&&java<=99) {
			gjava='O';
		}
		else if(java>=80&&java<=89) {
			gjava='E';
		}
		else if(java>=70&&java<=79) {
			gjava='A';
		}
		else if(java>=60&&java<=69) {
			gjava='B';
		}
		else if(java>=50&&java<=59) {
			gjava='C';
		}
		else if(java>=40&&java<=49) {
			gjava='D';
		}
		else {
			gjava='F';
		}
		
		//python
		if(pyt>=90&&pyt<=99) {
			gp='O';
		}
		else if(pyt>=80&&pyt<=89) {
			gp='E';
		}
		else if(pyt>=70&pyt<=79) {
			gp='A';
		}
		else if(pyt>=60&&pyt<=69) {
			gp='B';
		}
		else if(pyt>=50&&pyt<=59) {
			gp='C';
		}
		else if(pyt>=40&&pyt<=49) {
			gp='D';
		}
		else {
			gp='F';
		}
		
		System.out.println("Grade of c language "+gc);
		System.out.println("Grade of cpp language "+gcpp);
		System.out.println("Grade of java language "+gjava);
		System.out.println("Grade of python language "+gp);
		
		total=c+cpp+java+pyt;
		avg=(total*100/400);
		System.out.println(avg);
		System.out.println("Total mark of 4 subject is "+total);
		if(avg>80) {
			System.out.println("1st Division");
		}
		else if(avg>50 && avg<=80) {
			System.out.println("2nd Division");
		}
		else if(avg>35 && avg<=50) {
			System.out.println("3rd Division");
		}
		else {
			System.out.println("Fail");
		}
	}

}
