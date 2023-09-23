package allModual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logout {

	@Test
	public void logginOut(WebDriver driver) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://parabank.parasoft.com/parabank/overview.htm");
//		
//		driver.findElement(By.name("username")).sendKeys("sahil12");
//		Thread.sleep(1000);
//		driver.findElement(By.name("password")).sendKeys("pass1");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
// 		Thread.sleep(1000);
 		
 		driver.findElement(By.linkText("Log Out")).click();
	}
}
