package com.salesforcebase;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keywords {
	WebDriver driver;
	FileInputStream fis;
	Properties prop;
	public void open() {
		System.setProperty("webdriver.chrome.driver","E://selenium//chromedriver.exe");
		 driver = new ChromeDriver();
		 try {
			 fis = new FileInputStream("E:\\javapgm\\salesforce\\src\\main\\java\\com\\salesforcebase\\ObjectRepository.Properties");
		 prop = new Properties();
		 prop.load(fis);
		 }catch (Exception e) {
			 e.printStackTrace();
		 }
	}

	public void url(String httpUrl) {
		driver.get(httpUrl);
		
	}

	public void input(String testData, String objectName) {
driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(testData);
		
	}

	public void click(String objectName) {
		driver.findElement(By.xpath(prop.getProperty(objectName))).click();
		
	}

	public void close() {
		driver.close();
		
	}

	public void inputbyname(String testData, String objectName) {
		driver.findElement(By.name(prop.getProperty(objectName))).sendKeys(testData);
		
	}

}
