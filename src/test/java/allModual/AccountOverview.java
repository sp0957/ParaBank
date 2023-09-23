package allModual;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccountOverview  {
	
	@Test
	public void overview(WebDriver driver) throws InterruptedException {
		driver.get("https://parabank.parasoft.com/parabank/overview.htm");
		
		driver.findElement(By.name("username")).sendKeys("sahil12");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("pass1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
 		Thread.sleep(1000);
		driver.findElement(By.linkText("Accounts Overview")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("ng-binding")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("button")).click();
		Thread.sleep(1000);
		
		
		Thread.sleep(1000);
		
		
	}

}
