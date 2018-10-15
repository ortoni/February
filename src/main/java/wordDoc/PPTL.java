package wordDoc;

import java.awt.Rectangle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.PictureData;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xslf.usermodel.SlideLayout;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFPictureData;
import org.apache.poi.xslf.usermodel.XSLFPictureShape;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFSlideLayout;
import org.apache.poi.xslf.usermodel.XSLFSlideMaster;
import org.apache.poi.xslf.usermodel.XSLFTextShape;

public class PPTL {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// create a new empty slide show
//		File f = new File();
		XMLSlideShow ppt = new XMLSlideShow();
		XSLFSlideMaster defaultMaster = ppt.getSlideMasters().get(0);
		XSLFSlideLayout titleLayout = defaultMaster.getLayout(SlideLayout.TITLE_AND_CONTENT);
		XSLFSlide slide = ppt.createSlide(titleLayout);
		java.awt.Dimension pgsize = ppt.getPageSize();
		int pgx = pgsize.width; // slide width in points
		int pgy = pgsize.height; // slide height in points
		System.out.println(pgx);
		System.out.println(pgy);

		byte[] pictureData = IOUtils.toByteArray(new FileInputStream("K://a.jpg"));
		XSLFPictureData pd = ppt.addPicture(pictureData, PictureData.PictureType.PNG);

		XSLFPictureShape picture = slide.createPicture(pd);
		picture.setAnchor(new Rectangle(0, 0, 720, 540));

		XSLFTextShape title1 = slide.getPlaceholder(0);
		title1.setText("Student Name");

		ppt.write(new FileOutputStream("K://ab.pptx"));

	}

}
