package Exception;

public class ArithmaticException 
{
	public static void main(String[] args) 
	{
		
		int a = 0;
		int b = 20;
	
		
		try
		{
		   System.out.println(b/a);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException handled");
		}
		
		System.out.println("Hello Vishal");
		
	}
}
