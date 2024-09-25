package core2;


class One
{
	void display()
	{
		System.out.println("Java");
	}
}

class Two extends One
{
	void show()
	{
		System.out.println("Programmer");
	}
}

class Three extends Two
{
	void find()
	{
		System.out.println("Somanath Singh");
	}
}

class Four extends One
{
	void give()
	{
		System.out.println("Begenner is new in it field");
	}
}
public class HybrideInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Three obj=new Three();
		obj.display();
		obj.show();
		obj.find();
		Four obj1=new Four();
		obj1.display();
		obj1.give();
		

	}

}
