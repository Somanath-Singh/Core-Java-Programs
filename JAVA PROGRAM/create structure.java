import java.util.*;

 // Compiler version JDK 11.0.2

 class student
 {
   String name="sonu";
   int rollno,branch;
   void getdata( int x,int y)
   {
     rollno=x;
     branch=y;
   }
   void putdata()
     {
       System.out.println("rollno:"+rollno);
       System.out.println("name:"+name);
       System.out.println("branch:"+branch);
     }
 }
 class exam extends student
 {
   int sub1,sub2;
   void getmark(int x,int y)
   {
     sub1=x;
     sub2=y;
   }
   void putmark()
   {
     System.out.println("marks are:"+sub1+" "+sub2);
   }
 }
 class grade extends exam
 {
    int gra;
    void getgrade(int x)
    {
      gra=x;
    }
    void putgrade()
    {
      System.out.println("grade:"+ gra);
    }
    int total;
    void display()
    {
      putdata();
      putmark();
      putgrade();
      total=sub1+sub2;
      System.out.println("total marks gain:"+total);
    }
 }
 class calculate
 {
   public static void main (String args[])
   {
     grade obj=new grade();
     obj.getdata(1,12);
     obj.getmark(85,76);
     obj.getgrade(10);
     obj.display();
   }
 }