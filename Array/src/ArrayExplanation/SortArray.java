package ArrayExplanation;
import java.util.Arrays;

public class SortArray 
{
	public static void main(String[] args)
	{
	
		int arr[] = new int[4];
		
		arr[0] = 40;
		arr[1] = 10;
		arr[2] = 30;
		arr[3] = 60;
		
		
		for(int i = 0; i<=arr.length-1; i++)
		{
			System.out.println(arr[i]);
		}
		
		
		Arrays.sort(arr);
		
		System.out.println("Sorted Array is ");
		for(int i = 0; i<=arr.length-1; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	
	

}
