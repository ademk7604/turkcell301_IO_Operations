package d2_FileAndPathClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Driver {
	public static void main(String[] args) {
		File file = new File("C:\\Java\\sample.txt");
		System.out.println(file.exists());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.isDirectory()); // dostya mi klasor mu?
		System.out.println(file.getAbsolutePath()); // dosyanin tam dizini C:\Java\sample.txt
		System.out.println(file.getParent()); // C:\Java
		System.out.println(file.length()); // dostyanin icinde BlockAction byte oldugunu dondurur
		System.out.println(new Date(file.lastModified())); // lastModified bize unixTime doner 1970 den beri gecen
															// zamanin milisaniye cinsinden karsiligi doner bunun
															// anlasilir olmasi icin DAte cons pareametre olarak
															// gonderiyoruz
		
		File file2 = new File("C:\\\\Java\\\\orenk.txt");
		/*if(!file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}*/
		
		if(file2.exists()) {
			boolean isDeleted = file2.delete();
			System.out.println(isDeleted);
		}
	}

}
