package pack1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;

public class SerializationMain {

	public static void main(String[] args) {

		Student[] st = new Student[10];
		Student studProbe = new Student();
		try {
			st[0] = new Student("femail", "Maria", "Ponomarenko", "12:12:1998", "Ukraine", 2.5);
			st[1] = new Student("mail", "Vlad", "Dracula", "12:12:1212", "Romania", 5.0);
			st[2] = new Student("mail", "Petya", "Petrov", "10:08:1999", "Russia", 5.0);
			st[3] = new Student("mail", "Mahmud", "Mahmudov", "12:06:2001", "Egypt", 4.2);
			st[4] = new Student("femail", "Gulnara", "Karimova", "06:08:1999", "Kazahstan", 2.5);
			st[5] = new Student("mail", "Borya", "Vasiliev", "12:12:1991", "Ukraine", 2.5);
			st[6] = new Student("mail", "Nicolay", "Petrenko", "12:12:2000", "Ukraine", 3.0);
			st[7] = new Student("mail", "Bamba", "Balamba", "12:12:2000", "Uganda", 5.0);
			st[8] = new Student("mail", "Aleksandr", "Aleksandrov", "12:12:2000", "Ukraine", 4.2);
			st[9] = new Student("mail", "Akim", "Caraedov", "12:12:2000", "Mongolia", 4.2);
			studProbe = new Student("femail", "Gulnara", "Karimova", "06:08:1999", "Kazahstan", 2.5);
		} catch (ParseException e) {
			System.out.println("Wrong birthday date format");
		}

		Group gr = new Group("LM-02", 1, 10);

		for (int i = 0; i < st.length; i++) {
			gr.enrollStudent(st[i]);
		}

		System.out.println(gr);

		File lm02 = gr.serialize();

		try {
			lm02.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Group lm02Copy = null;
		try {
			lm02Copy = Group.deserialize(lm02);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println();

		System.out.println(lm02Copy);

	}

}
