package Do_While;

public class PrintEvenandODD {
	
	public static void main(String[] args) 
	{
		int iNum = 1;
		 do
		 {
						 
			 if(iNum % 2 == 0)
			 {
				 System.out.println("Even Number is "+ iNum);
			 }
			 
			 else if(iNum % 2 == 1)
			 {
				 System.out.println("Odd number is "+ iNum);
			 }
			 
			 else 
			 {
				System.out.println(" Print Nothing"); 
			 }
			 
			 System.out.println("------------------------------------------------------------");
			 
			 iNum++;
			 
		 }while(iNum <= 20);
	}

}
