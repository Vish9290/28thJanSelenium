package Inherit;

public class Child extends Parent
{
	
	public void bike()
	{
		System.out.println(" Son have one bike");
	}
	
	
	public static void main(String[] args) 
	{
		Child cl = new Child();
		cl.bike();
		cl.Car();
		cl.Home();
		cl.Money();
		
	}
	
}
