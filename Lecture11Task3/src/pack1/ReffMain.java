package pack1;

import java.io.*;
import java.net.*;

public class ReffMain {

	public static void main(String[] args) {
		
		
		try {
			URL url=new URL("http://4pda.ru/");
			File html=GetHTML.getHTML(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	

}
