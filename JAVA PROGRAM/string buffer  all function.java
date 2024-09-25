import java.util.*;

 // Compiler version JDK 11.0.2

 class function
 {
   public static void main(String args[])
   { 
    StringBuffer b=new StringBuffer("Hello ");
    b.setCharAt(5,'o');
    System.out.println(b);
    int p=b.length();
    System.out.println(p);
    b.setLength(5);
    System.out.println(b);
    b.append("java");
    System.out.println(b);
    b.insert(5," my friend ");
    System.out.println(b);
    String s1="amit";
    String s2="amit";
    String s3=" kumar";
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    String s4=s1.concat(s3);
    System.out.println(s4);
   }
 }
