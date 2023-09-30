package d5_StreamWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Driver {

	public static void main(String[] args) {

		// yaz();
		oku();
	}

	public static void oku() {
		File file = new File("deneme.txt");
		FileInputStream fileInputStream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileInputStream = new FileInputStream(file);
			inputStreamReader = new InputStreamReader(fileInputStream);
			bufferedReader = new BufferedReader(inputStreamReader);
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {// readLine satirin sonuna kadar okuyor
				System.out.println(line);
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
			if (inputStreamReader != null) {
				try {
					inputStreamReader.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}

		}

	}

	public static void yaz() {
		File file = new File("deneme.txt");
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file);
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
			outputStreamWriter.write("Streamlari, yazalim");
			outputStreamWriter.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());

		} finally {
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}

	}

}
