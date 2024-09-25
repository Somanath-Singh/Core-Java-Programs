//package core1;
//import java.util.Scanner;
//
//public class Textreturn {
//	
//	public static String getName(String name)
//	{
//		return name;
//	}
//
//	public static void main(String[] args) {
//	
//		System.out.println("Enter Your name");
//		Scanner sc=new Scanner(System.in);
//		String name=getName(sc.next());
//		System.out.println("your name is:"+name);
//		sc.close();
//	}
//
//}
package core1;
import java.util.Scanner;

public class Textreturn {
	
	public static String getName(String name)
	{
		return name;
	}

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your name");
		String name1=sc.nextLine();
		String name=Textreturn.getName(name1);
		System.out.println("your name is:"+name);
		sc.close();
	}

}

