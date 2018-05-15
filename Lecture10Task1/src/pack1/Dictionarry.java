package pack1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;


public class Dictionarry {
	
	static Map<String,String> dict=new TreeMap<>();

	public Dictionarry() {
		super();
		dict.put("dog", "собака");
		dict.put("cat", "кіт");
		dict.put("mouse", "миша");
		dict.put("chicken", "курка");
		dict.put("fly", "муха");
	}
	
	public static void saveDict() {
		
		File fileOut = new File("Dictionary.txt");
				
		String engWords = dict.toString();

		try (Writer wrFile = new FileWriter(fileOut)) {
			fileOut.createNewFile();
			
			wrFile.write(engWords);
		
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}

}
