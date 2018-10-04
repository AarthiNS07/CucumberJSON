package org.cucumber.Flipkart;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestClass 
{
	ConfigFileReader reader=new ConfigFileReader();
	public static WebDriver driver=null;
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\08082018\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get(reader.getApplicationUrl());
	}
	public void windowHandle()
	{
		String pWin=driver.getWindowHandle();
		Set<String> cWins = driver.getWindowHandles();
		for(String all:cWins)
		{
			if(!pWin.equals(all))
			{
				driver.switchTo().window(all);
			}
		}
	}
	public void sendText(WebElement ele,String name)
	{
		ele.sendKeys(name);
	}
	public void btnClick(WebElement ele)
	{
		ele.click();
	}
}
