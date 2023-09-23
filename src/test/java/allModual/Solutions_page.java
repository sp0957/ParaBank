package allModual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Solutions_page {
	
	public void solution() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
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
	}

}
