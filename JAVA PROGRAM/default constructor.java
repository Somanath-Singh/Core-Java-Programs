import java.util.*;

 // Compiler version JDK 11.0.2

 class Test
 {
   int a,b;
   // constructor with no parameter
   Test()
   {
       System.out.println("Default constructor");
       a=10;
       b=20;
       }
   void display()
   {
     System.out.println("value of a is"+a);
     System.out.println("value of b is"+b);
     }
   public static void main(String[] args) {

       // calling the constructor without any parameter
       Test obj = new Test();
       obj.display();
   }
}