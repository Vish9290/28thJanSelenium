package Exception;

public class Exception1 
{
	
	public static void main(String[] args) 
	{
		
		String str = "abcde";
		char arr[] = {'a','b','c','d','e'};
		
		try
		{
			System.out.println(str.charAt(7));
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmaticException handeled");
		}
		
		catch(StringIndexOutOfBoundsException se)
		{
			System.out.println("StringIndexOutOfBoundsException  handled");
		}
		
		try
		{
			System.out.println(arr[7]);
		}
		catch (ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("ArrayIndexOutOfBoundsException Handled");
		}
		
		System.out.println("Hello Vishal");
	}

}
