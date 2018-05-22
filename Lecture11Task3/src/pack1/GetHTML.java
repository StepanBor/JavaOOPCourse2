package pack1;

import java.io.*;
import java.net.*;

public class GetHTML {

	// private URL url;
	//
	// public GetHTML(URL url) {
	// super();
	// this.url = url;
	// }
	//
	// public GetHTML() {
	// super();
	//
	// }

	public static File getHTML(URL url) throws IOException {

		File html = new File("HTML.htm");
		html.createNewFile();

		HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
				BufferedWriter bw = new BufferedWriter(new FileWriter(html))) {
			// try (OutputStream os = new FileOutputStream(html); InputStream is =
			// urlConnection.getInputStream()) {
			// byte[] buffer=new byte[1024*1024];
			String temp;
			
			while ((temp=br.readLine()) != null) {
				bw.write(temp+System.lineSeparator());
			}

		}

		return html;

	}

}
