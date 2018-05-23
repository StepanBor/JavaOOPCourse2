package pack1;

import java.io.*;
import java.net.*;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ReffMain {

	public static void main(String[] args) {

		String html = "";

		File linksList = new File("links.txt");

		try {
			URL url = new URL("https://www.youtube.com/");
			html = GetHTML.getStringHTML(url);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Document htmlDoc = Jsoup.parse(html);

		Elements links = htmlDoc.select("a[href]");

		System.out.println(htmlDoc.title());

		try (PrintWriter er = new PrintWriter(linksList)) {

			for (Element element : links) {

				er.println(element);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
