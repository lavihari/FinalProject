package org.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPage extends BaseClass
{
	private WebDriver driver;
    private WebDriverWait wait;

    public AddToCartPage(WebDriver driver) 
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    public void addtowishlist()
	{
		driver.findElement(By.xpath("//a[normalize-space()='Laptops & Notebooks']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Show AllLaptops & Notebooks']")).click();
		driver.findElement(By.xpath("//img[@title='HP LP3065']")).click();
	}
    public void addtocart()
    {
    	driver.findElement(By.xpath("//button[@id='button-cart']")).click();    	
    }
	
}
