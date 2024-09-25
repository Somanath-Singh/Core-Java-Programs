package demo;

 // Compiler version JDK 11.0.2

 class Calculator
 {
   int sum,sub;
   int a,b;
   void getdata(int x,int y)
   {
     a=x;
     b=y;
     }
   void calculate()
   {
     sum=a+b;
     sub=a-b;
     }
  }
 class Calculator1 extends Calculator
 {
   void display()
   {
     calculate();
     System.out.println(sum+" "+sub);
     }
   }
 class Test2
 {
   public static void main(String args[])
   {
    Calculator1 obj=new Calculator1();
    obj.getdata(4,7);
    obj.calculate();
    obj.display();
    }
   }