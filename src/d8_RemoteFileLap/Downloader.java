package d8_RemoteFileLap;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class Downloader {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("URL giriniz");
		String line = scanner.nextLine();
		scanner.close();
		try {
			URL url = new URL(line);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			InputStream inputStream = connection.getInputStream();
			FileOutputStream fileOutputStream = new FileOutputStream(String.valueOf(System.currentTimeMillis()));
			byte[] buffer = new byte[1024];
			int length = 0;
			while ((length = inputStream.read(buffer)) != -1) {
				fileOutputStream.write(Arrays.copyOfRange(buffer, 0, length));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
