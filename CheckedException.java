package package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args)throws InterruptedException,FileNotFoundException {
		Thread.sleep(1000);
		File file = new File("C:\\Testdata.xlsx");
		FileInputStream inputStream = new FileInputStream(file);

	}

}
