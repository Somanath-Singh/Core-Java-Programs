package pack3;

public class NestedCatchBlockEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		          
		           try{    
		                int a[]=new int[5];    
		                a[5]=30/0;    
		               }    
		               catch(ArithmeticException e)  
		                  {  
		                   System.out.println("Arithmetic Exception occurs");  
		                  }    
		               catch(ArrayIndexOutOfBoundsException e)  
		                  {  
		                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
		                  }    
		               catch(Exception e)  
		                  {  
		                   System.out.println("Parent Exception occurs");  
		                  }             
		               System.out.println("rest of the code");    
		 
		              // remove double quoto to see the output
		         /*  try{    
		                int a[]=new int[5];    
		                
		                System.out.println(a[10]);  
		               }    
		               catch(ArithmeticException e)  
		                  {  
		                   System.out.println("Arithmetic Exception occurs");  
		                  }    
		               catch(ArrayIndexOutOfBoundsException e)  
		                  {  
		                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
		                  }    
		               catch(Exception e)  
		                  {  
		                   System.out.println("Parent Exception occurs");  
		                  }             
		               System.out.println("rest of the code");    
		        */ //ArrayIndexOutOfBounds Exception catch block execute
		               
		          //remove double quoto to see the output
		         /*  try{    
		                int a[]=new int[5];    
		                a[5]=30/0;    
		                System.out.println(a[10]);  
		               }    
		               catch(ArithmeticException e)  
		                  {  
		                   System.out.println("Arithmetic Exception occurs");  
		                  }    
		               catch(ArrayIndexOutOfBoundsException e)  
		                  {  
		                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
		                  }    
		               catch(Exception e)  
		                  {  
		                   System.out.println("Parent Exception occurs");  
		                  }             
		               System.out.println("rest of the code");    
	              *///hear two line may cause exception
		               //arithmeticexception catch block execute ist so arithmetic exceptin is executed
		               //if System.out.println(a[10]); this statement wrote 1st then  ArrayIndexOutOfBounds Exception catch block executed
		               
		  /* try{ 
			   
		    int a[]=new int[5];    
		    a[5]=30/0;   
		    
		   }    
		   catch(Exception e)
		   {
			   System.out.println("common task completed")
			   ;}    
		   catch(ArithmeticException e){
			   System.out.println("task1 is completed");
			   }    
		   catch(ArrayIndexOutOfBoundsException e){
			   System.out.println("task 2 completed");
			   }    
		   System.out.println("rest of the code...");    
		*///remove double quoto to see the output
		               //parent class execute after execution of child class

	}

}
