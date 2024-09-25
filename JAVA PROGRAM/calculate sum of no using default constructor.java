import java.util.*;

 // Compiler version JDK 11.0.2

 class Test
 {
   int a,b,sum;
   Test()
   {
       a=10;
       b=20;
       }
   void calculate()
   {
     sum=a+b;
     }
   void display()
   {
     System.out.println("sum is:"+sum);
     }
   public static void main(String[] args) 
   {
       Test obj = new Test();
       obj.calculate();
       obj.display();
   }
}