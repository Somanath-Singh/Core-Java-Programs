package demo;

 // Compiler version JDK 11.0.2

public class CallByReference
 {
    int n=500;
    void change(CallByReference obj)
   { 
     n=n+40;
     }
 public static void main (String args[])
 {
	 CallByReference obj=new CallByReference();
   System.out.println("Before calling ="+obj.n);
   obj.change(obj);
   System.out.println("After  calling ="+obj.n);
   }
  }