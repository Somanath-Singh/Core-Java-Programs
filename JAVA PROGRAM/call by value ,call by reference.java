import java.util.*;

 // Compiler version JDK 11.0.2

 class Test
 {
   public int n=5;
   void change(int n)
   { 
     n=n+40;
     }
 private  void change(Test obj)
   {
     obj.n=obj.n+5;
   }
 public static void main (String args[])
 {
   Test obj=new Test();
   //call by value
   System.out.println("call by value:");
   System.out.println("Before calling ="+obj.n);
   obj.change(obj.n);
   System.out.println("After  calling ="+obj.n);
   // call by reference
   System.out.println("call by referance:");
   System.out.println("Before calling ="+obj.n);
   obj.change(obj);
   System.out.println("After  calling ="+obj.n);
   // initialise a final value
   final int x;
   x=111;
   System.out.println("Final value is "+x);
   }
  }
