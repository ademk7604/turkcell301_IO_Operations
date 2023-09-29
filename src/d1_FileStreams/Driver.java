package d1_FileStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Driver {
	public static void main(String[] args) {
		File file = new File("hello.txt");
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
			int c = 0; //read() methodu geriye -1 dondurdugu icin asagida kontrolu yapip o sekilde c yi char a kest edip yazdiriyoruz
			while((c = fileInputStream.read()) !=-1) {
				System.out.print((char)c);
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if(fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			}
		}
		
		
		
		/*
		FileOutputStream fileOutputStream=null;
		try {
			fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write("Merhaba".getBytes());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			
			if(fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}*/
	}

}
