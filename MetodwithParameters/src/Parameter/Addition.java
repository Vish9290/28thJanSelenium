package Parameter;

public class Addition
{
	public static void main(String[] args) 
	{
		System.out.println(" Addition of two programs");
		
		 Add(10,20); //static method call Same class
		 
		 //Non static method call different Class
		 Addition add1 = new Addition();
		 add1.Addition(30,40);
		 
		 //Static method call different class
		 
		 NonstaticAndStatic.Add(20,60);

		 // Non static method call from different class
		 NonstaticAndStatic add2 = new NonstaticAndStatic();
		 add2.Addition(60,40);
	
	}
	
	public static void Add(int num1, int num2)
	{
		//System.out.println(" Addition of two numbert is "+ num1 + num2);
		System.out.println("Addtion static method from same class is "+(num1 + num2));
	}

	
	public void Addition(int num1, int num2)
	{
		//System.out.println(" Addition of two numbert is "+ num1 + num2);
	    System.out.println("Addtion of non static from same class is "+(num1 + num2));
	}

}
