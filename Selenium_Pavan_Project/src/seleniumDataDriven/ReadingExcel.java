package seleniumDataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		
		FileInputStream  file=new  FileInputStream("C://Users//sarker//Desktop//DataFile.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int rownums=sheet.getLastRowNum();                      //Retrieve the row number
		int columns=sheet.getRow(0).getLastCellNum();           //Retrieve the cell number
		
		System.out.println("Total number of row Present:"+rownums);
		System.out.println("Total number of column Present:"+columns);
		
		for(int r=0;r<=rownums;r++) {
			XSSFRow row=sheet.getRow(r);
			for(int c=1;c<=columns;c++) {
			String value=row.getCell(c).toString();
			System.out.println(value);
				
			}
		}
		
	}

}
