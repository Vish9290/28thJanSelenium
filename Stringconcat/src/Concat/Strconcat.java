package Concat;

public class Strconcat
{
	// Global variables
	String str1;
	String str2;
	String str3;
	
	
	// constructor with no parameters
	
	public Strconcat()
	{
		str1 = "abc";
		str2 = "xyz";
		str3 = "pqr";
		
	}
	
	public static void main(String[] args)
	{
		
		Strconcat s1 = new Strconcat();
		s1.StringConacat();
 		
	}

	
	// Strinconcationation function non static method
	
	public void StringConacat()
	{
		System.out.println(str1 = str1.concat(str2).concat(str3));
	}
}
