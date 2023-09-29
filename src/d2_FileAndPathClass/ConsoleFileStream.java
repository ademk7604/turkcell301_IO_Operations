package d2_FileAndPathClass;

import java.io.File;
import java.util.Scanner;

public class ConsoleFileStream {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Dosya Yolu:");
		String path = scanner.nextLine(); // C:\Java\ girdigimde burdaki butun dosyalari getirdi

		File file = new File(path);
		String[] icerik = file.list(); // list methodu klasor ise klasorun icerigini dondurmekte

		for (String string : icerik) {
			System.out.println(string);
		}

		/*
		 for (int i = 0; i < icerik.length; i++) { 
		 System.out.println(icerik[i]); 
		 }
		 */
		scanner.close();

	}

}
