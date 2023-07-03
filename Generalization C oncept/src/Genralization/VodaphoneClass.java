package Genralization;

public class VodaphoneClass implements GenralizationInerface
{
	public void sms()
	{
		System.out.println(" SMS: 100");
	}
	
	public void RechargeAC()
	{
		System.out.println(" Recharge : 500");
	}
	
	public void datapack()
	{
		System.out.println(" Data : 1GB");
	}
	
	public void ExtraMethod()
	{
		System.out.println(" Exta method of Vodaphone");
	}
}
