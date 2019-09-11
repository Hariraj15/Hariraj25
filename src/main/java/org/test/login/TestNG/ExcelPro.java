package org.test.login.TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPro {
	public static Object[][] getData() throws IOException {
		File loc = new File("C:\\Users\\asus\\eclipse-Hari\\TestNG\\Sheet\\ExcetTest.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Data");
		Row rh =s.getRow(0);
		Object[][] obj=new Object[s.getPhysicalNumberOfRows()-1][rh.getPhysicalNumberOfCells()];
		for(int i=1;i<s.getPhysicalNumberOfRows();i++) {
			Row r=s.getRow(i);
			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
				Cell c= r.getCell(j);
				int type=c.getCellType();
				String name=null;
				if(type==1) {
					name = c.getStringCellValue();
				System.out.println(name);	
				}
				if(type==0) {
				 if(DateUtil.isCellDateFormatted(c)) {
					 Date d = c.getDateCellValue();
					 SimpleDateFormat fr = new SimpleDateFormat("yy-dd-mm");
					  name = fr.format(d);
			 }
				 else {
					 double dv = c.getNumericCellValue();
					 long l =(long)dv;
					 name=String.valueOf(l);
					 System.out.println(name);
					 
					}
				}
				obj[i-1][j]=name;
				
			}
			
			
		}
		return obj;
		
	}
	
}
