package pack1;

import java.io.*;
import java.net.*;

public class GetHTML {

	public static String getStringHTML(URL url) throws IOException {

		String temp2 = "";
		HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {

			String temp;

			while ((temp = br.readLine()) != null) {
				temp2 += temp + System.lineSeparator();

			}

		}

		return temp2;

	}

	public static File getFileHTML(URL url) throws IOException {

		File html = new File("HTML.htm");
		html.createNewFile();

		HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

		try (OutputStream os = new FileOutputStream(html); InputStream is = urlConnection.getInputStream()) {
			byte[] buffer = new byte[1024 * 1024];
			int temp;

			while ((temp = is.read(buffer)) != -1) {
				os.write(buffer, 0, temp);
			}

		}

		return html;

	}

}
