package core1;

class Demo1
{
	static int a=12;
	static void show()
	{
		System.out.println("a="+a);
	}
}
public class StaticBlock {

	public static void main(String[] args) {
		
		System.out.println("value of a in main method="+Demo1.a);
		Demo1.show();//static method call using class name
	}

}
