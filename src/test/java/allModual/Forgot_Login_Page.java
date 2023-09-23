package allModual;


import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Forgot_Login_Page {
	
	@Test
	public String[][] readexcel() throws InvalidFormatException, IOException {
		String[][]data=null;
		String filepath="D:\\sahil learn\\Automation testing\\Sahilselenium\\ParaBanking.xlsx";
		File file=new File(filepath);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		Sheet sheet=workbook.getSheet("Forgot_Login_info");
		int r_num=sheet.getPhysicalNumberOfRows();
		System.out.println("Total Row is..."+r_num);
		
		data=new String[r_num][]; 
		for (int i = 0; i < data.length; i++) {
			Row row=sheet.getRow(i);
			int c_num= row.getPhysicalNumberOfCells();
			System.out.println("Total Cell is.."+c_num);
			
			
			data[i]=new String[c_num];
			for (int j = 0; j < data[i].length; j++) {
				Cell cell=row.getCell(j);
				cell.setCellType(CellType.STRING);
				data[i][j]=cell.getStringCellValue();
			}
			
		}
		
		
		return data;
	}
	
	@Test
	public void forgot_page() throws InterruptedException, InvalidFormatException, IOException {
		String[][]data=readexcel();
		for (int i = 0; i < data.length; i++) {
			
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Forgot login info?")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys(data[i+1][0]);
		driver.findElement(By.name("lastName")).sendKeys(data[i+1][1]);
		driver.findElement(By.name("address.street")).sendKeys(data[i+1][2]);
		driver.findElement(By.name("address.city")).sendKeys(data[i+1][3]);
		driver.findElement(By.name("address.state")).sendKeys(data[i+1][4]);
		driver.findElement(By.name("address.zipCode")).sendKeys(data[i+1][5]);
		driver.findElement(By.name("ssn")).sendKeys(data[i+1][6]);
		
		
		Thread.sleep(4000);
		  driver.findElement(By.xpath("//input[@value='Find My Login Info']")).click();
		Thread.sleep(5000);
		String prentwindow=driver.getWindowHandle();
		
		for (String chaildwindow : driver.getWindowHandles()) {
			if (!chaildwindow.equals(prentwindow)) {
				driver.switchTo().window(chaildwindow);
				break;
				
			} 
			
		}
		
//		
		//Alert alert=driver.switchTo().window(driver);
//		System.out.println("frist alert is:"+alert.getText());
//		Thread.sleep(2000);
//		alert.accept();
//		Thread.sleep(2000);
		
//		Alert alert=driver.switchTo().alert();
//		System.out.println("frist alert is:"+alert.getText());
//		alert.accept();
		
		
		
  		
			
		}
	}

}
