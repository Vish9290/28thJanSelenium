package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathcontainsattributes2
{
	
	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]")).sendKeys("Vishalbande19@gmail.com");
		
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("vVish@1990");
		
		driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
		
	}

}
