package com.JDBC;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.propertisfile.PropertyFile_tc_01;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VtigercrmTest extends PropertyFile_tc_01
{
	@Test
	public void vtiger() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(geturl());
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys(getusername(),Keys.TAB,getpassword(),Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElement(By.cssSelector("img[alt='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys(getorg());
		driver.findElement(By.name("button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElement(By.name("search_text")).sendKeys(getorg());
		WebElement ele=driver.findElement(By.id("bas_searchfield"));
		Select s=new Select(ele);
		s.selectByValue("accountname");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		WebElement ele1=driver.findElement(By.xpath("(//td[@class='small'])[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(ele1).perform();
		Thread.sleep(3000);
		WebElement ele2=driver.findElement(By.xpath("//a[text()='Sign Out']"));
		act.moveToElement(ele2).perform();
		ele2.click();
		
	
		
	}

}
