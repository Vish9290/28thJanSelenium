package Exception;

public class ArrayIndex 
{
	
	public static void main(String[] args) 
	{
	
		int arr[] = {10, 20, 30, 40, 50};
		
		try 
		{
			System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println(" ArrayIndexOutOfBoundsException Handled");
		}
		
		System.out.println("Hello Vishal");
		
		
		
	}

}
