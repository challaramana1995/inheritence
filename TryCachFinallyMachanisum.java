package package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCachFinallyMachanisum {

	public static void main(String[] args) throws Exception {
try {
	Thread.sleep(1000);
	File file = new File("C:\\Testdata.xlsx");
	FileInputStream inputStream = new FileInputStream(file);
}catch(InterruptedException exception) {
	System.out.println(exception.toString());
}catch(FileNotFoundException exception) {
	System.out.println(exception.toString());
}finally {




	
}
	}

}
