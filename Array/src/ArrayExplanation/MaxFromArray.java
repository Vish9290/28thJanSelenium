package ArrayExplanation;

public class MaxFromArray 
{
	
	public static void main(String[] args) 
	{
		
		int arr[] = {10, 20, 50, 30, 80, 40};
		System.out.println(arr.length);
		int max = arr[0];
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
				
			}
			
		}
		System.out.println(max);
		
	}
	
	

}
