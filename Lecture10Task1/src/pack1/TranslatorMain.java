package pack1;

import java.util.Map;
import java.util.TreeMap;

public class TranslatorMain {

	public static void main(String[] args) {
		
		Map<String,String> dict=new TreeMap<>();
		
		dict.put("dog", "собака");
		dict.put("cat", "кіт");
		dict.put("mouse", "миша");
		dict.put("chicken", "курка");
		dict.put("fly", "муха");
		
		System.out.println(dict);
		
		Dictionarry dc=new Dictionarry();
		System.out.println(dc.li);
		

	}
	
	public static void addToDict(String Eng, String Ukr) {
		
		
		
	}

}
