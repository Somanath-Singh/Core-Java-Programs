package lab.nt.record;

import java.util.Scanner;

public class HybrideAtm_ManagementSystem {

	public static void main(String[] args) {
	
		int operation=0,pin,AC_no,i,j,k=0 ,depo_amt,avail_bal=0,with_amt=0;
		boolean check=true;
		Scanner sc=new Scanner(System.in);
		
		//declaration of array
		
				int info[][]=new int[5][3];
				
				info[0][0]= 111;
				info[0][1]= 6666;
				info[0][2]= 2200;
				
				info[1][0]= 112;
				info[1][1]= 1111;
				info[1][2]= 3200;
				
				info[2][0]= 113;
				info[2][1]= 3333;
				info[2][2]= 4500;
				
				info[3][0]= 114;
				info[3][1]= 4444;
				info[3][2]= 7700;
				
				info[4][0]= 115;
				info[4][1]= 5555;
				info[4][2]= 1200;
				
				int mini[][]=new int[5][3];
				System.out.println("-----------------------------------------------------------------");
		System.out.println("Welcome to hybride ATM  system");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Enter Acount no and pin :");	
		AC_no=sc.nextInt();
		pin=sc.nextInt();
		System.out.println("-----------------------------------------------------------------");
		
	while(true) {
	
		for(i=0;i<5;i++) {
			
			for(j=0;j<2;j++) {
				
				if(info[i][j]==AC_no && info[i][j+1]==pin) {
					
					System.out.println("your AC_no  and pin is :"+info[i][j] +"     "+info[i][j+1]);
					System.out.println("-----------------------------------------------------------------");
					avail_bal=info[i][2];
					System.out.println("1.Deposite money :");
					System.out.println("2.Withdraw money :");
					System.out.println("3.fast withdral  :");
					System.out.println("4.check balance :");
					System.out.println("5.change ATM pin :");
					System.out.println("6.Mini statement:");
					System.out.println("7.Exit ");
					
					System.out.println("-----------------------------------------------------------------");
					k=i;
					System.out.println("Enter your choice:");
					operation=sc.nextInt();
					System.out.println("-----------------------------------------------------------------");
					check=false;
					break;
					
				}//if
				
			}//for j
			j=0;
		}//for i
		
		if(check) {
			System.out.println("invalid user.");
		}
		
		
		switch(operation) {
		
		case 1:
			
			System.out.println("Enter deposite amount :");
			depo_amt=sc.nextInt();
			info[k][2]=info[k][2]+depo_amt;
			System.out.println("Add money successfully .");
			System.out.println("Available balance is "+info[k][2]);
			System.out.println("-----------------------------------------------------------------");
			break;
			
		case 2:
			
			System.out.println("Enter withdraw amount :");
			with_amt=sc.nextInt();
			if(info[k][2]>with_amt) {
				
				info[k][2]=info[k][2]-with_amt;
				
				System.out.println("successfuly amount withdraw .");
				System.out.println("Available balance is "+info[k][2]);
				System.out.println("-----------------------------------------------------------------");
				
			}
			else {
				System.out.println("Insufficient fund .");
				System.out.println("-----------------------------------------------------------------");
			}
			
			break;
			
		case 3:
			
			
			System.out.println("Welcome to fast withdral service  .");
			System.out.println("1. 200 ");
			System.out.println("2.  500 ");
			System.out.println("3.  1000  ");
			System.out.println("4.  5000");
			System.out.println("5.  10000");
			System.out.println("Select your withdraw option :");
			int option = sc.nextInt();
		
			System.out.println("-----------------------------------------------------------------");
			if(option==1) {
				with_amt=200;
			}
			else if(option==2){
				with_amt=500;
			}
			else if(option==3){
				with_amt=1000;
			}
			else if(option==4){
				with_amt=5000;
			}
			else if(option==5){
				with_amt=10000;
			}
			else {
				System.out.println("Enter valid choice.");
			}
			
				if(info[k][2]>with_amt) {
				
				info[k][2]=info[k][2]-with_amt;
				
				System.out.println("successfuly amount withdraw .");
				System.out.println("Available balance is "+info[k][2]);
				System.out.println("-----------------------------------------------------------------");
			}
			else {
				System.out.println("Insufficient fund .");
				System.out.println("-----------------------------------------------------------------");
			}
				
			break;
			
		case 4:
			
			System.out.println("Available balance is "+avail_bal);
			System.out.println("-----------------------------------------------------------------");
			break;
			
		case 5:
			
			System.out.println("Enter your current pin :");
			pin=sc.nextInt();
			
			if(info[k][1]==pin) {
				System.out.println("Enter your new pin :");
				pin=sc.nextInt();
				info[k][1]=pin;
				
				System.out.println("Pin change successfully .");
				System.out.println("New pin is "+info[k][1]);
				System.out.println("-----------------------------------------------------------------");
			}
			else {
				System.out.println("You have enter wrong pin");
				System.out.println("-----------------------------------------------------------------");
			}
			
			break;
		case 6:
			
				break;
				
		default:
			System.exit(0);
		}
	}

	}

}
