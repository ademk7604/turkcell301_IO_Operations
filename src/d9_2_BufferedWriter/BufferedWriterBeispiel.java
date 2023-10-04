package d9_2_BufferedWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterBeispiel {
	public static void main(String[] args) {
		File file = new File("inputEinBufferedWriter.txt");
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		try {
			fileWriter = new FileWriter(file);
			bufferedWriter = new BufferedWriter(fileWriter);
			Scanner scanner = new Scanner(System.in);
			String line = null;
			while (!(line = scanner.nextLine()).equals("quit")) {
				bufferedWriter.write(line);
				bufferedWriter.flush(); // fiziksel olarak diske aninda kayit oluyor. 
				//Bu methodu yazmazsak quit yazana kadar bellekte sadece kayit ediliyor
			}
			scanner.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fileWriter != null) {
					fileWriter.close();
				}
				if (bufferedWriter != null) {
					bufferedWriter.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
