package ReadExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UitilitiFile {
	
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

}
