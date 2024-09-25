import java.util.*;

 // Compiler version JDK 11.0.2
 
 class Data 
 {
    // private variable
    private String name;
     void display()
     {
       System.out.println(name);
     }
}

public class Main 
{
    public static void main(String[] main){

        // create an object of Data
        Data d = new Data();

        // access private variable and field from another class
        d.name = "Programiz";
        d.display();
    }
}

//upper and lower program are represent how the 
  // method and object are declared


class Data 
 {
    // private variable
     String name;
     void display(String name)
     {
       System.out.println(name);
     }
}

public class Main 
{
    public static void main(String[] main){

        // create an object of Data
        Data d = new Data();

        // access private variable and field from another class
        d.name = "Programiz";
        d.display(d.name);
    }
}