package inout;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = new FileInputStream("D:\\DHULE-COLLEGE\\temp\\temps.txt");
		int value = fileInputStream.read();
		
		System.out.println(value);
		
		fileInputStream.close();
	}

}
