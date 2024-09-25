import java.util.*;

 // Compiler version JDK 11.0.2

 class Employee implements Cloneable
{  
   String name,id; 
   Employee(String name,String id)
     {  
       this.name=name;  
       this.id=id; 
       } 
   public String toString()
   {
     return("name="+name+"\nid"+id);
     }
    public Employee clone()
    throws CloneNotSupportedException
    { 
      return (Employee )super.clone();  
      }  
  }
  public class ObjectClone
  {
     public static void main(String args[])
     throws CloneNotSupportedException
     {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter empname");
       String name=s.nextLine();
       System.out.println("Enter empid");
       String Id=s.nextLine();
       Employee obj1=new Employee(name , Id);
       System.out.println("Display from original 0bject");
       System.out.println(obj1);
       Employee obj2=obj1.clone();
       System.out.println("Display from  cloned object");
       System.out.println(obj2);
       s.close();
    }
   }