package Protected;

public class ProtectedClass 
{
	protected int d;
	
	protected ProtectedClass() 
	{
		d = 20;
			
	}
	
	protected void printsquare()
	{
		System.out.println(d*d);
	}
	
	public static void main(String[] args) 
	{
		ProtectedClass pr = new ProtectedClass();
		pr.printsquare();
		System.out.println(pr.d);
	}
}
