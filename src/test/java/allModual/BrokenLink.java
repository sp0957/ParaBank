package allModual;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {
@Test
	public void link() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		  List<WebElement> elements= driver.findElements(By.tagName("a"));
		  List finallist=new ArrayList();
		  for (WebElement webElement : elements) {
			  if (webElement.getAttribute("href")!=null) {
				finallist.add(webElement);
			} 
		}
		
		
	}
}
