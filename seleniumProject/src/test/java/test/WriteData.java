package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteData {
  @Test
  public void f() throws Exception {
	  
	  File src = new File("C:\\Users\\Administrator\\eclipse-workspace\\seleniumProject\\src\\test\\resources\\TestData\\LoginData.xlsx");
	  FileInputStream fis = new FileInputStream(src);
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sheet1 = wb.getSheetAt(0);
	  
	  int rowCount = sheet1.getLastRowNum();
	  System.out.println("Total no of rows is : " +rowCount+ "\n");
	  
	  for(int i=0;i<rowCount;i++) {
		  
		  String Data = sheet1.getRow(i).getCell(0).getStringCellValue();
		  System.out.println("Test data from excell sheet is : " +Data);
		  
		  String Data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
		  System.out.println("Test data from excell sheet is : " +Data1);
		  
		  System.out.println("\n");
	  }
	  
	  
	  sheet1.getRow(0).createCell(3).setCellValue("Result");
	  sheet1.getRow(1).createCell(3).setCellValue("Valid User 01");
	  sheet1.getRow(2).createCell(3).setCellValue("Valid User 02");
	  sheet1.getRow(3).createCell(3).setCellValue("Valid User 03");
	  sheet1.getRow(4).createCell(3).setCellValue("Valid User 04");
	  sheet1.getRow(5).createCell(3).setCellValue("Valid User 05");
	  
	 
	  FileOutputStream fout = new FileOutputStream( new File("C:\\Users\\Administrator\\eclipse-workspace\\seleniumProject\\src\\test\\resources\\TestData\\LoginData.xlsx"));
	  
	  wb.write(fout);
	  fout.close();
	  
	 
  }
}
