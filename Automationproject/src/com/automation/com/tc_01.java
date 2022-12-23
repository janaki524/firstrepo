package com.automation.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cyberheights3\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.get("https://practice.automationtesting.in/");
		
		driver.findElement(By.linkText("My Account")).click();
		   
		// enter registered username in username textbox
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("janaki@gmail.com");

		//Enter password in password textbox
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("janaki$1234");

		//Click on login button and User must successfully login to the web page
		driver.findElement(By.name("login")).click();

		String actmessage=driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul/li")).getText();
		String expmessage="login succesful";
		System.out.println("actmessage");
		if(expmessage==actmessage) {
			System.out.println("test is pass");
		}
	
		else
		{
			System.out.println("test is fail");
		}
		
	}
}


