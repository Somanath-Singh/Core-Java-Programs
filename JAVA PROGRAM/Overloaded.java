import java.io.*;

class Over
{
      public static int minFunction(int a,int b)
    {
      int min;
       if(a>b)
        min=b;
      else
        min=a;
       return min;
     }

    public static double minFunction(double a,double b)
    {
      double min;
       if(a>b)
        min=b;
      else
        min=a;
       return min;
     }
     public static void main(String args[])throws IOException
     {
       int a,b;
       double c,d;
       InputStreamReader ir=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(ir);
       System.out.println("Enter value of a");
       a=Integer.parseInt(br.readLine());
       System.out.println("Enter value of a");
       b=Integer.parseInt(br.readLine());
       System.out.println("Enter value of c");
       c=Double.parseDouble(br.readLine());
       System.out.println("Enter value of d");
       d=Double.parseDouble(br.readLine());
    
       int m1=minFunction(a,b);

       double m2=minFunction(c,d);

       System.out.println("minimum value is"+m1);
       System.out.println("minimum value is"+m2);
      }
   
  }
