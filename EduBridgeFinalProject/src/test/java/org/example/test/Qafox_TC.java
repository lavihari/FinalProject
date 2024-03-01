package org.example.test;

import org.demo.AddToCartPage;
import org.demo.HomePage;
import org.demo.LoginPages;
import org.demo.LogoutPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Qafox_TC 
{
	WebDriver driver;
    HomePage homePage;
    LoginPages loginPage;
    AddToCartPage addToCartPage;
    LogoutPage logoutPage;
    
    @BeforeSuite
    public void setUp() {
    	
    	//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win32\\chromedriver.exe\\");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        loginPage = new LoginPages(driver);
        addToCartPage = new AddToCartPage(driver);
        logoutPage = new LogoutPage(driver);
    }
    @BeforeTest
    public void testlogin()
    {
    	homePage.open();
    	homePage.clickmyaccount();
    	homePage.clicklogin();
    	loginPage.login("lavanyag201997@gmail.com", "Lavanya@20");
    	loginPage.loginbutton();
    	addToCartPage.addtowishlist();
    	addToCartPage.addtocart();
    	logoutPage.logout();
    }
    @Test
    public void tearDown() {
        driver.quit();
    }

}
