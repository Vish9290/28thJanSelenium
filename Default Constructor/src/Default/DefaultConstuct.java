package Default;

public class DefaultConstuct 
{
	
	// Default constructor code which we cannot see
	// DefaultConstrut
	//{
			//Default constructor block
	//}
	
	
	public static void main(String[] args) 
	{
		System.out.println("I am main");
	
		DefaultConstuct d1  = new DefaultConstuct();
		d1.m1();
		d1.m2();
		
		 DefulatConstructorOFanotherClass d2 = new  DefulatConstructorOFanotherClass();
		 d2.m3();
		
	}
	
	
	public void  m1()
	{
		System.out.println(" Running mthod m1");
	}
	
	public void m2()
	{
		System.out.println(" Running method m2");
	}
		

}
