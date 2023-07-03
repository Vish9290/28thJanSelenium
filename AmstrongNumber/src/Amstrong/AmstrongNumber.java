package Amstrong;

import javax.swing.plaf.synth.SynthStyle;

public class AmstrongNumber 
{
	public static void main(String[] args) 
	{
		
		int iNum = 371;
		int remainder = 0;
		int iSum = 0;
		int temp = iNum;
		
		while(iNum > 0)
		{
			remainder = iNum % 10;
			iSum = iSum + (remainder * remainder * remainder);
			iNum = iNum / 10;
			
		}
		
		if(temp == iSum)
		{
			System.out.println(" Number is Amstrong");
		}
		
		else
		{
			System.out.println("Number is not Amstrong");
		}
		
	}
	
}
