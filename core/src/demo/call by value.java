package demo;

 // Compiler version JDK 11.0.2

 class Test5
 {
   int n=500;
   void change(int n)
   { 
     n=n+40;
     }
 public static void main (String args[])
 {
   Test5 obj=new Test5();
   System.out.println("Before call8ng ="+obj.n);
   obj.change(obj.n);
   System.out.println("After  call8ng ="+obj.n);
   }
  }