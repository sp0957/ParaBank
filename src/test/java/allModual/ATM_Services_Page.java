package allModual;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ATM_Services_Page {
	
	
	@Test
	public void atm(WebDriver driver) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.get("https://parabank.parasoft.com/parabank/index.htm");
//	
			Thread.sleep(2000);		
			driver.findElement(By.linkText("Withdraw Funds")).click();
			driver.navigate().back();
			
			
		
			Thread.sleep(2000);
			driver.findElement(By.linkText("Transfer Funds")).click();
		
			Thread.sleep(2000);
			driver.navigate().back();
			driver.findElement(By.linkText("Check Balances")).click();
		
			Thread.sleep(2000);
			driver.navigate().back();
			driver.findElement(By.linkText("Make Deposits")).click();
			Thread.sleep(4000);
			
			driver.close();
		
}
	
}
