
package allModual;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sign_Up_Page {
	
	@Test
	public String[][] readexcel() throws InvalidFormatException, IOException {
		String[][]data=null;
		
	String filepath="D:\\sahil learn\\Automation testing\\Sahilselenium\\ParaBanking.xlsx";
	File file=new File(filepath);
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	Sheet sheet=workbook.getSheet("Sheet1");
	int r_num=sheet.getLastRowNum();
	System.out.println("Total Row is.."+r_num);
	data=new String[r_num][];
	for (int i = 0; i < data.length; i++) {
		Row row=sheet.getRow(i);
		int c_num=row.getLastCellNum();
		System.out.println("Total Row is.."+c_num);
		
		
		
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
	public void Valid_Data() throws InvalidFormatException, IOException, InterruptedException {
		String[][]data=readexcel();
		WebDriver driver=null;
		
		
		for (int i = 0; i < data.length; i++) {

		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000); 
		
		driver.findElement(By.name("customer.firstName")).sendKeys(data[i+1][0]);
		driver.findElement(By.name("customer.lastName")).sendKeys(data[i+1][1]);
		driver.findElement(By.name("customer.address.street")).sendKeys(data[i+1][2]);
		driver.findElement(By.name("customer.address.city")).sendKeys(data[i+1][3]);
		driver.findElement(By.name("customer.address.state")).sendKeys(data[i+1][4]);
		driver.findElement(By.name("customer.address.zipCode")).sendKeys(data[i+1][5]);
		driver.findElement(By.name("customer.phoneNumber")).sendKeys(data[i+1][6]);
		driver.findElement(By.name("customer.ssn")).sendKeys(data[i+1][7]);
 		driver.findElement(By.name("customer.username")).sendKeys(data[i+1][8]);
 		driver.findElement(By.name("customer.password")).sendKeys(data[i+1][9]);
 		driver.findElement(By.name("repeatedPassword")).sendKeys(data[i+1][10]);
 			Thread.sleep(4000);
 			
 			//driver.findElement(By.xpath("//input[@value='Register']")).click();
 			Thread.sleep(6000);
 			
 		driver.close();
		
	}

	}	
	
	
}
