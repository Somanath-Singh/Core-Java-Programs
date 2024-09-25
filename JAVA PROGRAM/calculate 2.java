import java.util.*;

 // Compiler version JDK 11.0.2

 class Box
{
   double height;
   double width;
   double depth;
 }
 class Demo
 {
   public static void main (String args[])
   {
     Box b1=new Box();
     Box b2=new Box();
     b1.height=4;
     b1.width=3;
     b1.depth=7;
     b2.height=9;
     b2.width=8;
     b2.depth=6;
     System.out.println(b1.height+" "+b1.width+" "+b1.depth);
     System.out.println(b2.height+" "+b2.width+" "+b2.depth);
   }
  }