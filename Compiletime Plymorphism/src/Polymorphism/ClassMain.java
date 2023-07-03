package Polymorphism;

public class ClassMain 
{
	
	public static void main(String[] args) 
	{
		Complietime ct = new Complietime();
		ct.add(10,20);
		ct.add(10,20,30);
		ct.add(10,20,30,40);
		
		Complietime.add(10, 20);
	}

}
