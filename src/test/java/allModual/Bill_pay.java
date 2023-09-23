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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bill_pay {
	@Test
	public String[][] readexcel() throws InvalidFormatException, IOException {
		String[][]data=null;
		String filepath="D:\\sahil learn\\Automation testing\\Sahilselenium\\ParaBanking.xlsx";
		File file=new File(filepath);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		Sheet sheet=workbook.getSheet("Bill_pay");
		int r_num=sheet.getPhysicalNumberOfRows();
		System.out.println("Total Row number is "+r_num);
		data=new String[r_num][];
		for (int i = 0; i < data.length; i++) {
			Row row=sheet.getRow(i);
			int c_num=row.getPhysicalNumberOfCells();
			System.out.println("Cell is.."+c_num);
			
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
	public void bill_pay(WebDriver driver) throws InterruptedException, InvalidFormatException, IOException {
		
		String[][]data=readexcel();
		for (int i = 0; i < data.length; i++) {
			
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://parabank.parasoft.com/parabank/overview.htm");
//		
//		driver.findElement(By.name("username")).sendKeys("sahil12");
//		Thread.sleep(1000);
//		driver.findElement(By.name("password")).sendKeys("pass1");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
     	Thread.sleep(1000);
		
		driver.findElement(By.linkText("Bill Pay")).click();
		
		driver.findElement(By.name("payee.name")).sendKeys(data[i+1][0]);
		driver.findElement(By.name("payee.address.street")).sendKeys(data[i+1][1]);
		driver.findElement(By.name("payee.address.city")).sendKeys(data[i+1][2]);
		driver.findElement(By.name("payee.address.state")).sendKeys(data[i+1][3]);
		driver.findElement(By.name("payee.address.zipCode")).sendKeys(data[i+1][4]);
		driver.findElement(By.name("payee.phoneNumber")).sendKeys(data[i+1][5]);
		driver.findElement(By.name("payee.accountNumber")).sendKeys(data[i+1][6]);
		driver.findElement(By.name("verifyAccount")).sendKeys(data[i+1][7]);
		driver.findElement(By.name("amount")).sendKeys(data[i+1][8]);

		driver.findElement(By.xpath("//input[@value='Send Payment']")).click();
		Thread.sleep(2000);
		
		
		
		Thread.sleep(2000);
		
		String ss=driver.findElement(By.xpath("//h1[normalize-space()='Bill Payment Complete']")).getText();
		String s3=driver.findElement(By.xpath("//span[@ng-show=\"validationModel.account == 'empty'\"]")).getText();
		//String s2=driver.findElement(By.xpath("//span[@class='error']")).getText();
		
		if (ss.equals("Bill Payment Complete")) 
		{
			TakesScreenshot tS=(TakesScreenshot)driver;
			File file=tS.getScreenshotAs(OutputType.FILE);
			File trgFile=new File("D:\\ParaBank\\Screenshort\\bill(payment complete).png");
			FileUtils.copyFile(file, trgFile);
			System.out.println("test is passs(Bill pay)");
		}
		
//		else if (s1.equals("Bill Payment Complete")) 
//		{
//			System.out.println("test pass with invalid information");
//		}
		else if (s3.contains("The amount cannot be empty. ")) {
			TakesScreenshot tt=(TakesScreenshot)driver;
			File file1=tt.getScreenshotAs(OutputType.FILE);
			File trg=new File("D:\\ParaBank\\Screenshort\\emptyinfro.png");
			FileUtils.copyFile(file1, trg);
			System.out.println("test is pass bill pay(Empty info)");
			
		}
		else if (s3.contains("Account number is required")) {
			TakesScreenshot tS=(TakesScreenshot)driver;
			File file=tS.getScreenshotAs(OutputType.FILE);
			File trgFile=new File("D:\\ParaBank\\Screenshort\\bill(without acc).png");
			FileUtils.copyFile(file, trgFile);
			System.out.println("Test is pass bill pay(without acc)");
		}
		Thread.sleep(5000);
		
	}
	}
}
