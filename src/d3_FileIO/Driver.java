package d3_FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dosya yolu: ");
		String filePath = scanner.nextLine();
		File file = new File(filePath);
		if (!file.exists()) {
			try {
				Boolean fileCreated = file.createNewFile();
				if (fileCreated) {
					System.out.println("Dosya olusturuldu");
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(file);
			String line = null;
			do {

				line = scanner.nextLine();
				fileWriter.write(line);
				fileWriter.write(System.lineSeparator());// System.lineSeparator() her yaptigim enter da bir bosluk
															// birakiyor

			} while (!line.equals("quit"));

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		scanner.close();
		System.out.println("Dosya yazdirma basarili");
		System.out.println("Dosya Boyutu: " + filePath.length() + " byte");

	}

}
