package pack3;

import java.util.Scanner;
@SuppressWarnings("serial")
class UnderAgeException extends Exception
{
	UnderAgeException()
		{
		
			super("you are under age");
		}

	UnderAgeException(String msg)
		{
		
			super(msg);
		}
}
public class CreatecheckedException {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		try
		{
		if(age<18)
		{
			throw new UnderAgeException("You are not able to vote .");
		}
		else
		{
			System.out.println("you can vote successfully:");
		}
	    }
		catch(UnderAgeException ab)
		{
			//System.out.println("you are not eligible to vote:");
			ab.toString();
		}
	   System.out.println("Hello");
	   sc.close();

	}

}
