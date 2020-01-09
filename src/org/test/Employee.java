package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employee {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtUserName=driver.findElement(By.id("email"));
		txtUserName.sendKeys("Ramakotamma");
		WebElement txtPassWord=driver.findElement(By.id("pass"));
		txtPassWord.sendKeys("Rama@1992");
		//driver.quit();
	}

}
