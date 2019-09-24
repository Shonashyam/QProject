package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {

	Workbook wb;

	public ExcelFileUtility() throws Throwable {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Shyam\\eclipse-workspace\\StockAccounting\\InputData\\InputSheet.xlsx");
		wb = WorkbookFactory.create(fis);
	}

	// Row Count

	public int rowCount(String sheetname) {
		return wb.getSheet(sheetname).getLastRowNum();
	}

	// Column Count

	public int colCount(String sheetname, int row) {
		return wb.getSheet(sheetname).getRow(row).getLastCellNum();

	}

	// Reading The Data

	public String getData(String sheetname, int row, int column) {
		String data = "";
		if (wb.getSheet(sheetname).getRow(row).getCell(column).getCellType() == Cell.CELL_TYPE_NUMERIC)
		{

			int cellData = (int) wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
			data = String.valueOf(cellData);
		}
		else
		{
			data=wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		}
		return data;
	}
	

}
