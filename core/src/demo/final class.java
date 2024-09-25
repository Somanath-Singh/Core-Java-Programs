import java.util.*;

 // Compiler version JDK 11.0.2

 final class A
 {
   void show()
   {
     System.out.println("Hye");
   }
 }
 class B extends A
 {
   void get()
   {
     System.out.println("somanath");
   }
   public static void main(String args[])
   { 
    B obj=new B();
    obj.show();
    obj.get();
   }
 }
