package com.example.seleniumdemo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SomeSiteTest {

	private static WebDriver driver;
	WebElement element;

	@BeforeClass
	public static void driverSetup() {
		System.setProperty("webdriver.chrome.driver", "/home/krakmis/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	@Test
	public void seleniumFrameworkPracticeTest(){
		driver.get("http://www.seleniumframework.com/Practiceform/");
		element = driver.findElement(By.name("vfb-10"));
		element.clear();
		element.sendKeys("Cos Tam Pisze");
		element = driver.findElement(By.className("vfb-text"));
		element.clear();
		element.sendKeys("Nowy Tekst");
		
		driver.findElement(By.id("vfb-6-1")).click();
		driver.findElement(By.id("vfb-7-3")).click();
		
		driver.findElement(By.id("vfb-3")).sendKeys("93");
		driver.findElement(By.name("vfb-submit")).click();
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    assertNotNull(screenshot);
		
		try {
			FileUtils.copyFile(screenshot, new File("/home/krakmis/SeleniumPage.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		assertTrue(true);
	}
	
	
	@Test
	public void pclabPage(){
		driver.get("http://pclab.pl/");
		driver.findElement(By.xpath("/html/body/div[@id='container']/div[@id='contentcontainer']/div[@id='contenttabwrapper']/div[@id='contentwrapper']/div[@id='headerwrapper']/div[@id='header']/div[@class='left']/div[@class='menu']/ul/li[6]/a[@class='contests']")).click();
		element = driver.findElement(By.xpath("/html/body/div[@id='container']/div[@id='contentcontainer']/div[@id='contenttabwrapper']/div[@id='contentwrapper']/div[@id='headerwrapper']/div[@id='header']/div[@class='left']/div[@class='menu']/ul/li[6]/a[@class='contests']"));
		assertTrue(true);
	}

	@Test
	public void searchTest(){
		driver.get("http://pclab.pl/");
		driver.findElement(By.name("search")).sendKeys("lg");
		driver.findElement(By.xpath("/html/body/div[@id='container']/div[@id='contentcontainer']/div[@id='contenttabwrapper']/div[@id='contentwrapper']/div[@id='headerwrapper']/div[@id='header']/div[@class='right']/div[@id='s001']/div[@class='internal']/form/div[@class='go']/input")).click();
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    assertNotNull(screenshot);

		try {
			FileUtils.copyFile(screenshot, new File("/home/krakmis/nowy.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/div[@id='container']/div[@id='contentcontainer']/div[@id='contenttabwrapper']/div[@id='contentwrapper']/div[@id='content']/div[@id='main']/div[@class='content search']/div[@class='main']/div[@class='list']/div[@class='element first']/div[@class='title']/a")).click();
		driver.findElement(By.linkText("Strona 6")).click();
		boolean b = driver.getPageSource().contains("Odczyt płyt porysowanych");
		assertTrue(b);
		
	}
	
	@AfterClass
	public static void cleanp() {
		driver.quit();
	}
}
