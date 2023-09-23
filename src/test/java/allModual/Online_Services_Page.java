package allModual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Online_Services_Page {

	public void service(WebDriver driver) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://parabank.parasoft.com/parabank/index.htm");
//	
			Thread.sleep(2000);		
			driver.findElement(By.linkText("Bill Pay")).click();
			driver.navigate().back();
			
			Thread.sleep(2000);		
			driver.findElement(By.linkText("Account History")).click();
			driver.navigate().back();
			
			Thread.sleep(2000);		
			driver.findElement(By.linkText("Transfer Funds")).click();
			driver.navigate().back();
		
	}
}
