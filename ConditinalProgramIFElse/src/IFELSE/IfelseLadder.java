package IFELSE;

public class IfelseLadder 
{
	public static void main(String[] args)
	{
		int marks = 25;
		
		if(marks >= 65 && marks <=100 )
		{
			System.out.println("Pass with Distinction");
		}
		
		else if(marks >=60  && marks <= 65)
		{
			System.out.println("Pass with First Class");
		}
		
		else if(marks >= 50  && marks <= 59)
		{
			System.out.println(" Pass with Second class");
		}
	   
		else if(marks >= 35  && marks <= 49)
		{
			System.out.println(" Only Pass");
		}
		
		/*else 
		{
			System.out.println(" Fail");
		}*/
		
		else if(marks <= 35)
		{
			System.out.println("Fail");
		}
	}

}
