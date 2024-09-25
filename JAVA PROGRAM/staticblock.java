import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution
 {
    static int B;
    static int H;
    static boolean flag;
   static
   {
       Scanner s=new Scanner(System.in);
       B=s.nextInt();
       H=s.nextInt();
       if(B>=0 && H>=0)
       {
           flag=true;
       }
       s.close();
   }
public static void main(String[] args)
{
		if(flag){
			int area=B*H;
			System.out.print(area);
}
		
	}//end of main

}//end of class

