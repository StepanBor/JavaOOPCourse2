package pack1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ASCIIArtText {

	public static String getMessage(String text) {

		File fontArt = new File("3D-ASCII alphabet.txt");
					
		return textToASCII(text,fontArt);
		
		
		

	}

	public static String readFileToString(File file) throws FileNotFoundException {

		String textString = "";

		if (file.exists()) {

			try (BufferedReader readFile = new BufferedReader(new FileReader(file))) {

				String temp;
				while ((temp = readFile.readLine()) != null) {

					textString = textString + temp + System.lineSeparator();

				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			throw new FileNotFoundException();
		}

		return textString;

	}

	public static String textToASCII(String text, File fontArt) {

		String font = null;
		try {
			font = readFileToString(fontArt);
			// System.out.println(font);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String[] artLetters = font.split(",");
		
		Map<Character, String[]> textToArt = new TreeMap<>();

		String[] strArr= {"    ","    ","    ","    ","    ","    ","    ","    ","    ","    "};
		
		textToArt.put(' ', strArr);

		for (int i = 0; i < 26; i++) {

			textToArt.put((char) (65 + i), artLetters[i].split("\r\n"));
			textToArt.put((char) (97 + i), artLetters[i].split("\r\n"));
		}

		char[] tempChar = text.toCharArray();
		Character[] textArr = new Character[tempChar.length];

		String[] strTempArr= {"","","","","","","","","",""};
		
		for (int i = 0; i < textArr.length; i++) {
			textArr[i] = tempChar[i];
//			System.out.print(textArr[i]);

			for (int j = 0; j < strTempArr.length; j++) {
				if(textToArt.get(textArr[i])!=null) {
					
					strTempArr[j]=strTempArr[j]+textToArt.get(textArr[i])[j];
				}
			}
		}
		String temp="";
		for (String string : strTempArr) {
			temp+=string+"<br>"+System.lineSeparator();
		}
		
		return temp;
	}

}
