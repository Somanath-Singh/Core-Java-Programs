package demo;

// lower program represent input through 
//constructor parameter I/p pass through object
 class Rectangle
 {
   int Len,bre,area;
   Rectangle(int l,int b)
   {
     Len=l;
     bre=b;   
   }
   void find()
   {
     area=Len*bre;
     System.out.println("area="+area);
   }
  }
  public class ClassParameter
  {
   public static void main(String args[])
   { 
    Rectangle r=new Rectangle(3,5);
    r.find();
   }
 }


//lower program represent input through 
//so in this program we can't give I/p in object


class Rtangle
 {
   int Len,bre,area;
   void getdata(int l,int b)
   {
     Len=l;
     bre=b;   
   }
   void find()
   {
     area=Len*bre;
     System.out.println("area="+area);
   }
  }
  class Deo
  {
   public static void main(String args[])
   { 
    Rtangle r=new Rtangle();
    r.getdata(5,4);
    r.find();
   }
 }
