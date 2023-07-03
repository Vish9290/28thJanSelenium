package Abstract;

abstract public class AbstractExample 
{
	int iNum1 = 30; 
	int iNum2 = 20;
	
	public void Add()
	{
		System.out.println(iNum1 + iNum2);
	}
	
	public void Sub()
	{
		System.out.println(iNum1 - iNum2);
	}
	
	abstract public void mult();
	
	abstract public void div(); 

}
