package NonStaticMethods;

public class NonStaticClassMethod {
	
	public static void main(String[] args)
	{
		System.out.println("Main method is always static");
		
		NonStaticClassMethod NonstaticObj = new NonStaticClassMethod();
		
		NonstaticObj.NonstaticMethod();
		
		NonStaticDifferentClass NonstatciObj1 = new NonStaticDifferentClass();
		
		NonstatciObj1.NonstaticDifferentclass();
	
	}
	
	public void NonstaticMethod()
	{
		System.out.println("Running non static method from same class");
	}

}
