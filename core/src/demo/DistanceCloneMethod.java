package demo;

 // Compiler version JDK 11.0.2

 public class DistanceCloneMethod implements Cloneable
 {  
    int feet;  
    int inch;  
    DistanceCloneMethod(int feet, int inch)
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
    	   DistanceCloneMethod s1=new  DistanceCloneMethod(13,17); 
        System.out.println("1St object is "+s1.feet+" "+s1.inch); 
        DistanceCloneMethod s2 =new DistanceCloneMethod(34,53); 
        System.out.println("2and object is "+s2.feet+" "+s2.inch);
        DistanceCloneMethod s3=(DistanceCloneMethod)s1.clone();     
        System.out.println("3rd object is clone of 1St object is "+s3.feet+" "+s3.inch);  
        }
        catch(CloneNotSupportedException c){}
     }  
   }
