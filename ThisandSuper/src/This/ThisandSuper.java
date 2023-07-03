package This;

public class ThisandSuper extends Super
{
	int i =20;
	
	public static void main(String[] args) 
	{
		
		 ThisandSuper obj = new ThisandSuper();
		 obj.m1();
		 
	}
	
	public void m1()
	{
		int i = 10;
		
		System.out.println("Print value of i "+ i);		
		System.out.println("Print value of i "+ this.i);
		System.out.println("Print value of i "+ super.i);
	}

}
