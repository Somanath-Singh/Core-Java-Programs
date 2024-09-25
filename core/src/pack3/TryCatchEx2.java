package pack3;

public class TryCatchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchEx2 t=new TryCatchEx2()
;
		try
		{
			t.divide(7,0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("Exception is handled:");
	}
	void divide(int a,int b)
	{
		int c=a/b;
		System.out.println("c="+c);
	}

}
