package javabase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexceld2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File a=new File("C:\\Users\\cc\\Documents\\excelreadd2.xlsx");
		
		FileInputStream b=new FileInputStream(a);
		
		Workbook wb=new XSSFWorkbook(b);
		
		Sheet sh=wb.getSheet("Sheet1");
		
		int rwcount= sh.getLastRowNum()-sh.getFirstRowNum();
		
		for(int i=1;i<=rwcount;i++) {
		
			 Row rw = sh.getRow(i);
		
		Cell namecl=rw.getCell(0);
		
		System.out.print(namecl.getStringCellValue()+"\t");
		
		Cell cl=rw.getCell(1);
		
		System.out.println(cl.getStringCellValue());
		}
	}
}
