import java.util.*;

 // Compiler version JDK 11.0.2
class Box
{
   int len,bre;
 }
 class Demo
 {
   public static void main (String args[])
   {
     Box b1 = new Box();
     Scanner obj=new Scanner(System.in);
     System. out. println("Enter len");
     b1.len=obj.nextInt();
     System. out. println("Enter bre");
     b1.bre=obj.nextInt();
     System. out. println(b1.len);
     System. out. println(b1.bre);
   }
  }