package StaticMethods;

public class StactiMethodsClass1
{
	public static void main(String args[])
	{
		System.out.println("Main method is static method");
		
		 StaticMethodSameClass(); //static method call from same class
		 
		 StaticmethodfromdifferentClass.StaticDifferentClass();
		
	}
	
	// Static method fromn same class
	public static void StaticMethodSameClass()
	{
		System.out.println(" Static method from same class");
	}

}
