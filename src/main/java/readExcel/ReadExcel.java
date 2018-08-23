package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
//	@Test
	public Object[][] read() throws IOException {
		XSSFWorkbook wbook = new XSSFWorkbook("./data.xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		int lastRowNum = sheet.getLastRowNum();
		System.out.println(lastRowNum);
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(lastCellNum);
		Object[][] data = new Object[lastRowNum][lastCellNum];
		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j <lastCellNum ; j++) {
				XSSFCell cell = row.getCell(j);
				data[i-1][j] = cell.getStringCellValue();
				System.out.println(data[i-1][j]);
			}
		}
		wbook.close();
		return data;
	}

}
