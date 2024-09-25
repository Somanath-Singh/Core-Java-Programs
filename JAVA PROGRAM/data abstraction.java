import java.util.*;

 // Compiler version JDK 11.0.2

 class Abstraction
 {
         int num;
         char ch;
         void setvalue(int n,char c)
         {
           num=n;
           ch=c;
           }
          void getvalue()
            {
              System.out.println("no is:"+num);
              System.out.println("char is:"+ch);
            }
    public static void main(String args[])
    {
      Abstraction a=new Abstraction();
      a.setvalue(100,'x');
      a.getvalue();
      }
    }