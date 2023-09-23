package allModual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class All_Logo {
	@Test
	public void logo() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		driver.findElement(By.linkText("home")).click();
		System.out.println("Home Logo is Pass");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.linkText("about")).click();
		String n=driver.findElement(By.xpath("//h1[normalize-space()='ParaSoft Demo Website']")).getText();
		if (n.equals("ParaSoft Demo Website")) {
			System.out.println("About Logo Test Is Pass..");
		}else {
			System.out.println("About Logo Test Is failed..");
		}
	
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("contact")).click();
		
		driver.findElement(By.name("name")).sendKeys("DEMOUSER");
		driver.findElement(By.name("email")).sendKeys("DEMOUSER1@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("1212112121");
		driver.findElement(By.name("message")).sendKeys("THIS IS MESSAGE IS IS DEMO>>>>>>>>>...");
		driver.findElement(By.xpath("//input[@value='Send to Customer Care']")).click();
		
		  String message=driver.findElement(By.xpath("//p[normalize-space()='Thank you DEMOUSER']")).getText();
		  if (message.contains("Thank you")) {
			System.out.println("Test pass with Valid information(contact logo)");
		} else {
			System.out.println("Test is failed...(valid)");
		}
		  Thread.sleep(2000);
		  driver.navigate().to("https://parabank.parasoft.com/parabank/contact.htm");
		  driver.findElement(By.name("name")).sendKeys("@@@@");
		  driver.findElement(By.name("email")).sendKeys("#####");
		  driver.findElement(By.name("phone")).sendKeys("abcefg");
		  driver.findElement(By.name("message")).sendKeys("0000000000000");
		  driver.findElement(By.xpath("//input[@value='Send to Customer Care']")).click();
		
		  
		  String mes=driver.findElement(By.xpath("//p[normalize-space()='Thank you @@@@']")).getText();
		  if (mes.contains("Thank you")) {
			System.out.println("Test pass with invalid information(contact logo)");
		} else {
			System.out.println("Test is failed...(invalid)");
		}
		  
		  
		  Thread.sleep(2000);
		  driver.navigate().to("https://parabank.parasoft.com/parabank/contact.htm");
		  driver.findElement(By.name("name")).sendKeys(" ");
		  driver.findElement(By.name("email")).sendKeys(" ");
		  driver.findElement(By.name("phone")).sendKeys(" ");
		  driver.findElement(By.name("message")).sendKeys(" ");
		  driver.findElement(By.xpath("//input[@value='Send to Customer Care']")).click();
		
		  
		  String message1=driver.findElement(By.xpath("//p[normalize-space()='Thank you']")).getText();
		  if (message1.contains("Thank you")) {
			System.out.println("Test pass with blank information(contact logo)");
		} else {
			System.out.println("Test is failed...(blank)");
		}
		  
		  
	}
}
