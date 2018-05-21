package pack1;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
//		File localCash=new File("InetFiles");
//		
//		localCash.mkdirs();
//		
//		String url= "https://www.google.com.ua/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png";
//		
//		try {
//			NetProbe.saveFileFromURL(url, localCash);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		String url="https://rozetka.com.ua/mobile-phones/c80003/";
		String url="https://prog.kiev.ua/forum/";
//		String result="";
//		
//		result=NetProbe.getFileNameFromURL(url);
//		
//		System.out.println(result);

		try {
			Map<String,List<String>> respond=NetProbe.getHeadFromUrl(url);
			respond.forEach((key, value)->	System.out.println(key+"-"+value));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
