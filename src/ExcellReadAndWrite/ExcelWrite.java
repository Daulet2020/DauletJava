package ExcellReadAndWrite;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWrite {
	
	public static void main(String[] args) throws Exception {
			String filePath = "google.com/spreadsheets/d/1GEmSjOxcz2u6i2VmveEGwdGli6gLUQS_r-SkrjfSbkI/edit#gid=0";
			String sheetname = "Sheet1";
			
			FileInputStream file = new FileInputStream(filePath); 	//reads file
			
			Workbook excelFile = WorkbookFactory.create(file);		//specially designed for Excel File, reads excel file
			//XSSFWorkbook excelfile2 = new XSSFWorkbook(file);
			
			Sheet sheet = excelFile.getSheet(sheetname);			//gets the specific spread sheet from excel file
			// XSSFSheet sheet2 = excelfile2.get Sheet(sheetname);
			
			Cell cell = sheet.getRow(1).getCell(0);					//retrieves specific cell from spreadsheet
			cell.setCellValue("Nurzat");   						//sets the value to the cell BUT it does not change the value in the excelsheet
			
			String cellData = cell.toString();
			System.out.println(cellData);
			
			
			
			
			
			
	}

}
