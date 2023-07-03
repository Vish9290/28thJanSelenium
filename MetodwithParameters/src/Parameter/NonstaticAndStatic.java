package Parameter;

public class NonstaticAndStatic
{
	
	public static void Add(int num1, int num2)
	{
		//System.out.println(" Addition of two numbert is "+ num1 + num2);
		System.out.println("Addtion static method from different class is "+(num1 + num2));
	}

	
	public void Addition(int num1, int num2)
	{
		//System.out.println(" Addition of two numbert is "+ num1 + num2);
		 System.out.println("Addtion of non static from Different class is "+(num1 + num2));
	}


}
