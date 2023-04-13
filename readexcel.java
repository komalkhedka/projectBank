package javabase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel {

	public static void main(String[] args) throws Exception {
		File f1=new File("E:\\excelread.xlsx");
		
		FileInputStream kk=new FileInputStream(f1);
		
		Workbook wb=new XSSFWorkbook(kk);
		
		Sheet sh=wb.getSheet("Sheet1");
		
		int rwCount=sh.getLastRowNum()-sh.getFirstRowNum();
		
		for(int i=1;i<=rwCount;i++) {
			
			Row rw=sh.getRow(i);
			
			Cell Namecl=rw.getCell(0);
				
				System.out.print( Namecl.getStringCellValue()+"\t");
			
				Cell bd=rw.getCell(1);
				System.out.println( bd.getNumericCellValue());
			}
		}
}
