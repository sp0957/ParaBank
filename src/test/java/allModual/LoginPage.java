package allModual;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	ExtentReports extent;//specify the location of the report 
	ExtentTest test;// what details should  be populated in the report 
	
	public void startreport() {
		extent=new ExtentReports();
		
	}
	
	
	public void  enterUsername(WebDriver driver, String username) throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(1000);
	}
	
	public void enterPassword(WebDriver driver,String password) throws InterruptedException {
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(1000);
	}
	
	public void clickLogin(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(1000);
	}
	
}
