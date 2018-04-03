package utils;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;




public class RExcel3 {
	public static void main(String[] args) throws IOException, InvalidFormatException {
		XSSFWorkbook book = new XSSFWorkbook(new File("./data/test.xlsx"));
		XSSFSheet sheet = book.getSheetAt(0);
		int CellNum = sheet.getRow(0).getLastCellNum();
		int lastRowNum = sheet.getLastRowNum();
		DataFormatter objDefaultFormat = new DataFormatter();
		FormulaEvaluator objFormulaEvaluator = new XSSFFormulaEvaluator(book);

		Object[][] data = new Object[lastRowNum][CellNum];
		for (int i = 1; i <=lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < CellNum; j++) {
				XSSFCell cell = row.getCell(j);
				try {
					objFormulaEvaluator.evaluate(cell); // This will evaluate the cell, And any type of cell will return string value
					String cellValueStr = objDefaultFormat.formatCellValue(cell,objFormulaEvaluator);
					System.out.println(cellValueStr);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//System.out.println(data[i-1][j]);
			}
		}
		book.close();
	}
}

/*switch (cell) {
				case CellType.:

					break;

				default:
					break;
				}*/