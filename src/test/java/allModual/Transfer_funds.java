package allModual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Transfer_funds {
	@Test
	public void funds(WebDriver driver) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		

//		driver.findElement(By.name("username")).sendKeys("sahil12");
//		Thread.sleep(1000);
//		driver.findElement(By.name("password")).sendKeys("pass1");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
//		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Transfer Funds")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("input")).sendKeys("500");
		Thread.sleep(1000);
		Select select=new Select(driver.findElement(By.id("fromAccountId")));
		select.selectByVisibleText("12345");
		Thread.sleep(2000);
		Select select1=new Select(driver.findElement(By.id("toAccountId")));
		select1.selectByVisibleText("12345");
		
		driver.findElement(By.xpath("//input[@value='Transfer']")).click();
		
		if (driver.getTitle().equals("ParaBank | Transfer Funds")) {
			System.out.println("Transfer is complte");
		} else {

		}
		
	}

}
