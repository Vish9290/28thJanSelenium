package Pali;

public class Palindrone
{
	
	
	
	public static void main(String[] args) 
	{
		
		 String s12 = "madam";
		 String rev = "";
		 
		 
		for(int i=s12.length()-1; i >= 0; i--)
		{
		   
			rev = rev + s12.charAt(i);
		
		}
		
		System.out.println(rev);
		
		if(s12.equals(rev))
		{
			System.out.println("String is Palindome");
		}
		
		else
		{
			System.out.println(" String is not palindrome");
		}
	}
	

}
