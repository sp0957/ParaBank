package allModual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Letests_News_Page {
	@Test
	public void news(WebDriver driver) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("ParaBank Is Now Re-Opened")).click();
		Thread.sleep(2000);
		
		
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.linkText("New! Online Bill Pay")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.linkText("New! Online Account Transfers")).click();
		
		String n=driver.findElement(By.xpath("//h1[normalize-space()='ParaBank News']")).getText();
		if (n.equals("ParaBank News")) {
			System.out.println("Test Is pass");
		} else {
			System.out.println("Test IS Failed");
		}
	}

}
