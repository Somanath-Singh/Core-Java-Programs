package core1;


class One
{
	int p=10,q=20;
	void display1()
	{
		System.out.println("Method of class one:");
		System.out.println("value of p="+p);
		System.out.println("value of q="+q);
	}
}

class Two extends One
{
	void add()
	{
		System.out.println("Method of class two");
		int sum=p+q;
		System.out.println("Sum of p and q="+sum);
	}
}

class Three extends One
{
	void mult()
	{
		System.out.println("Method of class three");
		int mul=p*q;
		System.out.println("multiplication of p and q="+mul);
	}
}

public class HierachicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two A1=new Two();
		Three B1=new Three();
		A1.display1();
		A1.add();
		B1.display1();
		B1.mult();

	}

}
