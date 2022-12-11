package com.hammad.automations.zoho;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Zoho_Mail_TestCase {
	private static WebDriver driver;
	@BeforeClass
	public static void launch_Zoho() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium webdrivers\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.navigate().to("https://www.zoho.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	@Test
	public void goToCustomers() throws Exception {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[1]")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		}
	/*@Test
	public void goToSupport() throws Exception {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[2]")).click();
		Thread.sleep(5000);
		
	}*/
	@Test
	public void goToContactSales() throws Exception{
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"block-system-main\"]/div/div/div[2]/div/div/div[2]/div[2]/ul/li[1]/h4")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		
	}
	@Test
public void goToSignin() throws Exception {
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[4]")).click();
	driver.findElement(By.id("login_id")).sendKeys("hmd.alm786");
	driver.findElement(By.id("nextbtn")).click();
	driver.findElement(By.id("password")).sendKeys("Hmd786alm$");
	driver.findElement(By.id("nextbtn")).click();
	Thread.sleep(5000);
}
	@Test
public void compose_Mail() throws Exception {
	driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[9]/div/a/div")).click();
	Thread.sleep(15000);
	}
@AfterClass
public static void closed_driver()throws Exception{
	Thread.sleep(8000);
	driver.close();
	
}

}
