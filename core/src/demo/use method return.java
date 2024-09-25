import java.util.*;

 // Compiler version JDK 11.0.2

 class Demo
  {
    public static void main(String args[])
    {
      int x,y,z;
      add(x=4,y=6,z=8);
      System.out.println("sum="+(x+y+z));  
      add(x=40,y=65,z=8);
      System.out.println("sum="+(x+y+z));  
      add(x=42,y=61,z=80);
      System.out.println("sum="+(x+y+z));  
   }
   public static int add(int a,int b,int c)
    {
      return (a+b+c);
      }
  }
