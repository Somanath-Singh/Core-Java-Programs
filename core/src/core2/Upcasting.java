package core2;

class Parent
{
	void disp()
	{
		System.out.println("parent class.");
	}
}
class Child extends Parent
{
	void disp()
	{
		System.out.println("Child class.");
	}
}

public class Upcasting {

	public static void main(String[] args) {
	
		//Parent p=(Parent)new Child();
		Parent p=new Child();
		p.disp();

	}

}
