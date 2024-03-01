package org.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeliverDetails 
{
	private WebDriver driver;
    private WebDriverWait wait;

    public DeliverDetails(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       }

	
	public void delivery()
	{
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[5]/div[2]/div/div[2]/div/input[1]")).click();
		driver.findElement(By.xpath("button-payment-method")).click();
		driver.findElement(By.xpath("button-confirm")).click();
	
	}
}
