package Polymorphism;

public class Complietime 
{
	
	
	public static void add(int iNum1, int iNum2)  
	{
		System.out.println(iNum1 + iNum2);
	}
	
	public static void add(int iNum1, int iNum2, int iNum3) //Method Overloading same name with different parameters.
	{
		System.out.println(iNum1 + iNum2 + iNum3);
	}
	
	public void add(int iNum1, int iNum2, int iNum3, int iNum4)
	{
		System.out.println(iNum1 + iNum2 + iNum3 + iNum4);
	}
	
}
