package Fact;

public class Factorial
{
	
		int iNum1;
		
		public Factorial() 
		{
			iNum1= 5;
		}
		
		public static void main(String[] args) 
		{
				
				System.out.println("Factorial number");
				
				Factorial fact = new Factorial();
				fact.Factotial1();
		}

		
		public void Factotial1()
		{
			int iNum2 =1;
		
		
			for(int i = iNum1; i >= 1; i--)
			{
				
				iNum2 = iNum2 * i;
				
				
			}
			System.out.println(iNum2);
			
		}
}
