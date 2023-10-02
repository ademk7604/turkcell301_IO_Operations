package d05_FileIOLab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Driver {
	public static void main(String[] args) {
		
		File inputFile = new File("C:\\Java\\text3.txt");
		File OutputFile = new File("C:\\Java\\text3_Output.txt");
		if(inputFile.exists()) {
			FileInputStream fileInputStream = null;
			FileOutputStream fileOutputStream = null;
			try {
				fileInputStream = new FileInputStream(inputFile);
				fileOutputStream = new FileOutputStream(OutputFile);
				int c = 0;
				
				while((c = fileInputStream.read()) != -1) {
					char ch = (char)c;
					fileOutputStream.write(Character.toUpperCase(ch));
				}
			} catch(Exception e) {
				System.out.println(e.getMessage());
			} finally {
				if(fileInputStream != null) {
					try {
						fileInputStream.close();
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}
				}
				if(fileOutputStream != null) {
					try {
						fileOutputStream.close();
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}
				}
			} 
		}
	
	}

}
