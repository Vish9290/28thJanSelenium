package Fact;

public class Factorial1
{
	
	public static void main(String[] args) 
	{
		
		int  fact= 5;
		
		int iNum2 = 1;
		
		for(int i = fact; i >= 1; i--)
		{
			iNum2 = iNum2 * i; 
		}
		System.out.println(iNum2);
		
	}

}
