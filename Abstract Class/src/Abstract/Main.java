package Abstract;

public class Main 
{
	
	 public static void main(String[] args) 
	 {
		 // AbstractExample ab = new AbstractExampl(); // We cannot crate the object of abstract class
		 
		 Concrete con = new Concrete();
		 con.Add();
		 con.Sub();
		 con.mult();
		 con.div();
		 
	 }
}
