package Varibale1;

public class Variables 
{
	public static void main(String args[])
	{
		String Studname = "Vishal";
		int StudRollno;
		float Studper;
		char Studgrade;
		
		//Studname= "Vishal";
		StudRollno= 10;
		Studper= 72.23f;
		Studgrade= 'A';
		long Rollno1= 99999999;
		System.out.println("Name of student is "+Studname);
		System.out.println("Roll number of student is "+StudRollno);
		System.out.println("Percentage of student is "+Studper);
		System.out.println("Grade of student is "+Studgrade);
		
		System.out.println("Stud roll number "+Rollno1);
		
		
		// Size of data types. 
		System.out.println("Size of interger is "+ Integer.SIZE/8);
		System.out.println("Size of float is "+ Float.SIZE/8);
		System.out.println("Size of char is "+ Character.SIZE/8);
		System.out.println("Size of char is "+ Long.SIZE/8);
		//System.out.println("Size of string is "+ String.SIZE);
	 }
	

}
