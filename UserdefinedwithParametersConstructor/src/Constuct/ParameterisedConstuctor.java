package Constuct;

public class ParameterisedConstuctor 
{
	
	int iNum1;
	int iNum2;

	ParameterisedConstuctor()
	{
		 iNum1 =10;
		 iNum2 =20;
		
	}
	
		
	public ParameterisedConstuctor(int i, int j) 
	{
		iNum1 = i;
		iNum2 = j;
	}
	
	public static void main(String[] args) 
	{
	
		System.out.println(" In main method");
		
		
		// Parmeteristed  constrauctaor call
		ParameterisedConstuctor pc = new ParameterisedConstuctor(30,20);
		pc.add();
		pc.sub();
		
		System.out.println("-----------------------------------------");
		
		ParameterisedConstuctor pc1 = new ParameterisedConstuctor();
		pc1.add();
		pc1.sub();
	
	}
	
	public void add()
	{
		System.out.println("Addition of two number is "+ (iNum1 + iNum2));
	}
	
	public void sub()
	{
		System.out.println("Substarcion of two number is "+ (iNum1 - iNum2));
	}
	
}
