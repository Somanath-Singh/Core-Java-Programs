package demo;

 // Compiler version JDK 11.0.2

 class Test3
 {
   int a,b,sum;
   Test3()
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
       Test3 obj = new Test3();
       obj.calculate();
       obj.display();
   }
}