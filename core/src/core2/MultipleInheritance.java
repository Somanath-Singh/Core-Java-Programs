package core2;
import java.util.Scanner;

class Student
{
	int m1,m2;
	void getMark(int x,int y)
	{
		m1=x;
		m2=y;
	}
	void putMarks()
	{
		System.out.println("marks of m1 and m2="+m1+" "+m2);
	}
}
interface Sport
{
	
	Scanner sc=new Scanner(System.in);
	int sp=sc.nextInt();
	void sportMarks();
	
}

class Result extends Student implements Sport
{
	public void sportMarks()
	{
		System.out.println("Sports mark of student is="+sp);
	}
	
	void display3()
	{
		putMarks();
		sportMarks();
		int total=m1+m2+sp;
		System.out.println("Total marks is="+total);
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result r=new Result();
		r.getMark(95,97);
		r.display3();
	}
	
}
