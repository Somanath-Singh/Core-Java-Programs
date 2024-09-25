package core1;

class A
{
	int no;
	void msg()
	{
		System.out.println("no in super class:"+no);
	}
}
 class B extends A
 {
	 int no;
	 B(int a, int b)
	 {
		 super.no=a;
		 no=b;
	 }
	 void msg()
		{
			System.out.println("no in sub class:"+no);
		}
	 void display()
	 {
		 super.msg();
		 msg();
	 }
 }
public class SuperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob2=new B(5,7);
		ob2.display();
		

	}

}
