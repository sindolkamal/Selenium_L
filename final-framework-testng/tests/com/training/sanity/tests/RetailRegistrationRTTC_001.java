package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RegistrationPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class RetailRegistrationRTTC_001 {
	
	private WebDriver driver;
	private String baseUrl;
	private RegistrationPOM registrationPOM;
	private static Properties properties;
	private ScreenShot screenShot;

		
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		registrationPOM = new RegistrationPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() {
		
		WebElement register=driver.findElement(By.xpath("//i[@class='fa fa-user-o']"));
		Actions Reg=new Actions(driver);
		Reg.moveToElement(register).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'LOGIN / REGISTER')]")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		
		
		registrationPOM.sendFirstName("reva");
		registrationPOM.sendLastName("sharma");
		registrationPOM.sendEmail("chandana4@gmail.com");
		registrationPOM.sendTelephone("9345677833");
		registrationPOM.sendAddress_1("Jayanagar");
		registrationPOM.sendAddress_2("bangalore");
		registrationPOM.sendCity("bangalore");
		registrationPOM.sendPostcode("560018");
		registrationPOM.selectcountry("India");
		registrationPOM.selectzone("Karnataka");
		registrationPOM.sendPassword("reva123");
		registrationPOM.sendConfirm("reva123");
		registrationPOM.clickradio();
		registrationPOM.clickCheck();		
		registrationPOM.clickContinue(); 
		screenShot.captureScreenShot("First");
	}
}