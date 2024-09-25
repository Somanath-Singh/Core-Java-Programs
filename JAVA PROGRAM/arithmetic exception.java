class Arithm 
{
	int a=5,b=0,c;
	   void display()
	     {
	         try
	          {
	            c=a/b;
	          }
	          catch(ArithmeticException e)
	            {
	             System.out.println(e);
	            }
	          System.out.println("Exception occured.");
	     }
	}
class Test
	{
	    public static void main(String args[])
	      {
	    	Arithm obj=new Arithm();
	        obj.display();
	      }
	}



