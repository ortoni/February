package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;




public class RExcel2 {
	public static void main(String[] args) throws IOException, InvalidFormatException {
		InputStream inp = new FileInputStream("./data/test.xlsx");
		Workbook wb = WorkbookFactory.create(inp);
		DataFormatter objDefaultFormat = new DataFormatter();
		FormulaEvaluator objFormulaEvaluator = new XSSFFormulaEvaluator((XSSFWorkbook) wb);

		org.apache.poi.ss.usermodel.Sheet sheet= wb.getSheetAt(0);
		Iterator<Row> objIterator = sheet.rowIterator();

		while(objIterator.hasNext()){

		    Row row = objIterator.next();
		    Cell cellValue = row.getCell(0);
		    objFormulaEvaluator.evaluate(cellValue); // This will evaluate the cell, And any type of cell will return string value
		    String cellValueStr = objDefaultFormat.formatCellValue(cellValue,objFormulaEvaluator);
		    System.out.println(cellValueStr);

		}
	}
}

/*switch (cell) {
				case CellType.:
					
					break;

				default:
					break;
				}*/