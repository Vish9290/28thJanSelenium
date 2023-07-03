package Exception;

public class OnlyException
{
	public static void main(String[] args) 
	{
	
		int arr[] = {1,2,3,4,5,6};
		
		try 
		{
			System.out.println(arr[8]);
		}
		
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Generic Exception");
		}
	}
	
	
	

}
