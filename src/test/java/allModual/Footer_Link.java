package allModual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Footer_Link {
	@Test
	public void footer(WebDriver driver) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://parabank.parasoft.com/parabank/index.htm");
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		Thread.sleep(2000);
		
			driver.navigate().back();
		driver.findElement(By.linkText("About Us")).click();
        Thread.sleep(2000);
			driver.navigate().back();
		driver.findElement(By.linkText("Services")).click();
		
        Thread.sleep(2000);
		
			driver.navigate().back();
		driver.findElement(By.linkText("Products")).click();
		 Thread.sleep(3000);
			driver.navigate().back();
		driver.findElement(By.linkText("Locations")).click();
		 Thread.sleep(3000);
			driver.navigate().back();
		driver.findElement(By.linkText("Forum")).click();
		 Thread.sleep(3000);
			driver.navigate().back();
		driver.findElement(By.linkText("Site Map")).click();
		System.out.println("Test is pass all Footer is working comelate");
		
	}

}
