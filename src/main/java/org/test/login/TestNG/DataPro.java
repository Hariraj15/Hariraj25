package org.test.login.TestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro extends ExcelPro {
	static WebDriver w;
	@Test(dataProvider="res")
	public void login(String s1,String s2,String s3) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-Hari\\TestNG\\driver\\chromedriver.exe");
		w=new ChromeDriver();
		w.get("http://demo.automationtesting.in/Register.html");
		WebElement first = w.findElement(By.xpath("//input[@ng-model='FirstName']"));
		first.sendKeys(s1);
		WebElement last = w.findElement(By.xpath("//input[@ng-model='LastName']"));
		last.sendKeys(s2);
		WebElement pho = w.findElement(By.xpath("//input[@ng-model='Phone']"));
		pho.sendKeys(s3);
		WebElement q = w.findElement(By.id("submitbtn"));
		q.click();
	}
		@DataProvider(name ="res", parallel=true )
		public Object[][] data() throws IOException {
		
			return getData();
			
		}
		
		
		

	}
	
		
	



