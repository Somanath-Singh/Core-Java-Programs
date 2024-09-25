import java.util.*;

 // Compiler version JDK 11.0.2

class Main
{
    public static void main(String[] args)
    {
       Scanner obj=new Scanner(System.in);
        // Declare a 2-D array with 3 rows
       int myarray[][] = new int[3][];
       // define and initialize jagged array
       myarray[0] = new int[1];
       myarray[1] = new int[2];
       myarray[2] = new int[3];
       // display the jagged array
       System.out.println("Enter Jagged Array elements:");
       for (int i=0; i<myarray.length; i++)
       {
          for (int j=0; j<myarray[i].length; j++)
          {
              myarray[i][j]=obj.nextInt();
          }
          System.out.println();
        }
        System.out.println("Printing element");
        for (int i=0; i<myarray.length; i++)
       {
          for (int j=0; j<myarray[i].length; j++)
          {
              System.out.print(myarray[i][j] +" ");
          }
          System.out.println();
        }
    }
}