package Exception;

public class ExceptionHandling
{
	
	public static void main(String[] args) 
	{
		
		String str = "Vishal";
		
		//System.out.println(str.charAt(7));
		try 
		{
			System.out.println(str.charAt(7));
		}
		
		catch(StringIndexOutOfBoundsException SE)
		{
		System.out.println("String Index is out of bound its Handled");
		}
		
		System.out.println("Hello Vishal");
	}

}
