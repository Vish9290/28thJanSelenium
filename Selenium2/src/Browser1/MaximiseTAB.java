package Browser1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximiseTAB
{
	
	
	public static void main(String[] args) 
	{
		
		WebDriver  driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		Options s1 = driver.manage();
//		Window s2 = s1.window();
//		
//		s2.maximize();
//		
		
	}

}