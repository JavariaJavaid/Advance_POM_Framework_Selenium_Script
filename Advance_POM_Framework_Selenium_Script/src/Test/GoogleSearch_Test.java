package Test;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.GoogleSearch_Page;
public class GoogleSearch_Test
{
	private static WebDriver driver =null;
	public static void main(String Args[])
	{
		
		GoogleSearch();
		DarkTheme();
		CloseDriver();
	}
	public static void GoogleSearch()
	{
		System.setProperty("webdriver.chrome.driver","D:\\PSEB\\SETUP\\chromedriver 104\\chromedriver.exe");
		driver=new ChromeDriver();
		String BaseURL="https://www.google.com";
		driver.get(BaseURL);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		
		GoogleSearch_Page GoogleSearchObj = new GoogleSearch_Page(driver);
		GoogleSearchObj.Search_field("Selenium Automation");
		GoogleSearchObj.Search_button();
		System.out.print("Google Search test pass");
	}
	
	public static void DarkTheme()
	{
		System.setProperty("webdriver.chrome.driver","D:\\PSEB\\SETUP\\chromedriver 104\\chromedriver.exe");
		driver=new ChromeDriver();
		String BaseURL="https://www.google.com";
		driver.get(BaseURL);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		
		GoogleSearch_Page GoogleSearchObj = new GoogleSearch_Page(driver);
		GoogleSearchObj.Setting_button();
		GoogleSearchObj.DarkTheme_Option();
		//again for turnOFF ..Testing Purpose
		
		System.out.print("Dark Theme test pass");
	}
	
	public static void CloseDriver()
	{
		driver.close();
	}
}