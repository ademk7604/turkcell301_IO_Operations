package d6_ReadOfCharDizi;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
		File file = new File("C:\\Java\\text3.txt");
		if (file.exists()) {
			FileReader fileReader = null;
			try {
				fileReader = new FileReader(file);
				int c = 0;
				/*
				 * long now = System.currentTimeMillis(); while((c = fileReader.read()) != -1) {
				 * System.out.print((char)c); } System.out.println("---");
				 * System.out.println(System.currentTimeMillis()-now);
				 */
				// Performansli okuma yapabilmek icin bir char[] (c array)kullanacagiz

				long now = System.currentTimeMillis();
				char[] buffer = new char[1024]; // Array kullanmak daha mantikli
				int length = 0;
				StringBuilder builder = new StringBuilder();
				while ((length = fileReader.read(buffer)) != -1) {
					builder.append(Arrays.copyOfRange(buffer, 0, length));
				}

				System.out.println(builder.toString());
				System.out.println("---");
				System.out.println(System.currentTimeMillis() - now);

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (fileReader != null) {
					try {
						fileReader.close();
					} catch (IOException e) {

						e.printStackTrace();
					}
				}
			}
		}
	}

}
