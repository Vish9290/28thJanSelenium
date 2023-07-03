package Construct;

public class NoParameterConstruct 
{
	
	int iNum1;
	int iNum2;
	
	NoParameterConstruct() 
	{
		iNum1 = 30;
		iNum2 = 20;
	}
	
	public static void main(String[] args)
	{
		System.out.println(" I am in main");
		
		NoParameterConstruct add = new NoParameterConstruct();
		add.Addition();
		add.Substarction();
		
		System.out.println("---------------------------------------------------------------");

		UserDefineConstruct1 Mult= new UserDefineConstruct1();
		
		Mult.mult();
		
	}
	
	public void Addition()
	{
		System.out.println(iNum1 + iNum2);
	}

	public void Substarction()
	{
		System.out.println(iNum1 - iNum2);
	}
	
}
