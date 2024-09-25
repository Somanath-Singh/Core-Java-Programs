package pack3;

import java.util.Scanner;

@SuppressWarnings("serial")
class YoungerAgeException extends RuntimeException{

	YoungerAgeException(String msg)
		{
		
			super(msg);
		}

}
class CreatingCustomizedException
{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//It may occur exception 
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		if(age<18)
		{
			throw new YoungerAgeException("you are not eligible for voting:");
		}
		else
		{
			System.out.println("you can vote successfully:");
		}
	   System.out.println("Hello");
	   sc.close();*/
		//hear exception handled
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		try
		{
		if(age<18)
		{
			throw new YoungerAgeException("you are not eligible for voting:");
		}
		else
		{
			System.out.println("you can vote successfully:");
		}
	    }
		catch(YoungerAgeException e)
		{
			System.out.println("you are not eligible to vote:");
			e.getMessage();
		}
	   System.out.println("Hello");
	   sc.close();
		
	}
}
