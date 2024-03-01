package org.demo;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LoginPages 
{			
			private WebDriver driver;
		    private WebDriverWait wait;

		    public LoginPages(WebDriver driver) {
		        this.driver = driver;
		        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		        
	}
		    public void login(String email, String password) {
		    
		        driver.findElement(By.id("input-email")).sendKeys(email);
		        driver.findElement(By.id("input-password")).sendKeys(password);
		    }
		    public void loginbutton()
		    {
		    	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		    }
}
