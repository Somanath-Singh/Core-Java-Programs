package core1;
import java.util.Scanner;	

public class RectangleTest {

	public static void main(String[] args) {
		
					Scanner sc=new Scanner(System.in);
			        Rectangle rec=new Rectangle();
			        System.out.println("Enter the length:");
			        rec.length= sc.nextInt();
			        System.out.println("Enter the breadth:");
			        rec.breadth=sc.nextInt();
			        System.out.println(rec.area());
			        System.out.println(rec.perimeter());
			        //close the scanner class
			        sc.close();
			        }

			    }