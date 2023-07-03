package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyText2 
{
	
	 public static void main(String[] args) 
	 {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 
		 driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	 }

}
