package ArrayExplanation;

public class ClassArray
{
	public static void main(String[] args)
	{
		//String Decleration
	 String arr[] = new String[5];
		
		arr[0] = "Rohit";
		arr[1] = "Rakesh"; 
		arr[2] = "Nisarg";
		arr[3] = "Aaorn"; 
		arr[4] = "Pooja";
				
		//String arr1{5] = {"Rohit","Rakesh","Nisarg","Aaron","Pooja"};
		
		for(int i = 0; i<= arr.length-1; i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
