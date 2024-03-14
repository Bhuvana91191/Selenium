package org.apache.maven.quickstart.SeleniumMarch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public void locatorconcepts() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement username =driver.findElement(By.id("email"));
		//WebElement username =driver.findElement(By.name("email"));
		//WebElement username =driver.findElement(By.className("inputtext _55r1 _6luy"));

		username.sendKeys("sathish");
		Thread.sleep(1000);
		username.clear();
		// OR
		driver.findElement(By.id("email")).sendKeys("kumar");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Locators L = new Locators();
		L.locatorconcepts();
	}

}
