package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileFilterMain {

	public static void main(String[] args) {

		File receiver = new File("Receiver");
		receiver.mkdir();
		File source = new File("k:\\");

		File[] fileList1 = source.listFiles(new MyFileFilter("doc", "pdf"));
		for (File tempFile : fileList1) {
			System.out.println(tempFile.toString());

			try (OutputStream output = new FileOutputStream("Receiver\\" + tempFile.getName());
					InputStream input = new FileInputStream(tempFile)) {
				byte[] tempBuff = new byte[1024];

				while (input.read(tempBuff) > 0) {

					output.write(tempBuff);
				}

			} catch (FileNotFoundException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	}

}
