package StaticMethods;

public class Staticmethod2 {
	
	public static void main(String[] args) 
	{
		System.out.println("This is the first statement that will print under main method");
		
		method();
		
		System.out.println("This statement will run uafter statioc method calls");
	}
	
	public static void method()
	{
		System.out.println("Static method that will run under same class");
	}

}
