import java.util.*;

 // Compiler version JDK 11.0.2

class Test
 {
   int n=500;
   void change(Test obj)
   { 
     obj.n=obj.n+40;
     }
 public static void main (String args[])
 {
   Test obj=new Test();
   System.out.println("Before call8ng ="+obj.n);
   obj.change(obj);
   System.out.println("After  call8ng ="+obj.n);
   }
  }