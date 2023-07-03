package ArrayExplanation;

public class SortArrayWithout_SortMethod 
{
	public static void main(String[] args) 
	{
		
		int arr[] = {10,50,30,20,70};
		
		
		for(int i =0; i < arr.length; i++)
		{
			int index = i;
			for(int j=i; j<=arr.length-1;j++)
			{
				if(arr[j] < arr[index])
				{
					index = j;
				}
				
			}
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
			
		}
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
			
		
	}
	
}
