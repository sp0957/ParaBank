package allModual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check_All_Button {
	@Test
	public void check(WebDriver driver) throws InterruptedException {
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://parabank.parasoft.com/parabank/overview.htm");
//		
//		driver.findElement(By.name("username")).sendKeys("sahil12");
//		Thread.sleep(1000);
//		driver.findElement(By.name("password")).sendKeys("pass1");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
//		Thread.sleep(1000);
		WebElement  logo=driver.findElement(By.className("logo"));
		WebElement  logo1=driver.findElement(By.className("admin"));
		
		WebElement  button1=driver.findElement(By.linkText("About Us"));
		WebElement  button2=driver.findElement(By.linkText("Services"));
		WebElement  button3=driver.findElement(By.linkText("Products"));
		WebElement  button4=driver.findElement(By.linkText("Locations"));
		WebElement  button5=driver.findElement(By.linkText("Admin Page"));
		WebElement  button6=driver.findElement(By.linkText("Open New Account"));
		WebElement  button7=driver.findElement(By.linkText("Accounts Overview"));
		WebElement  button8=driver.findElement(By.linkText("Transfer Funds"));
		WebElement  button9=driver.findElement(By.linkText("Bill Pay"));
		WebElement  button10=driver.findElement(By.linkText("Find Transactions"));
		WebElement  button11=driver.findElement(By.linkText("Update Contact Info"));
		WebElement  button12=driver.findElement(By.linkText("Request Loan"));
		WebElement  button13=driver.findElement(By.linkText("Log Out"));
		WebElement  button14=driver.findElement(By.linkText("Home"));
		WebElement  button15=driver.findElement(By.xpath("//div[@id='footermainPanel']//ul[1]//li[2]//a[1]"));
		WebElement  button16=driver.findElement(By.xpath("//div[@id='footermainPanel']//li[3]//a[1]"));
		WebElement  button17=driver.findElement(By.xpath("//div[@id='footermainPanel']//li[4]//a[1]"));
		WebElement  button18=driver.findElement(By.xpath("//div[@id='footermainPanel']//li[5]//a[1]"));
		WebElement  button19=driver.findElement(By.linkText("Forum"));
		WebElement  button20=driver.findElement(By.linkText("Site Map"));
		WebElement  button21=driver.findElement(By.linkText("Contact Us"));
		WebElement  button22=driver.findElement(By.xpath("//a[normalize-space()='home']"));
		WebElement  button23=driver.findElement(By.linkText("about"));
		WebElement  button24=driver.findElement(By.linkText("contact"));
		
		
		
		Actions actions=new  Actions(driver);
		Thread.sleep(2000);
		actions.moveToElement(logo).perform();
		Thread.sleep(2000);
		actions.moveToElement(logo1).perform();
		Thread.sleep(2000);
		actions.moveToElement(button1).perform();
		Thread.sleep(2000);
		actions.moveToElement(button2).perform();
		Thread.sleep(2000);
		actions.moveToElement(button3).perform();
		Thread.sleep(2000);
		actions.moveToElement(button4).perform();
		Thread.sleep(2000);
		actions.moveToElement(button5).perform();
		Thread.sleep(2000);
		actions.moveToElement(button6).perform();
		Thread.sleep(2000);
		actions.moveToElement(button7).perform();
		Thread.sleep(2000);
		actions.moveToElement(button8).perform();
		Thread.sleep(2000);
		actions.moveToElement(button9).perform();
		Thread.sleep(2000);
		actions.moveToElement(button10).perform();
		Thread.sleep(2000);
		actions.moveToElement(button11).perform();
		Thread.sleep(2000);
		actions.moveToElement(button12).perform();
		Thread.sleep(2000);
		actions.moveToElement(button13).perform();
		Thread.sleep(2000);
		actions.moveToElement(button14).perform();
		Thread.sleep(2000);
		actions.moveToElement(button15).perform();
		Thread.sleep(2000);
		actions.moveToElement(button16).perform();
		Thread.sleep(2000);
		actions.moveToElement(button17).perform();
		Thread.sleep(2000);
		actions.moveToElement(button18).perform();
		Thread.sleep(2000);
		actions.moveToElement(button19).perform();
		Thread.sleep(2000);
		actions.moveToElement(button20).perform();
		Thread.sleep(2000);
		actions.moveToElement(button21).perform();
		Thread.sleep(2000);
		actions.moveToElement(button22).perform();
		Thread.sleep(2000);
		actions.moveToElement(button23).perform();
		Thread.sleep(2000);
		actions.moveToElement(button24).perform();
		Thread.sleep(2000);
		
		
	}

}
