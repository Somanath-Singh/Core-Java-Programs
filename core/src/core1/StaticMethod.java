package core1;

class Test
{
	static int cube(int x)
	{
		return (x*x*x);
	}
}
public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=Test.cube(5);
		System.out.println("cube="+res);

	}

}
