package pack1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TranslatorMain {

	public static void main(String[] args) {

		Dictionarry dict = new Dictionarry();

		File fileIn = new File("English.in");

		String engIn = "";

		try {
			engIn = readFileToString(fileIn);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(engIn);

		Dictionarry.dict.put("arm", "рука");

		try {
			String translatedText = readFileToString(translate(readFileToString(fileIn)));
			System.out.println(translatedText);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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

	public static File translate(String eng) throws IOException {

		File fileOut = new File("Ukranian.out");

		fileOut.createNewFile();

		String[] engWords = eng.split("[, ]");

		try (Writer wrFile = new FileWriter(fileOut)) {

			for (String word : engWords) {

				if (Dictionarry.dict.containsKey(word)) {
					wrFile.write(Dictionarry.dict.get(word) + " ");
				}
			}

		} catch (IOException e) {
			System.out.println(e);
		}

		return fileOut;

	}

}
