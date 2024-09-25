import java.util.*;

 // Compiler version JDK 11.0.2

 import java. util. *;
class Distance implements Cloneable{  
float feet;  
float inch;  
  
Distance(float feet, float inch){  
this.feet=feet;  
this.inch=inch;  
}  
  
public Object clone()throws CloneNotSupportedException{  
return super.clone();  
}  
  
public static void main(String args[])
{  
try
{  
Distance s1=new  Distance(13, 13);  
Distance s2 = s1;
Distance s3=(Distance)s1.clone();  
  
System.out.println(s1.feet+" "+s1.inch);
System.out.println(s2.feet+" "+s2.inch);  
System.out.println(s3.feet+" "+s3.inch);  
  
}catch(CloneNotSupportedException c){}  
  
}  
}