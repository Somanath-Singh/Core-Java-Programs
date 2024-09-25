package core2;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Somanath Singh";
		System.out.println("String 1 is:"+str);
		String s1=new String("Somanath Singh");
		System.out.println("String 2 is:"+s1);
		System.out.println(str.equals(s1));
		//System.out.println(str.compareto(s1));
		
		//string immutable
		str.concat("Developer");
		System.out.println("String modify is:"+str);
		//String mutable
		str=str.concat("Developer");
		System.out.println("String after modify is:"+str);
	}

}
