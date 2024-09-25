import java.util.*;

 // Compiler version JDK 11.0.2 
 
class Vehicle
{  
  void run()
  {
    System.out.println("Vehicle is running");
   }  
}  
//Creating a child class  
class Bike2 extends Vehicle
{  
  void run()
  {
    System.out.println("Bike is running safely");
  }  
  void display()
    {
       super.run();
    } 
  public static void main(String args[])
  {  
  Bike2 obj = new Bike2();//creating object  
  obj.run();//calling method 
  obj.display();// ause  of super keyword
  }  
}