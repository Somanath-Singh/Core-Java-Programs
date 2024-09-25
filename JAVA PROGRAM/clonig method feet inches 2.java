import java.util.*;

 // Compiler version JDK 11.0.2

 class Distance implements Cloneable
 {  
    int feet;  
    int inch;  
    Distance(int feet, int inch)
    {  
      this.feet=feet;  
      this.inch=inch;  
     }   
     public Object clone()
     throws CloneNotSupportedException
     {  
        return super.clone();  
       }  
     public static void main(String args[])
     {  
       try
       {  
        Distance s1=new  Distance(13,17); 
        System.out.println("1St object is "+s1.feet+" "+s1.inch); 
        Distance s2 =new  Distance(34,53); 
        System.out.println("2and object is "+s2.feet+" "+s2.inch);
        Distance s3=(Distance)s1.clone();     
        System.out.println("3rd object is clone of 1St object is "+s3.feet+" "+s3.inch);  
        }
        catch(CloneNotSupportedException c){}
     }  
   }
