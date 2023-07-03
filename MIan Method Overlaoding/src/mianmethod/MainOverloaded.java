package mianmethod;

public class MainOverloaded 
{

	
		static int i = 10;
		static char ch1 = 'a';
		static char ch2 = 'b';
		
	public static void main(int iNum1)
	{
		System.out.println("Main method with one integer paramenet");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Orignal main method");
		MainOverloaded.main(i);
		MainOverloaded.main(ch1, ch2);
	}
	
	public static void main(char ch, char ch2)
	{
		System.out.println("Main method with two character paramenet");
	}

}
