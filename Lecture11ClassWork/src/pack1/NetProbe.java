package pack1;

import java.io.*;
import java.net.*;
import java.util.*;

public class NetProbe {

	public static void saveFileFromURL(String url, File localCash) throws IOException {

		if (url == null || localCash == null) {
			throw new IllegalArgumentException();
		}

		File file = new File(localCash, getFileNameFromURL(url));

		URL urlAddress = new URL(url);

		HttpURLConnection connection = (HttpURLConnection) urlAddress.openConnection();

		try (OutputStream os = new FileOutputStream(file); InputStream is = connection.getInputStream()) {
			byte[] bufferArray = new byte[1024 * 1024];
			int readByte = 0;
			for (; (readByte = is.read(bufferArray)) > 0;) {
				os.write(bufferArray, 0, readByte);
			}
		} catch (IOException e) {
			throw e;
		}

	}

	public static String getFileNameFromURL(String url) {
		int position = url.lastIndexOf("/");
		String result = url.substring(position + 1);
		return result;
	}

	public static String getStringFromURL(String url) throws IOException {
		String result = "";
		URL urlAddres = new URL(url);
		HttpURLConnection connection = (HttpURLConnection) urlAddres.openConnection();

		try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {

			String temp="";
			
			for(;(temp=br.readLine())!=null;) {
				result+=temp+System.lineSeparator();
			}
			
		} catch (IOException e) {
			throw e;
		}

		return result;

	}

	public static Map<String,List<String>> getHeadFromUrl(String url) throws IOException{
		URL urlAddres = new URL(url);
		HttpURLConnection connection = (HttpURLConnection) urlAddres.openConnection();
		return connection.getHeaderFields();
	}
	
	
}
