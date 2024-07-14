package com.July2024.v100;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import POMSearch.POMSearch;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTest {
	public WebDriver driver = null;

	@BeforeClass
	public void tearSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void f() {
		driver.manage().window().maximize();
		POMSearch ss=new POMSearch(driver);
		ss.SendFirst("xx");
		ss.SendLast("xxx");
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

	@Test(priority = 2)
	public void QA() {
		driver.manage().window().maximize();
		POMSearch ss=new POMSearch(driver);
		ss.clickQA();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
