package core2;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		
		int n,i,j, total=0;
		try (Scanner s = new Scanner(System.in)){
		System.out.println("Enter the length of Araay:");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Length of Array is:"+arr.length);
		System.out.println("Enter element of array:");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Printing the value of array:");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			total=total+arr[i];
		}
		System.out.println("printing total value of array:"+total);
		//Declare a second array
		int rollno[]= {10,20,30,40,50,60,70,80,90,100};
		
		System.out.println("Printing the roll no:");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(rollno[i]);
		}
		//2D array
		System.out.println("Enter row size of 2D array:");
		int p=s.nextInt();
		System.out.println("Enter column size of 2D array:");
		int q=s.nextInt();
		int arr1[][]=new int[p][q];
		System.out.println("Enter element of array:");
		for(i=0;i<arr1.length;i++)
		{
		  for(j=0;j<arr1[i].length;j++)
		  {
			arr1[i][j]=s.nextInt();
		  }
		}
		System.out.println("Printing the value of 2D array:");
		for(i=0;i<arr1.length;i++)
		{
		  for(j=0;j<arr1[i].length;j++)
		  {
			  System.out.println(arr1[i][j]+"\t");
		  }
		 // System.out.println(\\t);
		}
		s.close();
		}
	}
	

}
