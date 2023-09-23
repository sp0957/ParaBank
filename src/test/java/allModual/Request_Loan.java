package allModual;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Request_Loan {
	

	
		@Test(priority = 1)
		public void downpayment(WebDriver driver) throws InterruptedException, IOException {
//			WebDriverManager.chromedriver().setup();
//			 driver=new ChromeDriver();
//			driver.get("https://parabank.parasoft.com/parabank/overview.htm");
//			
//			driver.findElement(By.name("username")).sendKeys("sahil12");
//			Thread.sleep(1000);
//			driver.findElement(By.name("password")).sendKeys("pass1");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//input[@value='Log In']")).click();
//			Thread.sleep(1000);
//			
			driver.findElement(By.linkText("Request Loan")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("amount")).sendKeys("5000");
			Thread.sleep(1000);
			driver.findElement(By.id("downPayment")).sendKeys("50");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='Apply Now']")).click();
			Thread.sleep(2000);
			TakesScreenshot sT=(TakesScreenshot)driver;
 			File file=sT.getScreenshotAs(OutputType.FILE);
 			File trg=new File("D:\\ParaBank\\Screenshort\\requestloan(giving_down_payment).png");
 			FileUtils.copyFile(file, trg);
 			Thread.sleep(2000);
			WebElement status=driver.findElement(By.id("loanStatus"));
			  if (status.getText().equals("Approved")) {
				  System.out.println("Test is Pass");
			}
			  else {
				  System.out.println("Test is failed");
			}
			  
			
		}
		@Test(priority = 2)
		public void valid(WebDriver driver) throws InterruptedException, IOException {
//			WebDriverManager.chromedriver().setup();
//			 driver=new ChromeDriver();
//			driver.get("https://parabank.parasoft.com/parabank/overview.htm");
//			
//			driver.findElement(By.name("username")).sendKeys("sahil12");
//			Thread.sleep(1000);
//			driver.findElement(By.name("password")).sendKeys("pass1");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//input[@value='Log In']")).click();
//			Thread.sleep(1000);
			
			driver.findElement(By.linkText("Request Loan")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("amount")).sendKeys("5000");
			Thread.sleep(1000);
			driver.findElement(By.id("downPayment")).sendKeys("3000");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='Apply Now']")).click();
			Thread.sleep(2000);
			TakesScreenshot sT=(TakesScreenshot)driver;
 			File file=sT.getScreenshotAs(OutputType.FILE);
 			File trg=new File("D:\\ParaBank\\Screenshort\\requestloan(valid).png");
 			FileUtils.copyFile(file, trg);
 			Thread.sleep(2000);
			WebElement status=driver.findElement(By.id("loanStatus"));
			  if (status.getText().equals("Approved")) {
				  System.out.println("Test is Pass");
			}
			  else {
				  System.out.println("Test is failed");
			}
			  
			
		}
		
		@Test(priority = 3)
		public void invalid(WebDriver driver) throws InterruptedException, IOException {
//			WebDriverManager.chromedriver().setup();
//			 driver=new ChromeDriver();
//			driver.get("https://parabank.parasoft.com/parabank/overview.htm");
//			
//			driver.findElement(By.name("username")).sendKeys("sahil12");
//			Thread.sleep(1000);
//			driver.findElement(By.name("password")).sendKeys("pass1");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//input[@value='Log In']")).click();
//			Thread.sleep(1000);
			
			driver.findElement(By.linkText("Request Loan")).click();
			
			
			Thread.sleep(1000);
			driver.findElement(By.id("amount")).sendKeys("5000000000000000000000000000000");
			Thread.sleep(1000);
			driver.findElement(By.id("downPayment")).sendKeys("0");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='Apply Now']")).click();
			TakesScreenshot sT=(TakesScreenshot)driver;
 			File file=sT.getScreenshotAs(OutputType.FILE);
 			File trg=new File("D:\\ParaBank\\Screenshort\\requestloan(big amount).png");
 			FileUtils.copyFile(file, trg);
 			Thread.sleep(2000);
			WebElement status=driver.findElement(By.id("loanStatus"));
			if (status.getText().equals("Denied")) {
				System.out.println("Test IS Pass");
			} else {
				System.out.println("Test IS failed");
			}
			
		}
		
		
	
}
