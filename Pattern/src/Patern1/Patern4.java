package Patern1;

public class Patern4 
{
	
	public static void main(String[] args) 
	{
		
		//*****
		//****
		//***
		//**
		//*
		
		int iStart = 5;
		
		for(int iRow = 1; iRow <= 5; iRow++)
		{
			for(int jCol = 1; jCol <= iStart; jCol++)
			{
				System.out.print("* ");
			}
			System.out.println();
			iStart--;
		}
		
	}

}
