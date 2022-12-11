package com.hammad.automations.zoho;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoho_mail_compose_Test {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium webdrivers\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.navigate().to("https://www.zoho.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			//click on sign_in
			
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[4]")).click();
			driver.findElement(By.id("login_id")).sendKeys("hmd.alm786");
			driver.findElement(By.id("nextbtn")).click();
			driver.findElement(By.id("password")).sendKeys("Hmd786alm$");
			driver.findElement(By.id("nextbtn")).click();
			driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[9]/div/a/div")).click();
			
			
	}

}
