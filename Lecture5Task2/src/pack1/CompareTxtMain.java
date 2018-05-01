package pack1;

import java.io.*;


public class CompareTxtMain {

	public static void main(String[] args) {

		File dir = new File("tempDirectory");
		File textFileResult = new File("tempDirectory\\" + "Result.txt");
		String externalText1 = "";
		String externalText2 = "";
		String outputText = "";
		String text1 = "apple, pumpkin, pear, cucumber, tomato, garlic, cherry, vine";
		String text2 = "vine, brick, wood, pumpkin, pear, tomato, concrete, steel, cement, sand";

		createTxtFile(text1, "text1.txt");
		createTxtFile(text2, "text2.txt");
		File[] txtFiles = dir.listFiles();

		try (InputStream input1 = new FileInputStream(txtFiles[0].getAbsoluteFile())) {
			byte[] buffer = new byte[1024];
			int temp;
			for (; (temp = input1.read(buffer)) > 0;) {
				for (int i = 0; i < buffer.length; i++) {
					externalText1 = externalText1 + (char) buffer[i];
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}

		try (Reader input2 = new FileReader(txtFiles[1].getAbsoluteFile())) {
			char[] buffer = new char[1];
			int temp2;
			for (; (temp2 = input2.read(buffer)) > 0;) {
				for (int i = 0; i < buffer.length; i++) {
					externalText2 = externalText2 + (char) buffer[i];
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}

		System.out.println(externalText1);
		System.out.println(externalText2);

		String[] extText1 = externalText1.split(", ");
		String[] extText2 = externalText2.split(", ");

		for (int i = 0; i < extText1.length; i++) {
			for (int j = 0; j < extText2.length; j++) {
				if (extText2[j].equals(extText1[i])) {
					outputText = outputText + " " + extText1[i];
				}
			}
		}

		System.out.println(outputText);

		try (PrintWriter pw = new PrintWriter(textFileResult)) {
			pw.println(outputText);
			textFileResult.createNewFile();
		} catch (IOException e2) {
			System.out.println(e2);
		}

	}

	public static void createTxtFile(String text, String fileName) {

		File tempDirec = new File("tempDirectory");

		tempDirec.mkdir();

		File textFile = new File("tempDirectory\\" + fileName);
		try (PrintWriter pw = new PrintWriter(textFile)) {
			pw.println(text);
		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
		}
		try {
			textFile.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}
