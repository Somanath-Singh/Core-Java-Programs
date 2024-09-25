package core1;
//import java.lang.*; 

public class WrapperClass {

	public static void main(String[] args) {
	
		//Boxing process using constructor
		Integer obj1= Integer.valueOf(123);
		Integer obj2=Integer.valueOf("123");
		System.out.println("obj1="+obj1);
		System.out.println("obj2="+obj2);
		
		/*Integer obj3=new Integer(125); 
		int b=obj3.intValue();*/
		
		//System.out.println("b="+b);
		
		int a=obj1.intValue();
		String S1=obj2.toString();
		
		int b=obj2;
		System.out.println("b="+b);
		System.out.println("a="+a);
		System.out.println("s1="+S1);

	}

}
