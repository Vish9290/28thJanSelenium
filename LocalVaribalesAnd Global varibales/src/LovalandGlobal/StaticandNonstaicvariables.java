package LovalandGlobal;

public class StaticandNonstaicvariables
{
	static int i = 10;
	
	public static void main(String[] args) 
	{
				
			System.out.println(i); // statci varaibale can be access in sttaic methods using variable name 
			
			StaticandNonstaicvariables.m2(); // calling static method in same class callsname. methodname();
			
			
			StaticandNonstaicvariables NonStaatic = new StaticandNonstaicvariables(); // Calling non static method within same class 
			                                                // For that  create object of name class and syntax object name.methodname();
			NonStaatic.m1();
				
			System.out.println(StatciGlobalVaribaleDifferntClass.global2);
	
			//System.out.println()	
	}
	
	public void m1()
	{
		System.out.println(StatciGlobalVaribaleDifferntClass.global2);
	}
	public static void m2()
	{
		System.out.println(i);
		System.out.println(StatciGlobalVaribaleDifferntClass.global2);
	}

}
