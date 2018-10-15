package wordDoc;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.testng.annotations.Test;

public class WriteDoc {

	@Test
	public void main() throws FileNotFoundException, IOException, InvalidFormatException {

		@SuppressWarnings("resource")
		XWPFDocument document = new XWPFDocument();
		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run = paragraph.createRun();
		run.setText("Student Name");
		BufferedImage bimg1 = ImageIO.read(new File("K://a.jpg"));
		int width = bimg1.getWidth();
		int height = bimg1.getHeight();
		byte[] pictureData = IOUtils.toByteArray(new FileInputStream("K://a.jpg"));
		run.addPicture(null, height, "", width, height);
		document.write(new FileOutputStream("K:\\a.docx"));
		/*
		 * XWPFTable tab = document.createTable(); XWPFTableRow row = tab.getRow(0);
		 * row.getCell(0).setText("Sl. No."); row.addNewTableCell().setText("Name");
		 * row.addNewTableCell().setText("Address");
		 * 
		 * row = tab.createRow(); //tab.set row.getCell(0).setText("1.");
		 * row.getCell(1).setText("Raman"); row.getCell(2).setText("Pondicherry");
		 * 
		 * document.write(new FileOutputStream("K:\\Idcards.docx"));
		 */
	}
}
