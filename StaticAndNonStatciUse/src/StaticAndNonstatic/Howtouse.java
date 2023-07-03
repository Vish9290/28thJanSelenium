package StaticAndNonstatic;

public class Howtouse 
{
	
	public static void main(String[] args) 
	{
		
		UseofStatciNonstatic use = new UseofStatciNonstatic();
		use.studname = "Vishal";
		use.Studid = 101;
		UseofStatciNonstatic.Principlename = "abc";
		
		UseofStatciNonstatic use1 = new UseofStatciNonstatic();
		use1.studname = "Rakesh";	
		use1.Studid = 102;
		UseofStatciNonstatic.Principlename = "abc";
		
		UseofStatciNonstatic use2 = new UseofStatciNonstatic();
		use2.studname = "Priyanka";
		use2.Studid = 103;
		UseofStatciNonstatic.Principlename = "Don";
		
		use.Studinfo();
		use1.Studinfo();
		use2.Studinfo();
		
	}
	

}
