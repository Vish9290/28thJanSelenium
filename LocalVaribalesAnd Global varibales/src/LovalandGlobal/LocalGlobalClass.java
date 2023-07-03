package LovalandGlobal;

import java.sql.Savepoint;

public class LocalGlobalClass
{
	
	int Globalvariable= 20; /// Variable that delcare outside any method ot block or Consstructior is called Global variable 
							// Scope of Global varibale is thought the program 
							// Global varaibales are permanant.
	
		public static void main(String[] args) 
		{
				int Localvariable = 10;  // Varaibale declare inside method or within a particular method block are called local variables
				                // Local varibale will not be accessible outside the block.
								// Scope of local varaibale is within the block.
				                // Local varaibales are temporary.
				
				
				
		}

}
