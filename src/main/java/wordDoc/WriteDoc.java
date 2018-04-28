package wordDoc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.testng.annotations.Test;

public class WriteDoc {


	@Test
	public void main() throws FileNotFoundException, IOException {

		@SuppressWarnings("resource")
		XWPFDocument document = new XWPFDocument();
		
		XWPFTable tab = document.createTable();
		XWPFTableRow row = tab.getRow(0);
		row.getCell(0).setText("Sl. No.");
		row.addNewTableCell().setText("Name");
		row.addNewTableCell().setText("Address");

		row = tab.createRow();
		//tab.set
		row.getCell(0).setText("1.");
		row.getCell(1).setText("Raman");
		row.getCell(2).setText("Pondicherry");

		document.write(new FileOutputStream("K:\\Idcards.docx"));
	}  
}
