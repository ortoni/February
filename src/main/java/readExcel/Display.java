package readExcel;

import java.io.IOException;

import org.testng.annotations.Test;

public class Display {
@Test
	public void main() throws IOException {
	ReadExcel ex = new ReadExcel();
	Object[][] read = ex.read();
	}

}
