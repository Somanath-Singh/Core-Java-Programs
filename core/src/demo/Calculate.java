package demo;

 // Compiler version JDK 11.0.2
class Box1
{
   double height;
   double width;
   double depth;
 }
 public class Calculate
 {
   public static void main (String args[])
   {
     Box1 b1 = new Box1();
     b1.height=4;
     b1.width=3;
     b1.depth=7;
     System. out. println(b1.height);
     System. out. println(b1.width );
     System. out. println(b1.depth );
   }
  }