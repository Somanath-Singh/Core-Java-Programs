package core2;


interface A1
{
	void displayA1();
}

interface B1
{
	void displayB1();
}

class AB1 implements A1,B1
{
	public void displayA1()
	{
		System.out.println("Method of class A1");
	}
	public void displayB1()
	{
		System.out.println("Method of class B1");
	}
}
public class InterfaceClass {

	public static void main(String[] args) {
		
		AB1 a=new AB1();
		a.displayA1();
		a.displayB1();
		
	}

}
