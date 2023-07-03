package ArrayExplanation;

import java.util.Arrays;

public class MaxAndMin 
{
	
	public static void main(String[] args) 
	{
		int arr[] = new int[4];
		
		arr[0] = 30;
		arr[1] = 20;
		arr[2] = 40;
		arr[3] = 10;
		
		Arrays.sort(arr);
		
		System.out.println("Minimum number is "+ arr[0]);
		System.out.println("Maximum number is "+ arr[3]);
		
	}

}
