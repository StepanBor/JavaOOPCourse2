package pack1;

import java.io.*;
import java.net.*;
import java.util.*;

public class URLAvailabilityTest {

	public static void main(String[] args) {

		createFileListURL();

		List<String> URLs = null;

		try {
			URLs = getURLsFromFile(new File("URLs.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Iterator<String> it = URLs.iterator();

		try {
			while (it.hasNext()) {
				String temp = it.next();
				URL url = new URL(temp);
				HttpURLConnection con = (HttpURLConnection) url.openConnection();
				System.out.println(temp + " " + con.getResponseCode() + " " + con.getResponseMessage());

			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

//		System.out.println(System.getProperty("os.name"));
		
	}

	public static List<String> getURLsFromFile(File file) throws FileNotFoundException {

		List<String> URLs = new ArrayList<>();

		if (file.exists()) {

			try (BufferedReader r = new BufferedReader(new FileReader(file))) {
				String temp;
				while ((temp = r.readLine()) != null) {

					URLs.add(temp);

				}

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
								
			}

			return URLs;
		} else {
			throw new FileNotFoundException();
		}

	}

	public static void createFileListURL() {

		String[] URLs = { "https://www.google.com.ua/", "https://prog.kiev.ua/forum/index.php/board,2.0.html",
				"https://4pda.ru/", "https://www.mobile-review.com/","https://www.gogLLLLle.com.ua/" };

		File URLList = new File("URLs.txt");

		try (Writer wr = new FileWriter(URLList)) {

			for (String str : URLs) {

				wr.write(str + System.lineSeparator());

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
