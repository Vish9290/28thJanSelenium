package Browser1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String str = driver.getCurrentUrl();
		
		System.out.println(str);
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
