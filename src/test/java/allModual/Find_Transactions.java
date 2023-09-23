package allModual;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Find_Transactions {
	
	
	
	
//	WebDriver driver=null;
	@Test
	public void Transaction(WebDriver driver) throws InterruptedException {
		
//		WebDriverManager.chromedriver().setup();
//		 driver=new ChromeDriver();
//		driver.get("https://parabank.parasoft.com/parabank/overview.htm");
//		
//		driver.findElement(By.name("username")).sendKeys("sahil12");
//		Thread.sleep(1000);
//		driver.findElement(By.name("password")).sendKeys("pass1");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
//		Thread.sleep(1000);
		
//		driver.findElement(By.linkText("Find Transactions")).click();
	}
	@Test
	public void findbyidd(WebDriver driver) throws InterruptedException {
		driver.findElement(By.linkText("Find Transactions")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("criteria.transactionId")).sendKeys("14476");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@ng-click=\"criteria.searchType = 'ID'\"]")).click();
		if (driver.getTitle().equals("ParaBank | Find Transactions")) {
			System.out.println("Test is Pass");
		} else {
			System.out.println("Test is failed");
		}
	}
	@Test
	public void findbyDate(WebDriver driver) throws InterruptedException {
		driver.findElement(By.linkText("Find Transactions")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("criteria.onDate")).sendKeys("07-06-2023");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@ng-click=\"criteria.searchType = 'ID'\"]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		}
	@Test
	public void findbyDateRang(WebDriver driver) throws InterruptedException {
		driver.findElement(By.linkText("Find Transactions")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("criteria.fromDate")).sendKeys("05-06-2023");
		Thread.sleep(1000);
		driver.findElement(By.id("criteria.toDate")).sendKeys("08-06-2023");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@ng-click=\"criteria.searchType = 'ID'\"]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}
	@Test
	public void amount(WebDriver driver) throws InterruptedException {
		driver.findElement(By.linkText("Find Transactions")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("criteria.amount")).sendKeys("100");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@ng-click=\"criteria.searchType = 'ID'\"]")).click();
		Thread.sleep(3000);
	}
	
	
	

}
