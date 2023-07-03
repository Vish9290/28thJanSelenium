package Public;

public class PublicClass
{
	public int a;
	public int b;
	
	
	public PublicClass() 
	{
		a = 10;
		b = 20;
	}
	
	
	public void add() 
	{
	 System.out.println(a+b);

	}
	
	public static void main(String[] args) 
	{
		PublicClass p1 = new PublicClass();
		p1.add();
	}
}
