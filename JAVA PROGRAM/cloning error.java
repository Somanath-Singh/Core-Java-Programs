import java.util.*;

 // Compiler version JDK 11.0.2

 class Distance implements Cloneable
{  
   float feet,inches; 
   Distance(float feet,float  inches)
     {  
       this.feet=feet;  
       this.inches=inches; 
       } 
   public String toString()
   {
     return("feet="+feet+"\ninches"+inches);
     }
    public Distance clone()
    throws CloneNotSupportedException
    { 
      return (Distance)super.clone();  
      }  
  }
  public class Objectclone
  {
     public static void main(String args[])
     throws CloneNotSupportedException
     {
       
       Distance obj1=new Distance(8.0,5.0);
       System.out.println("Display from original 0bject");
       System.out.println(obj1);
       Distance obj2=obj1.clone();
       System.out.println("Display from  cloned object");
       System.out.println(obj2);
       
    }
   }