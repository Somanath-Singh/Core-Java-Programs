import java.util.*;

 // Compiler version JDK 
class Prime
{ 
 public static void main(String args[])
 {    
  int n,i,count,j;   
  n=50;
  count=0;
  Scanner obj=new Scanner(System.in);
  n=obj.nextInt();
  for(i=1;i<=(n);i++)
  {
    if(n%i==0)
    {  
      count=count+1;
      }   
   if(count==2)
   System.out.println(n);      
     n= n+1 ;
     }  
  }
 }
