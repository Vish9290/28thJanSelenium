package Fact;

public class fact2 
{
	
	int iNum1;
	
	public fact2()
	{
	
		iNum1 = 5;
	}
	
	public static void main(String[] args)
	{
		
		fact2 fa = new fact2();
		fa.fact();
		fa.swap();
		
	}
	
	
	public void fact()
	{
		int iNum2= 1;
		
		for(int i = iNum1; i >= 1; i--)
		{
			
			iNum2 = iNum2 * i;
		}
		
		System.out.println(iNum2);
	}
	
	public void swap()
	{
		int i =10;
		 int j =20;
		 j = i;
		 int temp =0;
		 
		 temp = 20;
		 i = temp;
		 
		 
		 System.out.println(i);
		 System.out.println(j);
	}

}
