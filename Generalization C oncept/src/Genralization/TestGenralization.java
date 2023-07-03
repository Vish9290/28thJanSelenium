package Genralization;

public class TestGenralization
{
	public static void main(String[] args) 
	{
		System.out.println("Test of Jio");
		
		JioClass J = new JioClass();
		J.ExtraMethod2();
		J.sms();
		J.RechargeAC();
		J.datapack();
		
		
		System.out.println("------------------------------------");
		
		
		System.out.println("Test of Vodaphone");
		
		
		VodaphoneClass vp = new VodaphoneClass();
		vp.ExtraMethod();
		vp.sms();
		vp.RechargeAC();
		vp.datapack();
		
		
		System.out.println("------------------------------------");
		
		System.out.println("Test of Airtel");
		
		
		AirtelClass ai =new AirtelClass();
		ai.ExtraMethod1();
		ai.sms();
		ai.RechargeAC();
		ai.datapack();
		
	}

}
