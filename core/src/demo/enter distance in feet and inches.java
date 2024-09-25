import java.util.*;

 // Compiler version JDK 11.0.2

 class Distance
 {  
   int feet,inches;
     public void setdata(int feet,int inches)
     {
       this.feet=feet;
       this.inches=inches;
     }
     public void display()
     {
       System.out.println("Distance is:\n "+"feet="+feet+"\n inches="+inches);
     } 
   public static void main(String args[])
   { 
     Distance d=new Distance();
     d.setdata(5,7);
     d.display();
   }
 }
