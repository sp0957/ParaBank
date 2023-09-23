package allModual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenNewAccountPage {
	@Test
	public void newAcc(WebDriver driver) throws InterruptedException {
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver =new ChromeDriver();
//		driver.get("https://parabank.parasoft.com/parabank/openaccount.htm");
//		
//		driver.findElement(By.name("username")).sendKeys("sahil12");
//		Thread.sleep(1000);
//		driver.findElement(By.name("password")).sendKeys("pass1");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Open New Account")).click();
		Thread.sleep(1000);
		   
		Select select=new Select(driver.findElement(By.xpath("//select[@id='type']")));
		select.selectByVisibleText("SAVINGS");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Open New Account']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("newAccountId")).click();
		Thread.sleep(1000);
		Select select2=new Select(driver.findElement(By.id("month")));
		select2.selectByVisibleText("May");
		Thread.sleep(1000);
		
		Select select3=new Select(driver.findElement(By.id("transactionType")));
		select3.selectByVisibleText("Credit");
		Thread.sleep(1000);
		driver.findElement(By.className("button")).click();
		Thread.sleep(1000);
		
		
		
		if (driver.getTitle().equals("ParaBank | About Us")) {
			System.out.println("Test is Pass");
		} else {
			System.out.println("This Test is failed");
		}
	}

}
