package ExcellReadAndWrite;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws Exception {
		String filePath = "google.com/spreadsheets/d/1GEmSjOxcz2u6i2VmveEGwdGli6gLUQS_r-SkrjfSbkI/edit#gid=0";
		String sheetname = "Sheet1";
		
		FileInputStream file = new FileInputStream(filePath); 	//reads file
		
		Workbook excelFile = WorkbookFactory.create(file);		//specially designed for Excel File, reads excel file
		//XSSFWorkbook excelfile2 = new XSSFWorkbook(file);
		
		Sheet sheet = excelFile.getSheet(sheetname);			//gets the specific spread sheet from excel file
		// XSSFSheet sheet2 = excelfile2.get Sheet(sheetname);
		
		Cell cell = sheet.getRow(0).getCell(0);					//retrieves specific cell from spreadsheet
		
		String cellData = cell.getStringCellValue();			//converts the cell` vlaue to String data type
		
		System.out.println(cellData);
	}
	
}