package Browser1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.model.WindowOpen;

public class BrowserActions
{
	
	public static void main(String[] args) 
	{
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://paytm.com/");
		
		
		d.close();
		
		
	}

}
