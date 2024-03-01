package org.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
	private WebDriver driver;
	private WebDriverWait wait;
	
	public HomePage(WebDriver driver) {
	this.driver = driver;
    this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
}
	public void open()
	{
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	}
	public void clickmyaccount()
	{
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	public void clicklogin()
	{
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a")).click();
	}
}
