package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyAttribute
{
	
	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Vishalbande19@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("vVish@1990");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
