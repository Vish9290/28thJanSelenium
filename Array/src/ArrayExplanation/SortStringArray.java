package ArrayExplanation;

import java.util.Arrays;

public class SortStringArray
{
	public static void main(String[] args) 
	{
		
		String str[] = new String[5];
		
		str[0] = "Gnaesh";
		str[1] = "Vishal";
		str[2] = "Prajakta";
		str[3] = "Neha";
		str[4] = "Rakesh";
		
		Arrays.sort(str);

		for(int i = 0; i<= str.length-1; i++)
		{
			System.out.println(str[i]);
		}
	}

}
