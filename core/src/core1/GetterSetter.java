package core1;
import java.io.*;
class Data {

	private String name;
	private int rollNo;
	
	public void setData(String name,int rollNo)
	{
		this.name=name;
		this.rollNo=rollNo;
	}
	
	public String getData()
	{
		return this.name;
	}
	
	public int getData1()
	{
		return this.rollNo;
	}
}
 public class GetterSetter
 {
	 public static void main(String args[])throws IOException
	 {
	 InputStreamReader ir=new InputStreamReader(System.in);
	 
	 BufferedReader br=new BufferedReader(ir);
	 
	 System.out.println("Enter your name:");
	 String n=br.readLine();
	 System.out.println("Enter your rollNo:");
	 int r=Integer.parseInt(br.readLine());
	 Data obj=new Data();
	 obj.setData(n, r);
	 System.out.println("your name and roll no is:"+obj.getData()+" "+obj.getData1());
   }
 }
