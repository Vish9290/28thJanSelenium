package New;

public class StaicAndNon_tatic 
{
	static int a = 10;
	public static void main(String[] args) 
	{
		StaicAndNon_tatic.m1();
		StaicAndNon_tatic st = new StaicAndNon_tatic();
		st.m2();
	
	}

	
	public static void m1()
	{
		int a = 30;
		
		System.out.println(a);
		//System.out.println(this.a);
	}
	
	public void m2()
	{
		int b = 20;
		System.out.println(b);
		System.out.println(this.a);
		StaicAndNon_tatic.m1();
	}
	
}
