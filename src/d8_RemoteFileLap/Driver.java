package d8_RemoteFileLap;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

public class Driver {
	// uzak kaynakli bir dosyayi kendi bilgisayarimiza nasil indirecegiz
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.w3.org/TR/WCAG10/wai-pageauth.txt");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			// URL sinifin openConnection methodu uzaktaki kaynaga bir baglanti acmaktadir
			InputStream inputStream = connection.getInputStream(); // uzaktaki kaynaga bir inputStream acmis olduk
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			char[] buffer = new char[1024];
			FileOutputStream fileOutputStream = new FileOutputStream("output1.txt");
			//StringBuilder builder = new StringBuilder();
			int length = 0;
			while ((length = inputStreamReader.read(buffer)) != -1) {
				//builder.append(Arrays.copyOfRange(buffer, 0, length)); // buufer o dan baslayip lenght e kadar alir add olarak ekler
				// Arrays.copyOfRange ile okudugumuz karakter kadar yeni bir array olusturduk ve
				// bunu bilder a ekledik
				fileOutputStream.write(new String(Arrays.copyOfRange(buffer, 0, length)).getBytes());
			}
			

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			
		}
	}

}
