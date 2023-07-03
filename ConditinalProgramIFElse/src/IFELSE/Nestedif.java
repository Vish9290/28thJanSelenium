package IFELSE;

public class Nestedif
{
	public static void main(String[] args)
	{
		int SA = 1200;
		
		if(SA >=500)
		{
			System.out.println("No delivery charges");
			
			if(SA>=1000)
			{
				System.out.println(" Give 10% extra disclount");
			}
			
			else
			{
				System.out.println("No disount");
			}
			
		}
		else
		{
			System.out.println("50rs delivery charges applied.");
		}
		
			
		
	}

}
