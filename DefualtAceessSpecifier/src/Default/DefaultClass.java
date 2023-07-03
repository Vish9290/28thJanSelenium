package Default;

public class DefaultClass
{
	
	int b;
	
	public DefaultClass() 
	{
	   b = 10;
	}
	
		void PrintCube()
	{
		System.out.println(b*b*b);
	}
	
	public static void main(String[] args) 
	{
		
		DefaultClass dc = new DefaultClass();
		dc.PrintCube();
		
	}

}
