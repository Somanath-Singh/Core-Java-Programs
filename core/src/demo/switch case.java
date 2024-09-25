import java.util.*;

 // Compiler version JDK 11.0.2

 class Test
 {
  public static void main(String args[]) 
  {
    int a,b,n,sum,min,mul,div;
    Scanner obj= new Scanner(System.in);
    System.out.println("Enter value of a:");
    a=obj.nextInt();
    System.out.println("Enter value of b:");
    b=obj.nextInt();
    System.out.println("Enter your choice:");
    n=obj.nextInt();
    switch (n) 
    {
      case 1:
        sum=a+b;
        System.out.print("sum is"+sum);
        break;
      case 2:
        min=a-b;
        System.out.print("min is"+min);
        break;
      case 3:
        mul=a*b;
        System.out.print("mul is"+mul);
        break;
      case 4:
        div=a/b;
        System.out.print("div is"+div);
        break;
      default:
        System.out.println("Please enter no between 1 to 4");
        break;
    }
  }
}