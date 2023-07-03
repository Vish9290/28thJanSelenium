package AccessSpecifier;

public class Private
{
     private int a;
	 private int b;
	 
	 
	 public static void main(String[] args) 
	 {
		Private pv =new Private();
		pv.add();
	 }
	   private void add()
	 {
		 	
		 	System.out.println(a + b);
	 
	 }
}
