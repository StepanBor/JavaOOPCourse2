package pack1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SymbolCountMain {

	public static void main(String[] args) {

		Set<Symbol> symbolSet = new TreeSet<Symbol>(new SymbolComparator());

		File extText = new File("text.txt");

		String text = null;
		try {
			text = readFileToString(extText);
			System.out.println(text);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		char[] tempChar = text.toCharArray();
		Character[] textArr = new Character[tempChar.length];

		for (int i = 0; i < textArr.length; i++) {
			textArr[i] = tempChar[i];
		}

		Map<Character, Integer> charMap = getMap(textArr);

		Iterator<Character> charIter = charMap.keySet().iterator();

		while (charIter.hasNext()) {
			Character temp = charIter.next();
			if ((temp >= 65 & temp < 90) | (temp >= (65 + 32) & temp < (90 + 32))) {

				symbolSet.add(new Symbol(temp, charMap.get(temp)));
			}

		}

		Iterator<Symbol> symbolIter = symbolSet.iterator();

		while (symbolIter.hasNext()) {
			System.out.println(symbolIter.next());

		}

		
		
	}

	public static String readFileToString(File file) throws FileNotFoundException {

		String textString = "";

		if (file.exists()) {

			try (Reader readFile = new FileReader(file)) {
				char[] buffer = new char[20];
				int temp;
				while ((temp = readFile.read(buffer)) > 0) {
//					readFile.read(buffer);
					for (int i = 0; i < buffer.length; i++) {
						textString = textString + buffer[i];
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			throw new FileNotFoundException();
		}

		return textString;

	}

	public static <K> TreeMap<K, Integer> getMap(K[] arr) {

		TreeMap<K, Integer> mapArr = new TreeMap<>();
		Integer temp = 1;
		for (int i = 0; i < arr.length; i++) {
			if (mapArr.containsKey(arr[i])) {

				mapArr.put(arr[i], mapArr.get(arr[i]) + 1);

			} else {
				mapArr.put(arr[i], temp);
			}
		}

		return mapArr;

	}

}
