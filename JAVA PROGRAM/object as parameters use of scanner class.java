import java.util.*;

 // Compiler version JDK 11.0.2

class Rectangle 
{
    int length;
    int breth;
    int area;

    Rectangle(int l, int b) 
    {
        length = l;
        breth= b;
    }

    void find(Rectangle r1)
     {
        area = r1.length * r1.breth;
        System.out.println("Area of Rectangle : " 
                                + area);
    }
}

class RectangleDemo 
{
    public static void main(String args[])
     {
        Scanner obj=new Scanner(System .in);
        System.out.println("Enter length");
        r1.length=obj. nextInt();
        System.out.println("Enter breth");
        r1.breth=obj. nextInt();
        r1.find();
    }
} 