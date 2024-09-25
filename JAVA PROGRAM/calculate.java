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
     Box b1 = new Box();
     b1.height=4;
     b1.width=3;
     b1.depth=7;
     System. out. println(b1.height);
     System. out. println(b1.width );
     System. out. println(b1.depth );
   }
  }