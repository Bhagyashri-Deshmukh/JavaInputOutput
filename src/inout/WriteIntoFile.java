package inout;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteIntoFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream outputStream = new FileOutputStream("D:\\DHULE-COLLEGE\\temp\\temps.txt");
		outputStream.write(100);
		outputStream.close();
		System.out.println("File created with 100.");
	}

}
