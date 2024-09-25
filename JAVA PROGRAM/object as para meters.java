import java.util.*;

 // Compiler version JDK 11.0.2
class Rectangle 
{
    int length;
    int width;
    int area;

    Rectangle(int l, int b) 
    {
        length = l;
        width = b;
    }

    void find(Rectangle r1)
     {
        area = r1.length * r1.width;
        System.out.println("Area of Rectangle : " 
                                + area);
    }
}

class RectangleDemo 
{
    public static void main(String args[])
     {
        Rectangle r1 = new Rectangle(10, 20);
        r1.find(r1);
    }
}