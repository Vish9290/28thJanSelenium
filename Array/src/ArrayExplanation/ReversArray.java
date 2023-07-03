package ArrayExplanation;

public class ReversArray 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[4];
		
		arr[0] = 10;
		arr[1] = 30;
		arr[2] = 50;
		arr[3] = 20;
		
		
		for(int i =0; i<= arr.length-1; i++)
		{
			System.out.println(arr[i]);
		}
		
		
		System.out.println(" Reverse Array");
		
		for(int i= arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]);
		}
			
				
	}
	

}
