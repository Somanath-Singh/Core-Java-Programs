package core2;

abstract class A
{
	abstract void display1();
}

abstract class B extends A
{
	void display1()
	{
		System.out.println("Method of class A");
	}
	abstract void show1();
}

class C extends B
{
	void show1()
	{
		System.out.println("Method of class B");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C ob=new C();
		ob.display1();
		ob.show1();

	}
}
