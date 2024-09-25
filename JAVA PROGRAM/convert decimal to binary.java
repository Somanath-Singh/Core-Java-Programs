import java.util.*;

 // Compiler version JDK 11.0.2

 class Calculate
 {
   public static void main(String args[])
   { 
    int n,rem,bin=0,base=1;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter decimal no");
    n=obj.nextInt();
    while(n>0)
    {
      rem=n%2;
      bin=bin+rem*base;
      n=n/2;
      base=base*10;
     }
     System.out.println("Binary no is"+bin);
   }
 }
