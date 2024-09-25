import java.util.*;

 // Compiler version JDK 11.0.2

 class Calculate
 {
   public static void main(String args[])
   { 
    int n,r,rev,temp;
    rev=0;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter a no");
    n=obj.nextInt();
    temp=n;
    while(n>0)
    {
      r=n%10;
      rev=rev*10+r;
      n=n/10;
     }
     if(temp==rev)
       System.out.println("Enter no is palindrome\n");
     else
       System.out.println("Enter no is not palindrome\n");
   }
 }
