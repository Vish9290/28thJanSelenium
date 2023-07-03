package Polymorphism;

public class TestOverriding extends OverRiding
{
	public static void main(String[] args) 
	{
		OverRiding ovr = new OverRiding();
		
	
		ovr.add(10, 20, 30); //RunTimePolymorphism
		ovr.add(10, 20); //RunTimePolymorphism
	}

}
