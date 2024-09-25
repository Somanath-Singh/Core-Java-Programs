import java.util.*;

 // Compiler version JDK 11.0.2

 class Array
{
   public static void main(String args[])
   {    
  int n,i,total;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Array length : ");
  n=sc.nextInt();
  int a[]=new int[n];//declaration   
  System.out.println("Array length\n" +a.length); 
  System.out.println("\nEnter " + n+ " Element to Store in Array :\n");
        for(i=0; i<a.length; i++)
        {
           a[i] = sc.nextInt();
        }   
        total=0;
        System.out.print("Elements in Array are :");
        for(i=0; i<a.length; i++)
        {
           System.out.println("a["+i+"]:"+a[i]);
           total=total+a[i];
        }  
        
           System.out.println("Total marks"+total);
   }
}