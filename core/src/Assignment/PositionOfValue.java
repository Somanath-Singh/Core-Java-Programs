package Assignment;


public class PositionOfValue {

	public static void main(String[] args) {

		int num,r2,r3,r4;
		System.out.println("Entera a four digit no :");
		num=Integer.parseInt(args[0]);
		
		r4=num%10;
		num=num/10;
		
		
		r3=num%10;
		num=num/10;
		r2=num%10;
		num=num/10;
		
		System.out.println("Enter the position of value you want find :");
		int pos=Integer.parseInt(args[1]);
		
		String s1=(pos==1000)?"value "+r4+" is present at hundred(1000) place .":"null";
		String s2=(pos==100)?"value "+r3+" is present at hundred(100) place .":"null";
		String s3=(pos==10)?"value "+r2+" is present at hundred(10) place .":"null";
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		
	}

}
