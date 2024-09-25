package core1;

class Demo
{
	int len,bre;
	Demo(int l,int b)
	{
		len=l;
		bre=b;
	}
	void find(Demo ob)
	{
		int area=ob.len*ob.bre;
		System.out.println("Area="+area);
	}
}

public class ObjectAsParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo ob=new Demo(10,20);
		ob.find(ob);
	}

}
