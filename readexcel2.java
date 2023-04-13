package javabase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel2 {

	public static void main(String[] args) throws Exception {
		File f1=new File("E:\\excelread2.xlsx");
		
		FileInputStream kk=new FileInputStream(f1);
		
		Workbook wb=new XSSFWorkbook(kk);
		
		Sheet sh=wb.getSheet("sheet1");
		
		int rwCount= sh.getLastRowNum()-sh.getFirstRowNum();
		
		for(int i=1;i<=rwCount;i++) {
			
			Row rw=sh.getRow(i);
			
			Cell country=rw.getCell(0);
			System.out.print(country.getStringCellValue()+"\t");
			
			Cell capital=rw.getCell(1);
			
			System.out.print(capital.getStringCellValue()+"\t");
			
		}
	}

}
